package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

//关于开发团队成员的管理：添加、删除等
public class TeamService {
	private static int counter = 1;//给numberId赋值
	private final int MAX_MEMBER = 5;//团队最大人数
	private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
	private int total;//记录开发团队中实际的人数
	
	public TeamService() {
		super();
	}
	
	//获取开发团队中的所有成员
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for(int i = 0;i < team.length;i++) {
			team[i] = this.team[i];
		}
		
		return team;
	}
	//将指定的员工添加到团队中
	public void addMember(Employee e) throws TeamException{
		//成员已满不能添加
		if(total >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		}
		//该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		//该成员已在团队中，无法添加
		if(isExist(e)) {
			throw new TeamException("该成员已在团队中，无法添加");
		}
		//该员工已是某团队成员  正在休假
		Programmer p = (Programmer)e;//一定不会出现类型转换异常
		if(p.getStatus().getNAME().equals("BUSY")) {
			throw new TeamException("该员工已是某团队成员");
		}else if("VACATION".equals(p.getStatus())) {
			throw new TeamException("该员正在休假，无法添加");
		}
		//团队至少只能有一名架构师
		//团队中至多只能有两名设计师
		//团队中至多只能有三名程序员
		//获取team中已有的成员中架构师，设计师，程序员的人数
		int numOfArch = 0,numOfDes = 0,numOfPro = 0;
		for(int i = 0;i < total;i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			}else if(team[i] instanceof Designer) {
				numOfDes++;
			}else if(team[i] instanceof Programmer) {
				numOfPro++;
			}
			
			if(p instanceof Architect) {
				if(numOfArch >= 1) {
					throw new TeamException("团队至少只能有一名架构师");
				}
			}else if(p instanceof Designer) {
				if(numOfDes >= 2) {
					throw new TeamException("团队中至多只能有两名设计师");
				}
			}else if(p instanceof Programmer) {
				if(numOfPro >= 3) {
					throw new TeamException("团队中至多只能有三名程序员");
				}
			}
		}
		
		
		//将p(或e)添加到现有的team中
		team[total++] = p;
		//p的属性赋值
		p.setStatus(Status.BUSY);
		p.setMemberld(counter++);
		
	}
	//判断指定的员工是否已经存在于现有的开发团队当中
	public boolean isExist(Employee e) {
		for(int i = 0;i < total;i++) {
			return team[i].getId() == e.getId();
		}
		return false; 
	}
	
	//从团队中删除成员
	public void removeMember(int memberId) throws TeamException {
		int i = 0;
		for(;i < total;i++) {
			if(team[i].getMemberld() == memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		//为找到指定memberId的情况
		if(i == total) {
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}
		//后一元素覆盖前一元素，实现删除操作
		for(int j = i + 1;j < total;j++) {
			team[j - 1] = team[j];
		}
		team[--total] = null;
		
	}
	
	
}

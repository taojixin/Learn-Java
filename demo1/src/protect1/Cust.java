package protect1;

public class Cust {
	//实例变量
	private String name;//开户人姓名
	private int id;//账户
	private String pwd;//密码
	private int money;//账户余额
	private int selfNum;//账户个人流水号
	//类变量
	static String bankName ="建设银行";
	static int allNum = 0;
	//构造方法(初始化对象)
	Cust(String name,int id,String pwd,int money){
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.money = money;
		allNum++;
	}
	//取款，从键盘输入金额，取款完成
	public void getMoney() {
		
	}
	//存款，从键盘输入金额，存款完成
	public void saveMoney() {
		
	}
	//查询
	public void search() {
		System.out.println("所属银行：" + bankName);
		System.out.println("您是本银行" + allNum + "个客户中的第" + selfNum + "个客户");
		System.out.println("用户名：" + name);
		System.out.println("用户账号：" + id);
		System.out.println("用户余额：" + money);
	}
	//修改密码,从键盘输入一个新密码，完成密码修改
	public void changePWD(String pwd) {
		this.pwd = pwd;
	}
	//计算建设银行所有银行账户的存款总额
	static double sum(Cust ... c) {
		double sum = 0;
		for(int i = 0;i < c.length;i++) {
			sum += c[i].money;
		}
		return sum;
	}
	//将所有账户的余额由多到少显示出来
	static void sort(Cust ...c) {
//		Cust[] newcust = new Cust[c.length];
//		int maxmoneyindex = 0;
//		for(int j = 0;j < c.length;j++) {
//			
//		}
		for(int i = 0;i < c.length - 1;i++) {
			if(c[i].money < c[i+1].money) {
				Cust temp = c[i+1];
				c[i+1] = c[i];
				c[i] = temp;
			}
		}
		for(int j = 0;j < c.length - 1;j++) {
			System.out.println(c[j].name + ", " + c[j].id + ", " + c[j].money );
		}
	}
	
}


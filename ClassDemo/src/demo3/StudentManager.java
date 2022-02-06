package demo3;

import java.util.*;
public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	//按学生学号查找学生
	public boolean searchStudent(String num) {
		boolean flag = false; //若students列表中存在student,则flag取值true,否则为false
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {//遍历students列表
			Student stu = iter.next();
			if(stu.getId().equals(num)) {//如果列表中已存在student
				System.out.println("列表中存在该学生！");
				System.out.println(stu.toString());
				flag = true;
				break;//跳出当前循环
			}
		}
		if(flag == false) {//若students列表中不存在学号为num的学生
			System.out.println("列表中不存在该学生!");
		}
		return flag;
	}
	//添加学生
	public void addStudent(Student student) {
		boolean flag = searchStudent(student.getId());
		if(flag == false) {//若students列表中不存在student，则添加student
			students.add(student);
			System.out.println("添加学生成功!");
		}
	}
	//按学生学号删除学生
    public void deleteStudent(String num) {
    	boolean flag = false; //若students列表中存在student,则flag取值true,否则为false
    	Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {//遍历students列表
			Student stu = iter.next();
			if(stu.getId().equals(num)) {//如果列表中存在学号为num的学生
				students.remove(stu); //从列表中删除该学生
				System.out.println("删除成功！");
				flag = true;
				break;//跳出当前循环
			}
		}
		if(flag == false) {//若students列表中不存在学号为num的学生
			System.out.println("列表中不存在该学生!");
		}
    }
    //输出所有学生信息
    public void allStudents() {
    	Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) { //遍历students列表
    		System.out.println(iter.next());
    	}
    }
   
}

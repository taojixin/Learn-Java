package IOflow;

import java.io.Serializable;

public class Student implements Serializable{
	private String name; //姓名
	private String id; //学号,且学生学号唯一
	private String score;
	public Student(String name,String id,String i){
		this.name = name;
		this.id = id;
		this.score = i;
	}
	public void setName(String name) { //设置姓名
		this.name = name;
	}
	public String getName() { //获取姓名
		return this.name;
	}
	public void setId(String id) { //设置学号
		this.id = id;
	}
	public String getId() { //获取学号
		return this.id;
	}
	public String getScore() {
		return this.score;
	}
	@Override
	public String toString() {//输出学生信息
//	    String message = "学生编号：" + this.getId() + ",学生姓名:"+this.getName() +",学生成绩："+this.getScore();
		String message = "学生编号：" + id + ",学生姓名:" + name + ",学生成绩：" + score;
		return message;
	}
	

}

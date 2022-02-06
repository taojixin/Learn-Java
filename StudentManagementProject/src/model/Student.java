package model;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private int age;
	private String email;
	private int chinese;
	private int math;
	private int english;
	
	public Student(int id,String name,int age,String email,int chinese,int math,int english) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	@Override
	public String toString() {
		String message = "ID:" + this.id + ",姓名:" + this.name + ",年龄:" + this.age + ",邮件:" + this.email + ",语文:" + this.chinese + ",数学:" + this.math + ",英语:" + this.english;
		return message;
	}
}

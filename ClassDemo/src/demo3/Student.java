package demo3;

public class Student {
	private String name; //姓名
	private String id; //学号,且学生学号唯一
	public Student(String name,String id){
		this.name = name;
		this.id = id;
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
	public String toString() {//输出学生信息
	    String message =  "学生姓名:"+this.getName() +";学生学号："+this.getId();
	    return message;
	}
	

}

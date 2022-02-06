package bean;

//Customer为实体对象，用来封装客户信息

public class Customer {
	private String name;//客户姓名
	private char gender;//性别
	private int age;//年龄
	private String phone;//电话号码
	private String email;//电子邮箱
	//构造器
	public Customer() {
		
	}
	public Customer(String name,char gender,int age,String phone,String email) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	//方法
		//get
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getEmail() {
		return this.email;
	}
		//set
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

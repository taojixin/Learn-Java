package javathreefeatures;

public class SuccessionOne {
	private int age;
	private String name;
	public SuccessionOne() {//构造器
		age = 18;
	}
	public SuccessionOne(int a,String b) {//构造器
		age = a;
		name = b;
	}
	
	void setAge(int i) {
		if(i >= 0 && i <= 130) {
			age = i;
			return;
		}
		System.out.println("输入有误！");
	}
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}

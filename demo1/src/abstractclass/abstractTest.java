package abstractclass;

public class abstractTest {
	public static void main(String[] args) {
		child a = new child(1,true);
		a.introduce();
		a.eat();
	}
}
abstract class people {
	int age;
	boolean sex;
	//构造器
	public people(int age,boolean sex) {
		this.age = age;
		this.sex = sex;
	}
	//抽象方法
	public abstract void eat();
	public abstract void introduce();
}

class child extends people {
	public child(int age,boolean sex) {
		super(age,sex);
		System.out.println("sdf");
	}
	
	public void eat() {
		System.out.println("吃健康的");
	}
	public void introduce() {
		System.out.println("age:" + age + ";sex" + sex);
	}
}
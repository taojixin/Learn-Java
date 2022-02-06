package javathreefeatures;

public class SuccessionTwo {
	public static void main(String[] args) {
		SuccessionOne s = new SuccessionOne(19,"sdf");//通过构造器初始化对象属性
		System.out.println(s.getAge());
		//s.age = 10;age权限private,只能在类的内部访问，此时所在位置在同一个包的不同类
		s.setAge(10);
		System.out.println(s.getAge() + "," + s.getName());
	}
}

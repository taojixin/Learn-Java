package five1;

public class Text {
	public static void main(String[] args) {
		MaxComDiv a = new MinComMul();
		int num = a.f(8, 7);//子类重写的方法，即求最大公倍数
		System.out.println(num);
	}
}

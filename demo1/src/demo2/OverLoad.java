package demo2;

public class OverLoad {
	public static void main(String[] args) {
		OverLoad test = new OverLoad();
		int sum = test.mol(8);
		int mult = test.mol(1, 2);
		String chars = "sfljd";
		test.mol(chars);
		System.out.println(sum + mult);
	}
	//方法的重载
	public int mol(int i) {
		return i*i;
	}
	public int mol(int a,int b) {
		return a*b;
	}
	public void mol(String c) {
		System.out.println(c);
	}
	
}


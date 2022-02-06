package demo1;

public class Exercise_2 {
	public static void main(String[] args) {
		long[] a = {1,2,3,4};
		long[] b = {100,200,300,400,500};
		b = a;
		System.out.println("数组b的长度：" + b.length);
		System.out.println("b[0]=" + b[0]);
	}
}

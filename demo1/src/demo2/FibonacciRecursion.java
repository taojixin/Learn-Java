package demo2;

public class FibonacciRecursion {
	public static void main(String[] args) {
		FibonacciRecursion a = new FibonacciRecursion();
		System.out.println(a.r(10));
	}
	public int r(int n) {
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 1;
		}else {
			return r(n - 1) + r(n - 2);
		}
	}
}

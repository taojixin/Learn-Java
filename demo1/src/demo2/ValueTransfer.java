package demo2;

public class ValueTransfer {
	public static void main(String[] args) {
		int m = 20;
		int n = 3;
		ValueTransfer v = new ValueTransfer();
		v.swap(m, n);
		System.out.println(m + "," + n);
	}
	public void swap(int m,int n) {
		int temp = m;
		m = n;
		n = temp;
	}
}

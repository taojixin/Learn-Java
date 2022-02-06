package demo2;

public class ValueTransferr {
	public static void main(String[] args) {
		Date date = new Date();
		ValueTransferr v = new ValueTransferr();
		v.swap(date);
		System.out.println(date.m + "," + date.n);
	}
	public void swap(Date date) {
		int temp = date.m;
		date.m = date.n;
		date.n = temp;
	}
}
class Date{
	int m = 30;
	int n = 3;
}

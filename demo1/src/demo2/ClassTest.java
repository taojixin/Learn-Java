package demo2;

public class ClassTest {
	public static void main(String[] args) {
		ClassTest meth = new ClassTest();
		System.out.println(meth.method(11,8));;
	}
	public int method(int m,int n) {
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m*n;
	}
}

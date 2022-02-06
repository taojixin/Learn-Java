package five1;

public class MinComMul extends MaxComDiv{
	public int f(int a,int b) {
		return (a * b) / super.f(a, b);
	}
}

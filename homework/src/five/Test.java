package five;

public class Test {
	public static void main(String[] args) {
		UserCompute a = new UserCompute();
		a.useCom(new Sum(), 10, 20);
		a.useCom(new Sub(), 10, 20);
		a.useCom(new Mul(), 10, 20);
		a.useCom(new Div(), 10, 20);
	}
	
}

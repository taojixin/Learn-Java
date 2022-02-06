package five;

public class UserCompute {
	public void useCom(Computer com,int one,int two) {
		int a = com.computer(one, two);
		System.out.println("计算结果：" + a);
	}
}

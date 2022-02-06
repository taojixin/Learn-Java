package demo4;

import java.util.Scanner;

public class computer3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char d = 'y';
		int num1;
		int num2;
		int result = 0;
		String c;
		do {
			System.out.println("请输入第一个数：");
			num1 = reader.nextInt();
			System.out.println("请输入第二个数：");
			num2 = reader.nextInt();
			System.out.println("请输入运算符（+、-、*、/）：");
			c = reader.next();
			switch(c) {
			case "+": result = add(num1,num2);
			break;
			case "-": result = reduce(num1,num2);
			break;
			case "*": result = mul(num1,num2);
			break;
			case "/": result = div(num1,num2);
			break;
			}
			System.out.println("结果为：" + num1 + c + num2 + "=" + result);
			System.out.println("是否退出（y/n）：");
			d = reader.next().charAt(0);
			}while(d == 'y');
		}
		public static int add(int num1,int num2) {
			return num1 + num2;
		}
		public static int reduce(int num1,int num2) {
			return num1 - num2;
		}
		public static int mul(int num1,int num2) {
			return num1 * num2;
		}
		public static int div(int num1,int num2) {
			return num1 / num2;
		}
}

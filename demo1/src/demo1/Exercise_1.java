package demo1;
import java.util.Scanner;
public class Exercise_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要转换的华氏摄氏：");
		int F = scan.nextInt();
		int C = (F-32)*5/9;
		System.out.println("转换成摄氏度位：" + C);
	}
}

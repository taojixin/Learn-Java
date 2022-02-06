package fafdsfsdf;

import java.util.Scanner;

public class mp {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入你要排序的个数：");
		int num = reader.nextInt();
		System.out.println("请输入这几个数：");
		int[] number = new int[num];
		for(int i = 0;i < number.length;i++) {
			number[i] = reader.nextInt();
		}
		for(int i = 0;i < number.length - 1;i++) {
			for(int j = 0;j < number.length - 1 - i;j++) {
				if(number[j] > number[j+1]) {
					int tem = number[j];
					number[j] = number[j+1];
					number[j+1] = tem;
				}
			}
		}
		for(int i = 0 ;i < number.length;i++) {
			System.out.println(number[i]);
		}
	}
}

package demo1;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arry = new int[]{12,324,546,4,32,243,23};
		for(int i = 0;i < arry.length;i++) {
			for(int j = 0;j < arry.length - 1 - i;j++) {
				if(arry[j] > arry[j+1]) {
					int temp = arry[j];
					arry[j] = arry[j+1];
					arry [j+1] = temp;
				}
			}
		}
		for(int i = 0;i < arry.length;i++) {
			System.out.println(arry[i]);
		}
	}
}

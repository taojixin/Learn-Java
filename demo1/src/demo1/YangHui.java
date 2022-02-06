package demo1;

public class YangHui {
	public static void main(String[] args) {
		//创建数组
		int[][] yangHui = new int[10][];
		//数组赋值
		for(int i = 0;i < yangHui.length;i++) {
			//确定每行的列数
			yangHui[i]= new int[i + 1];
			//给行首和行末赋值为1
			yangHui[i][0] = yangHui[i][i] = 1;
			//给中间的数组元素赋值
			if(i > 1) {
				for(int j = 1;j < yangHui[i].length - 1;j++)
				yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
				
			}
		}
		//遍历数组
		for(int i = 0;i < yangHui.length;i++) {
			for(int j = 0;j < yangHui[i].length;j++) {
				System.out.print(yangHui[i][j] + " ");
			}
			System.out.println();
		}
	}
}

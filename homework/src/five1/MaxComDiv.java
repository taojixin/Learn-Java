package five1;

public class MaxComDiv {
	public int f(int a,int b) {
		int temp;
		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}
		while(a!=0){
			temp =a ;
			a =b %a;
			b = temp;
		}
		return b;
	}
}

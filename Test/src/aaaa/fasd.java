package aaaa;

import java.util.StringTokenizer;

public class fasd {
	public static void main(String[] args) {
		String s1 = " we are students.   ";
		StringTokenizer n_s = new StringTokenizer(s1," ");
		StringBuffer s = new StringBuffer();
		int i = 1;
		while(n_s.hasMoreTokens()) {
			i++;
			s.append(n_s.nextToken());
		}
		System.out.println(s.toString());
		System.out.println(n_s);
//		System.out.println(s1.StringTokenizer());
	}
}

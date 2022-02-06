package IOflow;

import java.io.*;
public class HomeWorkOne {
	public static void main(String[] args){
		try {
			File f = new File("course.txt");
			FileReader fr = new FileReader(f);
			BufferedReader in = new BufferedReader(fr);
			String s;
			while((s = in.readLine()) != null) {
				System.out.println(s);
				
			}
			in.close();
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}

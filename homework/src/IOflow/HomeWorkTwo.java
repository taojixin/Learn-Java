package IOflow;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkTwo {
	public static void main(String[] args){
		try {
			File f = new File("student.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			
			Student s = new Student("张三","t001","100");
			Student s2 = new Student("李四","t002","99"); 
			Student s3 = new Student("王五","t003","90");
			
			List<Student> list = new ArrayList<Student>();
			list.add(s);
			list.add(s2);
			list.add(s3);
			
			for(int i = 0;i < list.size();i++) {
				
				out.writeObject(list.get(i));
			}
			
			out.close();
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}

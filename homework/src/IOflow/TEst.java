package IOflow;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 
public class TEst {
 
	public static void main(String[] args) throws IOException{
		Stu s1=new Stu("张三",23);
		Stu s2=new Stu("李四",24);
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("record.txt"));
		os.writeObject(s1);
		os.writeObject(s2);
		os.close();
 
	}
 
}
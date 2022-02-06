package controller;

import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Student;
import view.Frame;


public class Listener implements ActionListener{
	Frame f;//存放窗口的相关信息

	ArrayList coll = new ArrayList();//用于存储学生对象，当需要保存到文件时，依次将集合中的学生对象写入集合中
	int a = 0;//记录数
	
	
	public Listener(Frame frame) {
		f = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		String str = btn.getText();//将按钮的文本值存到str中
//判断点击的是哪个按钮
		
		if(str.equals("保存文件")) {
			boolean flag1 = true;
			
			//遍历每个集合中的学生对象的ID，若ID存在则对内容进行修改，不存在则进行提示
			Iterator<Student> iterator = coll.iterator();
			while (iterator.hasNext()){
	        	Student stu = iterator.next();
	        	if(stu.getId() == Integer.parseInt(f.text1.getText())) {
	        		stu.setName(f.text2.getText());
	        		stu.setAge(Integer.parseInt(f.text3.getText()));
	        		stu.setEmail(f.text4.getText());
	        		stu.setChinese(Integer.parseInt(f.text5.getText()));
	        		stu.setMath(Integer.parseInt(f.text6.getText()));
	        		stu.setEnglish(Integer.parseInt(f.text7.getText()));
	        		JOptionPane.showMessageDialog(null, "修改并保存成功","提示",JOptionPane.INFORMATION_MESSAGE);
	        		flag1 = false;
	        	}
	        }
			if(flag1) {
				JOptionPane.showMessageDialog(null, "此学生不存在,请确定ID是否正确","提示",JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}else if(str.equals("从文件读取")) {
			boolean flag2 = true;
			//遍历每个集合中的学生对象的ID，若ID存在则进行读取，不存在则进行提示
			Iterator<Student> iterator = coll.iterator();
	        while (iterator.hasNext()){
	        	Student stu = iterator.next();
	        	if(stu.getId() == Integer.parseInt(f.text1.getText())) {
	        		f.text2.setText(stu.getName());
	        		f.text3.setText(String.valueOf(stu.getId()));
	        		f.text4.setText(stu.getName());
	        		f.text5.setText(String.valueOf(stu.getChinese()));
	        		f.text6.setText(String.valueOf(stu.getMath()));
	        		f.text7.setText(String.valueOf(stu.getEnglish()));
	        		JOptionPane.showMessageDialog(null, "读取成功","提示",JOptionPane.INFORMATION_MESSAGE);
	        		flag2 = false;
	        	}
	        }
	        if(flag2) {
	        	JOptionPane.showMessageDialog(null, "没有此学生，请确定ID是否正确","提示",JOptionPane.INFORMATION_MESSAGE);
	        }
//将学生数据存到文件中去（即将集合中的对象依次写入文件中）
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
				
				
				for(int i = 0;i < coll.size();i++) {
					Student stud = (Student) coll.get(i);
					oos.writeObject(stud);
				}
				
				try {
					oos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}	
			
			} catch (IOException e2) {
				e2.printStackTrace();
			}
	        
	        
	        
		}else if(str.equals("上一条记录")) {
			int index = 0;
			for(int i = 0;i < coll.size();i++) {
				Student stud = (Student) coll.get(i);
				if(stud.getId() == Integer.parseInt(f.text1.getText())) {
					index = i;//获取到的index是此时ID学生对象在集合中的位置，用于后面获取此时ID学生对象的上一个学生对象
				}
			}
			if(index == 0) {//此时的学生对象是集合的第一个学生对象
				JOptionPane.showMessageDialog(null, "没有上一条了","提示",JOptionPane.INFORMATION_MESSAGE);
			}else {
				Student student = (Student) coll.get(index-1);//获取上一个学生对象
				f.text1.setText(String.valueOf(student.getId()));
				f.text2.setText(student.getName());
	    		f.text3.setText(String.valueOf(student.getId()));
	    		f.text4.setText(student.getName());
	    		f.text5.setText(String.valueOf(student.getChinese()));
	    		f.text6.setText(String.valueOf(student.getMath()));
	    		f.text7.setText(String.valueOf(student.getEnglish()));
			}
			
			
			
		}else if(str.equals("下一条记录")) {//和”上一条记录“的实现方法相同
			int index = 0;
			for(int i = 0;i < coll.size();i++) {
				Student stud = (Student) coll.get(i);
				if(stud.getId() == Integer.parseInt(f.text1.getText())) {
					index = i;
				}
			}
			if(index == (coll.size()-1)) {//此时的index是集合的最后一个对象下标
				JOptionPane.showMessageDialog(null, "没有下一条了","提示",JOptionPane.INFORMATION_MESSAGE);
			}else {
				Student student = (Student) coll.get(index + 1);//下一个学生对象
				f.text1.setText(String.valueOf(student.getId()));
				f.text2.setText(student.getName());
	    		f.text3.setText(String.valueOf(student.getId()));
	    		f.text4.setText(student.getName());
	    		f.text5.setText(String.valueOf(student.getChinese()));
	    		f.text6.setText(String.valueOf(student.getMath()));
	    		f.text7.setText(String.valueOf(student.getEnglish()));
			}
			
			
			
		}else if(str.equals("添加一个学生")) {
			
			if((f.text1.getText() != null) && (f.text2.getText() != null) && (f.text3.getText() != null) && (f.text4.getText() != null) && (f.text5.getText() != null) && (f.text6.getText() != null) && (f.text7.getText() != null)) {
				boolean flag= true;//用于判断此人是否已经添加
				//将学生存到集合中
				int _id = Integer.parseInt(f.text1.getText());
				int _age = Integer.parseInt(f.text3.getText());
				int _chinese = Integer.parseInt(f.text5.getText());
				int _math = Integer.parseInt(f.text6.getText());
				int _english = Integer.parseInt(f.text7.getText());
				
				//判断此id的人是否已经添加
				Iterator<Student> iterator = coll.iterator();
				while (iterator.hasNext()){
		        	Student stu = iterator.next();
		        	if(stu.getId() == _id) {
		        		JOptionPane.showMessageDialog(null, "此人已存在","提示",JOptionPane.INFORMATION_MESSAGE);
		        		flag = false;
		        	}
		        }
				
				if(flag) {
					coll.add(new Student(_id,f.text2.getText(),_age,f.text4.getText(),_chinese,_math,_english));
					JOptionPane.showMessageDialog(null, "添加成功","提示",JOptionPane.INFORMATION_MESSAGE);
					//记录数 +1
					a++;
					f.label9.setText("" + a);
					flag = true;
					f.text1.setText(null);
					f.text2.setText(null);
		    		f.text3.setText(null);
		    		f.text4.setText(null);
		    		f.text5.setText(null);
		    		f.text6.setText(null);
		    		f.text7.setText(null);
				}
				
				
//将学生数据存到文件中去（即将集合中的对象依次写入文件中）
				
				try {
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
					
					
					for(int i = 0;i < coll.size();i++) {
						Student stud = (Student) coll.get(i);
						oos.writeObject(stud);
					}
					
					try {
						oos.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}	
				
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				
				

				
		        try {
		        	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));

		        	Student p;
					try {
						p = (Student) ois.readObject();
			            System.out.println(p);
					} catch (ClassNotFoundException e2) {
						e2.printStackTrace();
					}
					
		            try {
		            	ois.close();
		            } catch (IOException e1) {
		            	e1.printStackTrace();
		            }
		        
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }
				
				
				//这里写入txt文件可读
//				FileWriter fw = null;
//		        try {
//		            //1.提供File类的对象，指明写出到的文件
//		            File file = new File("hello1.txt");
//
//		            //2.提供FileWriter的对象，用于数据的写出
//		            fw = new FileWriter(file);
//
//		            //3.写出的操作
//		            for(int i = 0;i < coll.size();i++) {
//						Student stud = (Student) coll.get(i);
//						fw.write("ID:" + stud.getId() + ",姓名:" + stud.getName() + ",年龄:" + stud.getEmail() + ",邮箱:" + stud.getEmail() + ",语文:" + stud.getChinese() + ",数学:" + stud.getMath() + ",英语:" + stud.getEnglish() + "\n");
//					
//					}
//		        } catch (IOException e3) {
//		            e3.printStackTrace();
//		        } finally {
//		            //4.流资源的关闭
//		            if(fw != null){
//
//		                try {
//		                    fw.close();
//		                } catch (IOException e3) {
//		                    e3.printStackTrace();
//		                }
//		            }
//		        }
		        
				
				
				
			}else {
				JOptionPane.showMessageDialog(f.frame, "有信息未输入","提示",JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(str.equals("删除当前学生")) {
			String strid = f.text1.getText();
			int intid = Integer.parseInt(strid);
			int num = 0;
			int cun = coll.size();
			Iterator<Student> iterator = coll.iterator();
	        while (iterator.hasNext()){
	        	Student stu = iterator.next();
	        	num++;
	        	if(stu.getId() == intid) {
	        		a--;
	        		num--;
	        		f.label9.setText("" + a);
	        		iterator.remove();
	        		JOptionPane.showMessageDialog(null, "删除成功","提示",JOptionPane.INFORMATION_MESSAGE);
	        		f.text1.setText(null);
					f.text2.setText(null);
		    		f.text3.setText(null);
		    		f.text4.setText(null);
		    		f.text5.setText(null);
		    		f.text6.setText(null);
		    		f.text7.setText(null);
	        	}
	        }
	        if(num == cun) {
	        	System.out.println(num);
	        	JOptionPane.showMessageDialog(null, "没有此人","提示",JOptionPane.INFORMATION_MESSAGE);
	        	num = 0;
	        }
		}
		
	}

}

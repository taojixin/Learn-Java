package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import www.gui.DeleteExercise;
import www.gui.GenerateTest;
import www.gui.Home;
import www.gui.LookExercise;
import www.gui.ModifyExercise;
import www.gui.Select;

public class ListenerEvent implements ActionListener{
	Home f;
	public ListenerEvent(Home home) {
		f = home;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
		if(str.equals("所有试题")) {
//			连接数据库
			try
			{ 
				Class.forName("com.mysql.jdbc.Driver");   //加载MYSQL JDBC驱动程序  
			 } 
			catch (Exception e1) 
			{
				System.out.print("加载Mysql驱动程序时出错!"); 
			    e1.printStackTrace(); 
			}
			try 
			{ 
				Connection connect = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/selectsystem?useSSL=false","root","123456");
				//连接URL为  jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码 
				Statement stmt = connect.createStatement(); 
				ResultSet rs = stmt.executeQuery("SELECT * FROM exercises;");
				Object[][] data = new Object[100][7];
			    while (rs.next())
				 { 
			    	int num = rs.getInt("id");
			    	data[num-1][0] = rs.getInt("id")+"";
			    	data[num-1][1] = rs.getString("content");
			    	data[num-1][2] = rs.getString("answer1");
			    	data[num-1][3] = rs.getString("answer2");
			    	data[num-1][4] = rs.getString("answer3");
			    	data[num-1][5] = rs.getString("answer4");
			    	data[num-1][6] = rs.getString("right_answer");
			     }
			    connect.close();
			    LookExercise dialog = new LookExercise(data);
			    dialog.setVisible(true);
		     } 
			catch (Exception e1) 
			{ 
				System.out.print("获取数据错误!");
				e1.printStackTrace(); 
			}
			
			
		} else if(str.equals("录入试题")) {
			f.dialog2.setVisible(true);
			
		} else if (str.equals("删除试题")) {
			DeleteExercise dialog1 = new DeleteExercise();
			dialog1.setVisible(true);
		} else if (str.equals("修改试题")){
			ModifyExercise dialog3 = new ModifyExercise();
			dialog3.setVisible(true);
		} else if (str.equals("返回")) {
			f.setVisible(false);
			Select newSelect = new Select();
			newSelect.setVisible(true);
		}
		
	}

}

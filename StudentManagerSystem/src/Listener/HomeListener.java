package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;

import gui.AddStu;
import gui.CheckStu;
import gui.DelStu;
import gui.Home;
import gui.ModiStu;

public class HomeListener implements ActionListener{
	Home home;
	public HomeListener(Home home) {
		this.home = home;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
		if(str.equals("添加学生信息")) {
			AddStu addStu = new AddStu();
			addStu.setVisible(true);
		} else if(str.equals("删除学生信息")) {
			DelStu delStu = new DelStu();
			delStu.setVisible(true);
		} else if(str.equals("修改学生信息")) {
			ModiStu modiStu = new ModiStu();
			modiStu.setVisible(true);
		}else if(str.equals("查询所有学生")) {
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
				Connection connect = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/stumanager?useSSL=false","root","123456");
				//连接URL为  jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码 
				Statement stmt = connect.createStatement(); 
				ResultSet rs = stmt.executeQuery("SELECT * FROM message;");
				Object[][] data = new Object[100][6];
			    while (rs.next())
				 { 
			    	int num = rs.getInt("id");
			    	data[num-1][0] = rs.getString("stuId");
			    	data[num-1][1] = rs.getString("stuName");
			    	data[num-1][2] = rs.getString("stuSex");
			    	data[num-1][3] = rs.getString("stuBirthday");
			    	data[num-1][4] = rs.getString("stuPhone");
			    	data[num-1][5] = rs.getString("stuDorm");
			     }
			    connect.close();
			    CheckStu dialog = new CheckStu(data);
			    dialog.setVisible(true);
		     } 
			catch (Exception e1) 
			{ 
				System.out.print("获取数据错误!");
				e1.printStackTrace(); 
			}
		}else if(str.equals("退出系统")) {
			home.setVisible(false);
		}
	}

}

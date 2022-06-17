package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import www.gui.Home;
import www.gui.Login;
import www.gui.LookExercise;

public class LoginListener implements ActionListener{
	Login login;
	public LoginListener(Login login) {
		this.login = login;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
		if(str.equals("登录")) {
			String userName = login.textField.getText();
			String password = login.passwordField.getText();
			String sqlUserName = null;
			String sqlUserPassword = null;
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
				Connection connect = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/jdbcTest?useSSL=false","root","123456");
				//连接URL为  jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码 
				Statement stmt = connect.createStatement(); 
				ResultSet rs = stmt.executeQuery("SELECT * FROM users;");
			    while (rs.next())
				 { 
			    	sqlUserName = rs.getString("username");
			    	sqlUserPassword = rs.getString("userpassword");
			     }
			    connect.close();
		     } 
			catch (Exception e1) 
			{ 
				System.out.print("获取数据错误!");
				e1.printStackTrace(); 
			}
//			判断密码是否正确
			if (userName.equals(sqlUserName) && password.equals(sqlUserPassword)) {
				login.setVisible(false);
				Home frame = new Home();
			    frame.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "密码或用户名错误！","提示",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}

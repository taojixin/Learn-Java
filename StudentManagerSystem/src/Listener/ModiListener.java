package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import gui.ModiStu;

public class ModiListener implements ActionListener{
	ModiStu modiStu;
	public ModiListener(ModiStu modiStu) {
		this.modiStu = modiStu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
		if(str.equals("查询")) {
			String stuId = modiStu.textField.getText();
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
				String sql = "SELECT * FROM message WHERE stuId = ?;";
//				获取pstmt对象
				PreparedStatement pstmt = connect.prepareStatement(sql);
//				设置？值
				pstmt.setString(1, stuId);
//				执行sql语句
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					modiStu.textField_1.setText(rs.getString("stuName"));
					modiStu.textField_2.setText(rs.getString("stuSex"));
					modiStu.textField_3.setText(rs.getString("stuBirthday"));
					modiStu.textField_4.setText(rs.getString("stuPhone"));
					modiStu.textField_5.setText(rs.getString("stuDorm"));
				} else {
					JOptionPane.showMessageDialog(null, "该试题不存在！","提示",JOptionPane.INFORMATION_MESSAGE);
					modiStu.textField_1.setText("");
					modiStu.textField_2.setText("");
					modiStu.textField_3.setText("");
					modiStu.textField_4.setText("");
					modiStu.textField_5.setText("");
					modiStu.textField.setText("");
				}
				while (rs.next())
				 {
					modiStu.textField_1.setText(rs.getString("stuName"));
					modiStu.textField_2.setText(rs.getString("stuSex"));
					modiStu.textField_3.setText(rs.getString("stuBirthday"));
					modiStu.textField_4.setText(rs.getString("stuPhone"));
					modiStu.textField_5.setText(rs.getString("stuDorm"));
			     }
			    connect.close();
		     } 
			catch (Exception e1) 
			{ 
				System.out.print("获取数据错误!");
				e1.printStackTrace(); 
			}
		} else if (str.equals("修改")) {
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
				String sql = "UPDATE message SET stuId=?,stuName=?,stuSex=?,stuBirthday=?,stuPhone=?,stuDorm=? WHERE stuId=?;";
//				获取pstmt对象
				PreparedStatement pstmt = connect.prepareStatement(sql);
//				设置？值
				pstmt.setString(1, modiStu.textField.getText());
				pstmt.setString(2, modiStu.textField_1.getText());
				pstmt.setString(3, modiStu.textField_2.getText());
				pstmt.setString(4, modiStu.textField_3.getText());
				pstmt.setString(5, modiStu.textField_4.getText());
				pstmt.setString(6, modiStu.textField_5.getText());
				pstmt.setString(7, modiStu.textField.getText());
//				执行sql语句
				int rs = pstmt.executeUpdate();
				if(rs == 1) {
					JOptionPane.showMessageDialog(null, "修改成功！","提示",JOptionPane.INFORMATION_MESSAGE);
					modiStu.textField_1.setText("");
					modiStu.textField_2.setText("");
					modiStu.textField_3.setText("");
					modiStu.textField_4.setText("");
					modiStu.textField_5.setText("");
					modiStu.textField.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "修改失败！","提示",JOptionPane.INFORMATION_MESSAGE);
				}
			    connect.close();
		     } 
			catch (Exception e1) 
			{ 
				System.out.print("获取数据错误!");
				e1.printStackTrace(); 
			}
		}
	}

}

package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import gui.AddStu;

public class AddStuListener implements ActionListener{
	AddStu addStu;
	public AddStuListener(AddStu addStu) {
		this.addStu = addStu;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
		if(str.equals("添加")) {
			String stuId = addStu.textField.getText();
			String stuName = addStu.textField_1.getText();
			String stuSex = addStu.textField_2.getText();
			String stuBirthday = addStu.textField_3.getText();
			String stuPhone = addStu.textField_4.getText();
			String stuDorm = addStu.textField_5.getText();
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
				String sql = "INSERT INTO message(stuId,stuName,stuSex,stuBirthday,stuPhone,stuDorm) VALUES (?,?,?,?,?,?);";
//				获取pstmt对象
				PreparedStatement pstmt = connect.prepareStatement(sql);
//				设置？的值
				pstmt.setString(1, stuId);
				pstmt.setString(2, stuName);
				pstmt.setString(3, stuSex);
				pstmt.setString(4, stuBirthday);
				pstmt.setString(5, stuPhone);
				pstmt.setString(6, stuDorm);
//				执行sql语句
				int rs = pstmt.executeUpdate();
//				判断是否成功
				if(rs == 1){
			        System.out.println("录入成功~");
			        JOptionPane.showMessageDialog(null, "添加成功！","成功",JOptionPane.INFORMATION_MESSAGE);
//			        清空文本框
			        addStu.textField.setText("");
			        addStu.textField_1.setText("");
			        addStu.textField_2.setText("");
			        addStu.textField_3.setText("");
			        addStu.textField_4.setText("");
			        addStu.textField_5.setText("");
			   }else{
				   JOptionPane.showMessageDialog(null, "添加失败！","成功",JOptionPane.INFORMATION_MESSAGE);
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

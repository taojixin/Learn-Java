package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import www.gui.EnterExercise;
import www.test.testOne;

public class EnterListener implements ActionListener{
	EnterExercise ee;
	public EnterListener(EnterExercise ee) {
		this.ee = ee;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
//		录入试题按钮
		if(str.equals("录入试题")) {
			String content = ee.textField.getText();
			String answerA = ee.answera.getText();
			String answerB = ee.answerb.getText();
			String answerC = ee.answerc.getText();
			String answerD = ee.answerd.getText();
			String rightAnswer = ee.answer.getText();
//			连接数据库
			try
			{ 
				Class.forName("com.mysql.jdbc.Driver");   //加载MYSQL JDBC驱动程序  
				System.out.println("成功加载Mysql驱动程序!"); 
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
				System.out.println("成功连接Mysql服务器!");
				String sql = "INSERT INTO exercises(content,answer1,answer2,answer3,answer4,right_answer) VALUES(?, ?,?,?,?,?);";
//				获取pstmt对象
				PreparedStatement pstmt = connect.prepareStatement(sql);
//				设置？的值
				pstmt.setString(1, content);
				pstmt.setString(2, answerA);
				pstmt.setString(3, answerB);
				pstmt.setString(4, answerC);
				pstmt.setString(5, answerD);
				pstmt.setString(6, rightAnswer);
//				执行sql语句
				int rs = pstmt.executeUpdate();
//				判断是否成功
				if(rs == 1){
			        System.out.println("录入成功~");
			        JOptionPane.showMessageDialog(null, "录入成功！","成功",JOptionPane.INFORMATION_MESSAGE);
//			        清空文本框
			        ee.textField.setText("");
			        ee.answera.setText("");
			        ee.answerb.setText("");
			        ee.answerc.setText("");
			        ee.answerd.setText("");
			        ee.answer.setText("");
			   }else{
			        System.out.println("录入失败~");
			   }
		     } 
			catch (Exception e1) 
			{ 
				System.out.print("获取数据错误!");
				e1.printStackTrace(); 
			}
		} else {
			
		}
	}

}

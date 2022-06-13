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

import www.gui.LookExercise;
import www.gui.ModifyExercise;

public class ModifyListener implements ActionListener{
	ModifyExercise me;
	
	public ModifyListener(ModifyExercise modify) {
		this.me = modify;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		String str = btn.getText();//将按钮的文本值存到str中
		if(str.equals("查询")) {
			String exeNum = me.textField.getText();
			int exerciseNum = Integer.parseInt(exeNum);
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
				String sql = "SELECT * FROM exercises WHERE id=?;";
//				获取pstmt对象
				PreparedStatement pstmt = connect.prepareStatement(sql);
//				设置？值
				pstmt.setInt(1, exerciseNum);
//				执行sql语句
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					me.textField_1.setText(rs.getString("content"));
			    	me.textField_2.setText(rs.getString("answer1"));
			    	me.textField_3.setText(rs.getString("answer2"));
			    	me.textField_4.setText(rs.getString("answer3"));
			    	me.textField_5.setText(rs.getString("answer4"));
			    	me.textField_6.setText(rs.getString("right_answer"));
				} else {
					JOptionPane.showMessageDialog(null, "该试题不存在！","提示",JOptionPane.INFORMATION_MESSAGE);
					me.textField_1.setText("");
			    	me.textField_2.setText("");
			    	me.textField_3.setText("");
			    	me.textField_4.setText("");
			    	me.textField_5.setText("");
			    	me.textField_6.setText("");
					me.textField.setText("");
				}
				while (rs.next())
				 {
			    	me.textField_1.setText(rs.getString("content"));
			    	me.textField_2.setText(rs.getString("answer1"));
			    	me.textField_3.setText(rs.getString("answer2"));
			    	me.textField_4.setText(rs.getString("answer3"));
			    	me.textField_5.setText(rs.getString("answer4"));
			    	me.textField_6.setText(rs.getString("right_answer"));
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
				Connection connect = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/jdbcTest?useSSL=false","root","123456");
				//连接URL为  jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码 
				String sql = "UPDATE exercises SET content=?,answer1=?,answer2=?,answer3=?,answer4=?,right_answer=? WHERE id=?;";
//				获取pstmt对象
				PreparedStatement pstmt = connect.prepareStatement(sql);
//				设置？值
				pstmt.setString(1, me.textField_1.getText());
				pstmt.setString(2, me.textField_2.getText());
				pstmt.setString(3, me.textField_3.getText());
				pstmt.setString(4, me.textField_4.getText());
				pstmt.setString(5, me.textField_5.getText());
				pstmt.setString(6, me.textField_6.getText());
				pstmt.setInt(7, Integer.parseInt(me.textField.getText()));
//				执行sql语句
				int rs = pstmt.executeUpdate();
				if(rs == 1) {
					JOptionPane.showMessageDialog(null, "修改成功！","提示",JOptionPane.INFORMATION_MESSAGE);
					me.textField_1.setText("");
			    	me.textField_2.setText("");
			    	me.textField_3.setText("");
			    	me.textField_4.setText("");
			    	me.textField_5.setText("");
			    	me.textField_6.setText("");
					me.textField.setText("");
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

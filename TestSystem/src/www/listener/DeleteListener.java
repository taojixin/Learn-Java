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

import www.gui.DeleteExercise;
import www.gui.GenerateTest;
import www.gui.LookExercise;

public class DeleteListener implements ActionListener{
	DeleteExercise de;
	
	public DeleteListener(DeleteExercise del) {
		this.de = del;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
		if(str.equals("删除")) {
			String number = de.textField.getText();
			if (number.equals("")) {
				JOptionPane.showMessageDialog(null, "题号不能为空且必须为数字！","提示",JOptionPane.INFORMATION_MESSAGE);
			} else if(number.equals("0")) {
				JOptionPane.showMessageDialog(null, "题号不能为0！","提示",JOptionPane.INFORMATION_MESSAGE);
			} else {
//				连接数据库
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
					String sql = "DELETE FROM exercises WHERE id=?;";
//					获取pstmt对象
					PreparedStatement pstmt = connect.prepareStatement(sql);
//					设置？值
					int num = Integer.parseInt(de.textField.getText());
					pstmt.setInt(1, num);
//					执行sql语句
					int rs = pstmt.executeUpdate();
					if (rs == 1) {
						JOptionPane.showMessageDialog(null, "删除成功！","提示",JOptionPane.INFORMATION_MESSAGE);
						de.textField.setText("");
					} else {
						JOptionPane.showMessageDialog(null, "该试题不存在！","提示",JOptionPane.INFORMATION_MESSAGE);
						de.textField.setText("");
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

}

package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import www.gui.GenerateTest;
import www.gui.InputNum;
import www.gui.Select;

public class InputListener implements ActionListener{
	InputNum input;
	public InputListener(InputNum input) {
		this.input = input;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
//		录入试题按钮
		if(str.equals("生成试题")) {
//			判断输入是否为空；为空则提示
			if (input.textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "题号不能为空！","提示",JOptionPane.INFORMATION_MESSAGE);
			} else {
//				获取需要生成的试题数
				int number = 0;
				try {
					number = Integer.parseInt(input.textField.getText());
				} catch (Exception e4) {
					JOptionPane.showMessageDialog(null, "题号不能为字符！","提示",JOptionPane.INFORMATION_MESSAGE);
				}
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
					Connection connect = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/selectsystem?useSSL=false","root","123456");
					//连接URL为  jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码 
					String sql = "SELECT * FROM exercises ORDER BY RAND() LIMIT ?;";
//					获取pstmt对象
					PreparedStatement pstmt = connect.prepareStatement(sql);
//					设置？值
					pstmt.setInt(1, number);
//					执行sql语句
					ResultSet rs = pstmt.executeQuery();
					int num = number;
					Object[][] data = new Object[number][7];
					while (rs.next()) {
						data[number-num][0] = rs.getString("content");
				    	data[number-num][1] = rs.getString("answer1");
				    	data[number-num][2] = rs.getString("answer2");
				    	data[number-num][3] = rs.getString("answer3");
				    	data[number-num][4] = rs.getString("answer4");
				    	data[number-num][5] = rs.getString("right_answer");
				    	num--;
					}
					GenerateTest dialog = new GenerateTest(data);
					dialog.setVisible(true);
					connect.close();
			     } 
				catch (Exception e1) 
				{ 
					System.out.print("获取数据错误!");
					e1.printStackTrace(); 
				}
			}
		} else if (str.equals("返  回")) {
			input.setVisible(false);
			Select newSelect = new Select();
			newSelect.setVisible(true);
		}
	}

}

package www.test;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import www.gui.EnterExercise;
import www.gui.GenerateTest;
import www.gui.LookExercise;
import www.listener.ListenerEvent;

import javax.swing.*;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;

public class testOne extends JFrame {

	private JPanel contentPane;
	public JTextField enterNum;
	public LookExercise dialog1;
	public EnterExercise dialog2;
	public GenerateTest dialog3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		连接数据库
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
			Statement stmt = connect.createStatement(); 
			ResultSet rs = stmt.executeQuery("SELECT * FROM exercises;");
			Object[][] data = new Object[100][6];
		    while (rs.next())
			 { 
		    	int num = rs.getInt("id");
		    	data[num-1][0] = rs.getString("content");
		    	data[num-1][1] = rs.getString("answer1");
		    	data[num-1][2] = rs.getString("answer2");
		    	data[num-1][3] = rs.getString("answer3");
		    	data[num-1][4] = rs.getString("answer4");
		    	data[num-1][5] = rs.getString("right_answer");
		     }
		    connect.close();
		    System.out.println("关闭连接");
		    testOne frame = new testOne(data);
		    frame.setVisible(true);
	     } 
		catch (Exception e) 
		{ 
			System.out.print("获取数据错误!");
			e.printStackTrace(); 
		}
		
		
		
//		
		
		
	}

	/**
	 * Create the frame.
	 */
	public testOne(Object[][] data) {
		Object[][] data1 = data;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ListenerEvent listener = new ListenerEvent(this);//监听器
		
//		系统名称
		JLabel systemName = new JLabel("单项选择题标准化考试系统");
		systemName.setForeground(Color.BLUE);
		systemName.setFont(new Font("宋体", Font.PLAIN, 24));
		systemName.setBounds(206, 30, 302, 40);
		contentPane.add(systemName);
//		录入试题
		JButton addExercise = new JButton("录入试题");
		addExercise.addActionListener(listener);//注册事件
		addExercise.setFont(new Font("宋体", Font.PLAIN, 27));
		addExercise.setBounds(359, 115, 155, 56);
		contentPane.add(addExercise);
//		所有试题
		JButton lookExercise = new JButton("所有试题");
		lookExercise.addActionListener(listener);//注册事件
		lookExercise.setFont(new Font("宋体", Font.PLAIN, 27));
		lookExercise.setBounds(158, 115, 155, 56);
		contentPane.add(lookExercise);
//		生成试题
		JButton generateTest = new JButton("生成试题");
		generateTest.addActionListener(listener);//注册事件
		generateTest.setFont(new Font("宋体", Font.PLAIN, 27));
		generateTest.setBounds(471, 233, 155, 56);
		contentPane.add(generateTest);
//		试题抽取提示
		JLabel labelTest = new JLabel("试题抽取：");
		labelTest.setFont(new Font("宋体", Font.PLAIN, 27));
		labelTest.setBounds(117, 241, 155, 40);
		contentPane.add(labelTest);
//		试题抽取输入
		enterNum = new JTextField();
		enterNum.setText("请输入试题数");
		enterNum.setToolTipText("");
		enterNum.setBounds(244, 241, 206, 40);
		contentPane.add(enterNum);
		enterNum.setColumns(10);
//		退出系统
		JButton exitSystem = new JButton("退出系统");
		exitSystem.setFont(new Font("宋体", Font.PLAIN, 25));
		exitSystem.setBounds(272, 340, 155, 50);
		contentPane.add(exitSystem);
//		查看试题对话框
//		dialog1 = new LookExercise(data1);
//		dialog1.setVisible(false);
//		录入试题对话框
		dialog2 = new EnterExercise();
		dialog2.setVisible(false);
//		生成试题
//		dialog3 = new GenerateTest();
//		dialog3.setVisible(false);
	}

}
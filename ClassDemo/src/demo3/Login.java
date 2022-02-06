package demo3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame{
	JLabel regLabelId,logLabelId;
	JLabel regLabelName,logLabelName;
	JTextField regStuId,logStuId;
	JTextField regStuName,logStuName;
	JButton regBtn,logBtn;
	Login(String s){
		init(s);
		this.setVisible(true);
		this.setBounds(200,200,300,200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void init(String s) {
		//创建选项卡窗格
		JTabbedPane panel = new JTabbedPane();
		//创建注册界面内容面板
		JPanel regPanel = new JPanel();
		//创建注册界面内容面板中需要添加的组件
		regLabelId = new JLabel("学号");
		regLabelName = new JLabel("姓名");
		regStuId = new JTextField(10);
		regStuName = new JTextField(10);
		regBtn = new JButton("注册");
		//创建BorderLayout布局对象
		BorderLayout border = new BorderLayout();
		//设置注册面板的布局方式为Borderlayout
		regPanel.setLayout(border);
		//创建学号面板
		JPanel idPanel = new JPanel();
		idPanel.add(regLabelId);
		idPanel.add(regStuId);
		//创建姓名面板
		JPanel namePanel = new JPanel();
		namePanel.add(regLabelName);
		namePanel.add(regStuName);
		//创建按钮面板
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(regBtn);
		//依次将学号、姓名、按钮面板添加到注册界面内容面板中
		regPanel.add(idPanel,BorderLayout.NORTH);
		regPanel.add(namePanel,BorderLayout.CENTER);
		buttonPanel.setPreferredSize(new Dimension(0,50));
		regPanel.add(buttonPanel,BorderLayout.SOUTH);
		
		//创建登录界面内容面板
		JPanel logPanel = new JPanel();
		//创建登录界面内容面板中需要添加的组件
		logLabelId = new JLabel("学号");
		logLabelName = new JLabel("姓名");
		logStuId = new JTextField(10);
		logStuName = new JTextField(10);
		logBtn = new JButton("登录");
		//创建BorderLayout布局对象
		BorderLayout border1 = new BorderLayout();
		//设置登录面板的布局方式为Borderlayout
		logPanel.setLayout(border1);
		//创建学号面板
		JPanel idPanel1 = new JPanel();
		idPanel1.add(logLabelId);
		idPanel1.add(logStuId);
		//创建姓名面板
		JPanel namePanel1 = new JPanel();
		namePanel1.add(logLabelName);
		namePanel1.add(logStuName);
		//创建按钮面板
		JPanel buttonPanel1 = new JPanel();
		buttonPanel1.add(logBtn);
		//依次将学号、姓名、按钮面板添加到注册界面内容面板中
		logPanel.add(idPanel1,BorderLayout.NORTH);
		logPanel.add(namePanel1,BorderLayout.CENTER);
		buttonPanel1.setPreferredSize(new Dimension(0,50));
		logPanel.add(buttonPanel1,BorderLayout.SOUTH);
		
		//将注册界面内容面板和登录界面内容面板添加到选项卡窗格中。
		panel.add("注册", regPanel);
		panel.add("登录", logPanel);
		//将选项卡窗格添加到窗口中
		this.add(panel);
		Monitor m = new Monitor(this);
		logBtn.addActionListener(m);
		regBtn.addActionListener(m);
	}
}

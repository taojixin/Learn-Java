package guessnumber;

import java.awt.BorderLayout;
import javax.swing.*;

public class MyFrame {
	//Frame
	JFrame frame = new JFrame("猜数字小游戏");
	
	//文本标签
	JLabel lb1 = new JLabel("你已经猜了0次");
	JLabel lb2 = new JLabel("输入猜测的数：");
	JLabel lb3 = new JLabel("");
	
	//单行文本框
	JTextField jtf1 = new JTextField(20);
	
	//Panel容器，用于存放其他标签，如JButton,JLabel等
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	//Box容器，用于横向存放其他容器或标签
	Box box1 = Box.createHorizontalBox();
	Box box2 = Box.createHorizontalBox();
	
	//三个按钮
	JButton button1 = new JButton("确定");
	JButton button2 = new JButton("重新开始");
	JButton button3 = new JButton("退出");
	
	//组装界面的方法
	public void install() {
		//设置Frame大小
		frame.setSize(390,250);
		
		//添加和摆放文字"你已经猜了0次"
		frame.add(panel3,BorderLayout.NORTH);//将文字"你已经猜了0次"放到最上方
		panel3.add(lb1);//将文字"你已经猜了0次"放到中间
		
		//组装"输入猜测的数"
		box1.add(lb2);
		box1.add(jtf1);
		box1.add(lb3);
		panel1.add(box1);
		frame.add(panel1);
		
		//组装按钮
		box2.add(button1);
		box2.add(button2);
		box2.add(button3);
		panel2.add(box2);
		frame.add(panel2,BorderLayout.SOUTH);

		MyListener listener = new MyListener(this);//监听器
		button1.addActionListener(listener);//注册事件
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		
		frame.setLocationRelativeTo(null);//将窗口显示到屏幕最中央
        frame.setVisible(true);
	}
	
}


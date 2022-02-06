package view;

import java.awt.FlowLayout;

import javax.swing.*;

import controller.Listener;

public class Frame{
	public JFrame frame = new JFrame("学生管理系统");
	
	JLabel label1 = new JLabel("ID：");
	JLabel label2 = new JLabel("姓名");
	JLabel label3 = new JLabel("年龄");
	JLabel label4 = new JLabel("邮件");
	JLabel label5 = new JLabel("语文");
	JLabel label6 = new JLabel("数学");
	JLabel label7 = new JLabel("英语");
	JLabel label8 = new JLabel("记录数:");
	public JLabel label9 = new JLabel("  ");
	
	public JTextField text1 = new JTextField(23);
	public JTextField text2 = new JTextField(23);
	public JTextField text3 = new JTextField(23);
	public JTextField text4 = new JTextField(23);
	public JTextField text5 = new JTextField(23);
	public JTextField text6 = new JTextField(23);
	public JTextField text7 = new JTextField(23);
	
	JButton but1 = new JButton("保存文件");
	JButton but2 = new JButton("从文件读取");
	JButton but3 = new JButton("上一条记录");
	JButton but4 = new JButton("下一条记录");
	JButton but5 = new JButton("添加一个学生");
	JButton but6 = new JButton("删除当前学生");
	
	JPanel panel = new JPanel();
	
	
	public void install() {
		frame.setSize(300,350);
		frame.setLayout(new FlowLayout());
		
		panel.add(label8);
		panel.add(label9);
		
		frame.add(label1);
		frame.add(text1);
		frame.add(label2);
		frame.add(text2);
		frame.add(label3);
		frame.add(text3);
		frame.add(label4);
		frame.add(text4);
		frame.add(label5);
		frame.add(text5);
		frame.add(label6);
		frame.add(text6);
		frame.add(label7);
		frame.add(text7);
		
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		frame.add(but4);
		frame.add(but5);
		frame.add(but6);
		
		frame.add(panel);
		
		Listener listener = new Listener(this);
		but1.addActionListener(listener);
		but2.addActionListener(listener);
		but3.addActionListener(listener);
		but4.addActionListener(listener);
		but5.addActionListener(listener);
		but6.addActionListener(listener);
		
		
		frame.setLocationRelativeTo(null);//将窗口显示到屏幕最中央
        frame.setVisible(true);
	}
	
}

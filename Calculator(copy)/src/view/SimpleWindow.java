package view;

import java.awt.*;
import java.awt.event.MouseListener;
import javax.swing.*;

import controller.Monitor;

public class SimpleWindow extends JFrame{
	public JTextField end;
	public JLabel show;
	JPanel panel1,panel2,panel3;
	JButton clear;
	
	public SimpleWindow() {
		init();
		setTitle("计算器");
		setSize(300,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public void init() {
		end = new JTextField(28);
		show = new JLabel(" ");
		panel1 = new JPanel(new BorderLayout());
		panel2 = new JPanel(new GridLayout(5,3));
		panel3 = new JPanel();
		clear = new JButton("清空");
		
		end.setEnabled(false);//只读
		
		panel1.add(show,BorderLayout.NORTH);
		panel1.add(panel2,BorderLayout.CENTER);
		panel1.add(clear,BorderLayout.SOUTH);

		panel3.add(end);
		
		Monitor m = new Monitor(this);//监听器
		clear.addMouseListener(m);
		creatAdd("0",m);
		creatAdd("1",m);
		creatAdd("2",m);
		creatAdd("3",m);
		creatAdd("4",m);
		creatAdd("5",m);
		creatAdd("6",m);
		creatAdd("7",m);
		creatAdd("8",m);
		creatAdd("9",m);
		creatAdd("+",m);
		creatAdd("-",m);
		creatAdd("*",m);
		creatAdd("/",m);
		creatAdd("=",m);

		add(panel3,BorderLayout.NORTH);
		add(panel1,BorderLayout.CENTER);
	}
	
	//此方法用于声明按钮和将他们添加到容器中，并给他们注册时间  （主要用来减少代码，如果把按钮的声明、添加、注册都分开写，代码会多很多）
	public void creatAdd(String str,MouseListener m) {
		JButton button = new JButton(str);
		panel2.add(button);
		button.addMouseListener(m);
	}
}

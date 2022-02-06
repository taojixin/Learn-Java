package view;

import java.awt.*;

import javax.swing.*;

import controller.Monitor;

public class SimpleWindow{
	JFrame frame = new JFrame("计算器");
	public JTextField end = new JTextField(28);
	public JLabel show = new JLabel(" ");
	JPanel panel1 = new JPanel(new BorderLayout());
	JPanel panel2 = new JPanel(new GridLayout(5,3));
	JPanel panel3 = new JPanel();
	
	JButton zero = new JButton("0");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton mul = new JButton("*");
	JButton div = new JButton("/");
	JButton equal = new JButton("=");
	JButton clear = new JButton("清空");

//	JButton one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,clear,equal;
	
	
	public SimpleWindow() {
		init();
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	public void init() {
//		show = new JTextField(20);
//		showend = new JLabel("dfsdf");
//		panel1 = new JPanel(new BorderLayout());
//		panel2 = new JPanel(new GridLayout(10,10));

		
		end.setEnabled(false);
		panel2.add(zero);
		panel2.add(one = new JButton("1"));
		panel2.add(two);
		panel2.add(three);
		panel2.add(four);
		panel2.add(five);
		panel2.add(six);
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(add);
		panel2.add(sub);
		panel2.add(mul);
		panel2.add(div);
		panel2.add(equal);
		
		panel3.add(end);

		panel1.add(show,BorderLayout.NORTH);
		panel1.add(panel2,BorderLayout.CENTER);
		panel1.add(clear,BorderLayout.SOUTH);
		
		frame.add(panel3,BorderLayout.NORTH);
		frame.add(panel1,BorderLayout.CENTER);
		
		Monitor m = new Monitor(this);//监听器
		one.addMouseListener(m);
		two.addMouseListener(m);
		three.addMouseListener(m);
		four.addMouseListener(m);
		five.addMouseListener(m);
		six.addMouseListener(m);
		seven.addMouseListener(m);
		eight.addMouseListener(m);
		nine.addMouseListener(m);
		zero.addMouseListener(m);
		add.addMouseListener(m);
		sub.addMouseListener(m);
		mul.addMouseListener(m);
		div.addMouseListener(m);
		clear.addMouseListener(m);
		equal.addMouseListener(m);
		
	}
}

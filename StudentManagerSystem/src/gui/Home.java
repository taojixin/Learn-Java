package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listener.HomeListener;
import Listener.LoginListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Home extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//		窗口居中
		setLocationRelativeTo(null);
		
		HomeListener listener = new HomeListener(this);//监听器
		
		JLabel lblNewLabel = new JLabel("学生信息管理系统");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(124, 20, 188, 49);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("添加学生信息");
		btnNewButton.addActionListener(listener);//注册事件
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBounds(32, 79, 153, 54);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("删除学生信息");
		btnNewButton_1.addActionListener(listener);//注册事件
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1.setBounds(205, 79, 153, 54);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("修改学生信息");
		btnNewButton_1_1.addActionListener(listener);//注册事件
		btnNewButton_1_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(32, 151, 153, 54);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("查询所有学生");
		btnNewButton_1_1_1.addActionListener(listener);//注册事件
		btnNewButton_1_1_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBounds(205, 151, 153, 54);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("退出系统");
		btnNewButton_2.addActionListener(listener);//注册事件
		btnNewButton_2.setBounds(123, 226, 142, 42);
		contentPane.add(btnNewButton_2);
	}

}

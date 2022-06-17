package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listener.AddStuListener;
import Listener.HomeListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

public class AddStu extends JDialog {

	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;


	/**
	 * Create the frame.
	 */
	public AddStu() {
		setBounds(100, 100, 314, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//		窗口居中
		setLocationRelativeTo(null);
		
		AddStuListener listener = new AddStuListener(this);//监听器
		
		JLabel lblNewLabel = new JLabel("添加学生信息");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(98, 10, 134, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("学号：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(34, 64, 54, 33);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(76, 64, 201, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("姓名：");
		lblNewLabel_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(34, 107, 54, 33);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 107, 201, 33);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("性别：");
		lblNewLabel_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(34, 150, 54, 33);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 150, 201, 33);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("生日：");
		lblNewLabel_1_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(34, 193, 54, 33);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(76, 193, 201, 33);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("电话：");
		lblNewLabel_1_1_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(34, 236, 54, 33);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(76, 236, 201, 33);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("宿舍：");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(34, 279, 54, 33);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(76, 279, 201, 33);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("添加");
		btnNewButton.addActionListener(listener);//注册事件
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.setBounds(86, 322, 121, 28);
		contentPane.add(btnNewButton);
	}

}

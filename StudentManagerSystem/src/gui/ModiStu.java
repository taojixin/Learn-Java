package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listener.ModiListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

public class ModiStu extends JDialog {

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
	public ModiStu() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//		窗口居中
		setLocationRelativeTo(null);
		
		ModiListener listener = new ModiListener(this);//监听器
		
		JLabel lblNewLabel = new JLabel("修改学生信息");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(160, 10, 127, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("学号：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(53, 56, 59, 49);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(99, 62, 170, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(listener);//注册事件
		btnNewButton.setBounds(292, 64, 91, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("姓名：");
		lblNewLabel_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(53, 110, 59, 49);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 115, 170, 38);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("性别：");
		lblNewLabel_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(53, 169, 59, 49);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 169, 170, 38);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("生日：");
		lblNewLabel_1_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(53, 228, 59, 49);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(99, 228, 170, 38);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("电话：");
		lblNewLabel_1_1_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(53, 287, 59, 49);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(99, 287, 170, 38);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("宿舍：");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(53, 346, 59, 49);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(99, 346, 170, 38);
		contentPane.add(textField_5);
		
		JButton button = new JButton("修改");
		button.addActionListener(listener);//注册事件
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBounds(136, 401, 151, 43);
		contentPane.add(button);
	}

}

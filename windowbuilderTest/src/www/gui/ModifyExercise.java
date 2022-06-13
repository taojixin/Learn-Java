package www.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import www.listener.ModifyListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ModifyExercise extends JDialog {

	public final JPanel contentPanel = new JPanel();
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;

	/**
	 * Create the dialog.
	 */
	public ModifyExercise() {
		
		ModifyListener listener = new ModifyListener(this);//监听器
		
		setBounds(100, 100, 516, 353);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("修改试题");
			lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
			lblNewLabel.setBounds(200, 10, 92, 42);
			contentPanel.add(lblNewLabel);
		}
//		请输入试题号
		JLabel lblNewLabel_1 = new JLabel("请输入试题号：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(55, 61, 117, 42);
		contentPanel.add(lblNewLabel_1);
//		试题号输入框
		textField = new JTextField();
		textField.setBounds(164, 62, 111, 35);
		contentPanel.add(textField);
		textField.setColumns(10);
//		查询按钮
		JButton btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(listener);//注册事件
		btnNewButton.setBounds(313, 65, 92, 35);
		contentPanel.add(btnNewButton);
//		试题内容
		JLabel lblNewLabel_2 = new JLabel("试题内容：");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(19, 113, 76, 42);
		contentPanel.add(lblNewLabel_2);
//		试题内容框
		textField_1 = new JTextField();
		textField_1.setBounds(95, 117, 364, 35);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
//		选项A
		JLabel lblNewLabel_3 = new JLabel("选项A：");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(41, 167, 54, 35);
		contentPanel.add(lblNewLabel_3);
//		选项B
		JLabel lblNewLabel_3_1 = new JLabel("选项B：");
		lblNewLabel_3_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(274, 164, 54, 35);
		contentPanel.add(lblNewLabel_3_1);
//		选项C
		JLabel lblNewLabel_3_2 = new JLabel("选项C：");
		lblNewLabel_3_2.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(41, 212, 54, 35);
		contentPanel.add(lblNewLabel_3_2);
//		选项D
		JLabel lblNewLabel_3_2_1 = new JLabel("选项D：");
		lblNewLabel_3_2_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(274, 209, 54, 35);
		contentPanel.add(lblNewLabel_3_2_1);
//		A
		textField_2 = new JTextField();
		textField_2.setBounds(93, 167, 131, 35);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
//		B 
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(328, 164, 131, 35);
		contentPanel.add(textField_3);
//		C
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(93, 212, 131, 35);
		contentPanel.add(textField_4);
//		D
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(328, 209, 131, 35);
		contentPanel.add(textField_5);
//		修改按钮
		JButton btnNewButton_1 = new JButton("修改");
		btnNewButton_1.addActionListener(listener);//注册事件
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton_1.setBounds(274, 254, 190, 49);
		contentPanel.add(btnNewButton_1);
//		答案
		JLabel lblNewLabel_3_2_1_1 = new JLabel("答案：");
		lblNewLabel_3_2_1_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1.setBounds(41, 257, 54, 35);
		contentPanel.add(lblNewLabel_3_2_1_1);
//		答案框
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(93, 257, 131, 35);
		contentPanel.add(textField_6);
	}

}

package www.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import www.listener.InputListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InputNum extends JFrame {

	public JPanel contentPane;
	public JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputNum frame = new InputNum();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InputNum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//		窗口居中
		setLocationRelativeTo(null);
		
		InputListener listener = new InputListener(this);//监听器
		
		JLabel lblNewLabel = new JLabel("单项选择题标准化考试系统");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(65, 10, 260, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("请输入试题生成数：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(26, 72, 180, 40);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(204, 72, 140, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("生成试题");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.setBounds(52, 141, 140, 45);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(listener);//注册事件
		
		JButton btnNewButton_1 = new JButton("返  回");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_1.setBounds(204, 141, 140, 45);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(listener);//注册事件
	}
}

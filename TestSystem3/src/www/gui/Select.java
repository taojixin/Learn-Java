package www.gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import www.listener.SelectListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Select extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Select() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//		窗口居中
		setLocationRelativeTo(null);
		
		
		SelectListener listener = new SelectListener(this);//监听器
		
		JLabel lblNewLabel = new JLabel("单项选择题标准化考试系统");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(89, 27, 251, 49);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("管理员");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.setBounds(46, 108, 131, 49);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(listener);//注册事件
		
		JButton btnNewButton_1 = new JButton("学生");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_1.setBounds(237, 108, 131, 49);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(listener);//注册事件
	}
}

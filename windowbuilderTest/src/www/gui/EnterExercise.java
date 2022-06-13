package www.gui;

import www.listener.EnterListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class EnterExercise extends JDialog {

	public JPanel contentPanel = new JPanel();
	public JTextField textField;
	public JTextField answera;
	public JTextField answerb;
	public JTextField answerc;
	public JTextField answerd;
	public JTextField answer;


	/**
	 * Create the dialog.
	 */
	public EnterExercise() {
		setBounds(100, 100, 650, 376);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		EnterListener listener = new EnterListener(this);//监听器
		
//		请输入题目
		JLabel lblNewLabel = new JLabel("请输入题目：");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(51, 51, 120, 37);
		contentPanel.add(lblNewLabel);
//		题目
		textField = new JTextField();
		textField.setBounds(173, 53, 416, 37);
		contentPanel.add(textField);
		textField.setColumns(10);
//		请输入选项
		JLabel lblNewLabel_1 = new JLabel("请输入选项：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(51, 111, 120, 37);
		contentPanel.add(lblNewLabel_1);
//		选项A
		JLabel lblNewLabel_2 = new JLabel("A：");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(136, 158, 52, 37);
		contentPanel.add(lblNewLabel_2);
//		A
		answera = new JTextField();
		answera.setBounds(165, 163, 149, 37);
		contentPanel.add(answera);
		answera.setColumns(10);
//		选项B
		JLabel answer2 = new JLabel("B：");
		answer2.setFont(new Font("宋体", Font.PLAIN, 28));
		answer2.setBounds(338, 158, 52, 37);
		contentPanel.add(answer2);
//		B
		answerb = new JTextField();
		answerb.setColumns(10);
		answerb.setBounds(369, 163, 149, 37);
		contentPanel.add(answerb);
//		选项C
		JLabel answer3 = new JLabel("C：");
		answer3.setFont(new Font("宋体", Font.PLAIN, 28));
		answer3.setBounds(136, 205, 52, 37);
		contentPanel.add(answer3);
//		C
		answerc = new JTextField();
		answerc.setColumns(10);
		answerc.setBounds(165, 205, 149, 37);
		contentPanel.add(answerc);
//		选项D
		JLabel answer4 = new JLabel("D：");
		answer4.setFont(new Font("宋体", Font.PLAIN, 28));
		answer4.setBounds(338, 205, 52, 37);
		contentPanel.add(answer4);
//		D
		answerd = new JTextField();
		answerd.setColumns(10);
		answerd.setBounds(369, 205, 149, 37);
		contentPanel.add(answerd);
//		录入试题按钮
		JButton btnNewButton = new JButton("录入试题");
		btnNewButton.addActionListener(listener);//注册事件
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 28));
		btnNewButton.setBounds(242, 264, 161, 55);
		contentPanel.add(btnNewButton);
//		正确答案
		JLabel rightAnswer = new JLabel("正确答案：");
		rightAnswer.setForeground(Color.RED);
		rightAnswer.setFont(new Font("宋体", Font.PLAIN, 28));
		rightAnswer.setBounds(242, 108, 161, 37);
		contentPanel.add(rightAnswer);
//		答案
		answer = new JTextField();
		answer.setColumns(10);
		answer.setBounds(369, 111, 149, 39);
		contentPanel.add(answer);
		
		JLabel lblNewLabel_3 = new JLabel("录入试题");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(276, 10, 105, 37);
		contentPanel.add(lblNewLabel_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}

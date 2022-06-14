package www.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import www.listener.WriteListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import java.awt.Color;

public class GenerateTest extends JDialog {
	public JTextPane textPane;
	public JRadioButton answer1;
	public JRadioButton answer2;
	public JRadioButton answer3;
	public JRadioButton answer4;
	public JLabel lblNewLabel;
	public ButtonGroup group;
	
	Object[][] data;
	private final JPanel contentPanel = new JPanel();


	/**
	 * Create the dialog.
	 */
	public GenerateTest(Object[][] data) {
		
		this.data = data;
		
		WriteListener listener = new WriteListener(this,this.data);//监听器
		
		setBounds(100, 100, 693, 431);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("第" + 1 + "题");
			lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));
			lblNewLabel.setBounds(257, 40, 84, 39);
			contentPanel.add(lblNewLabel);
		}

//		窗口居中
		setLocationRelativeTo(null);
//		题目展示文本
		textPane = new JTextPane();
		textPane.setForeground(Color.BLACK);
		textPane.setEnabled(false);
		textPane.setFont(new Font("宋体", Font.PLAIN, 19));
		textPane.setText((String) this.data[0][0]);
		textPane.setBounds(42, 89, 597, 82);
		contentPanel.add(textPane);
//		A选项
		answer1 = new JRadioButton("A：" + this.data[0][1]);
//		answer1.addActionListener(listener);//注册事件
		answer1.setFont(new Font("宋体", Font.PLAIN, 20));
		answer1.setBounds(100, 206, 186, 46);
		contentPanel.add(answer1);
//		B选项
		answer2 = new JRadioButton("B：" + this.data[0][2]);
//		answer2.addActionListener(listener);//注册事件
		answer2.setFont(new Font("宋体", Font.PLAIN, 20));
		answer2.setBounds(376, 206, 186, 46);
		contentPanel.add(answer2);
//		C选项
		answer3 = new JRadioButton("C：" + this.data[0][3]);
//		answer3.addActionListener(listener);//注册事件
		answer3.setFont(new Font("宋体", Font.PLAIN, 20));
		answer3.setBounds(100, 269, 186, 46);
		contentPanel.add(answer3);
//		D选项
		answer4 = new JRadioButton("D：" + this.data[0][4]);
//		answer4.addActionListener(listener);//注册事件
		answer4.setFont(new Font("宋体", Font.PLAIN, 20));
		answer4.setBounds(376, 269, 186, 46);
		contentPanel.add(answer4);
//		单选按钮组
		group = new ButtonGroup();
		group.add(answer1);
		group.add(answer2);
		group.add(answer3);
		group.add(answer4);
		
//		下一题按钮
		JButton nestTest = new JButton("下一题");
		nestTest.addActionListener(listener);//注册事件
		nestTest.setForeground(Color.GREEN);
		nestTest.setFont(new Font("宋体", Font.PLAIN, 20));
		nestTest.setBounds(81, 321, 166, 53);
		contentPanel.add(nestTest);
//		提交按钮
		JButton submit = new JButton("提交");
		submit.addActionListener(listener);//注册事件
		submit.setForeground(Color.RED);
		submit.setFont(new Font("宋体", Font.PLAIN, 20));
		submit.setBounds(344, 321, 166, 53);
		contentPanel.add(submit);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}

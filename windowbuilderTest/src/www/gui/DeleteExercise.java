package www.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import www.listener.DeleteListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class DeleteExercise extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField textField;


	/**
	 * Create the dialog.
	 */
	public DeleteExercise() {
		setBounds(100, 100, 463, 274);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		DeleteListener listener = new DeleteListener(this);//监听器
		
		JLabel lblNewLabel = new JLabel("删除试题");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 25));
		lblNewLabel.setBounds(146, 11, 116, 59);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("请输入需要删除的试题号：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 80, 240, 44);
		contentPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(245, 79, 194, 51);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("删除");
		btnNewButton.addActionListener(listener);//注册事件
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.setBounds(141, 164, 144, 44);
		contentPanel.add(btnNewButton);
	}
}

package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CheckStu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	Object[][] data = {{},{},{},{},{},{}};

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			CheckStu dialog = new CheckStu();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public CheckStu(Object[][] data) {
		this.data = data;
		
		setBounds(100, 100, 440, 365);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
//		窗口居中
		setLocationRelativeTo(null);
//		表格列名
		Object[] titles = {"学号","姓名","性别","生日","电话","宿舍"};
		Object[][] data1 = {
				{"1","1","1","1","1","1"},
				{"1","1","1","1","1","1"},
				{"1","1","1","1","1","1"},
		};
		
		JLabel lblNewLabel = new JLabel("查询所有学生信息");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(119, 10, 167, 51);
		contentPanel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 59, 406, 259);
		contentPanel.add(scrollPane);
		
		table = new JTable(data,titles);
		scrollPane.setViewportView(table);
	}
}

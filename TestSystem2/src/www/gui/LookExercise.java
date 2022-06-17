package www.gui;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Font;

public class LookExercise extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	Object[][] data = {{},{},{},{},{},{}};


	/**
	 * Create the dialog.
	 */
	public LookExercise(Object data) {
		this.data = (Object[][]) data;
		setBounds(100, 100, 665, 291);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
//		窗口居中
		setLocationRelativeTo(null);
//		表格列名
		Object[] titles = {"题号","习题","选项1","选项2","选项3","选项4","答案"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 631, 210);
		contentPanel.add(scrollPane);
		table = new JTable(this.data,titles);
		scrollPane.setViewportView(table);
		table.setFont(new Font("宋体", Font.PLAIN, 17));
	}
}

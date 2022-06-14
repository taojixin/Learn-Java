package www.gui;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class GradeView extends JDialog {
	private JTable table_1;
	Object[][] data;
	int rightCount = 0;
	int errorCount = 0;

	/**
	 * Create the dialog.
	 */
	public GradeView(Object[][] data) {
		this.data = data;
//		计算正确个数
		for (int a = 0;a < this.data.length;a++) {
			if (this.data[a][5].equals(this.data[a][6])) {
				rightCount++;
			}
		}
		errorCount = this.data.length - rightCount;
		
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 667, 272);
		getContentPane().add(scrollPane);
//		窗口居中
		setLocationRelativeTo(null);
		
//		表格列名
		Object[] titles = {"习题","选项A","选项B","选项C","选项D","答案","我的选项"};
		
		table_1 = new JTable(this.data,titles);
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("成绩报告");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 31));
		lblNewLabel.setBounds(258, 10, 140, 50);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("正确：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(82, 352, 60, 44);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("错误：");
		lblNewLabel_1_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(438, 352, 60, 44);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(this.rightCount+"");
		lblNewLabel_1_1_1.setForeground(Color.GREEN);
		lblNewLabel_1_1_1.setFont(new Font("宋体", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(133, 352, 53, 44);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(this.errorCount+"");
		lblNewLabel_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1_1.setFont(new Font("宋体", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(491, 350, 42, 44);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("题");
		lblNewLabel_1_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(166, 352, 60, 44);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("题");
		lblNewLabel_1_1_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(518, 352, 60, 44);
		getContentPane().add(lblNewLabel_1_1_2);
		setBounds(100, 100, 702, 441);
		getContentPane().setLayout(new BorderLayout());
	}

}

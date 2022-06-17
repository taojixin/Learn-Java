package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import www.gui.GenerateTest;
import www.gui.GradeView;
import www.utils.GroupButtonUtils;

public class WriteListener implements ActionListener{
	GenerateTest gt;
	Object[][] data;
	public WriteListener(GenerateTest generte, Object[][] data) {
		this.gt = generte;
		this.data = data;
	}
	int num = 1;
	Object[] selectArray = {};
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		String str = btn.getText();//将按钮的文本值存到str中
		GroupButtonUtils groupBtn = new GroupButtonUtils();
//		获取选择的选项答案
		String selectAnswer = groupBtn.getSelectedButtonText(gt.group).split("：")[1];
		//判断点击的是哪个按钮
		if(str.equals("下一题")) {
//			更改题目
			if(num < this.data.length) {
				gt.textPane.setText((String) data[num][0]);
				gt.answer1.setText("A：" + (String) data[num][1]);
				gt.answer2.setText("B：" + (String) data[num][2]);
				gt.answer3.setText("C：" + (String) data[num][3]);
				gt.answer4.setText("D：" + (String) data[num][4]);
				gt.lblNewLabel.setText("第" + (num+1) + "题");
				data[num-1][6] = selectAnswer;
				num = num + 1;
			} else {
				data[num-1][6] = selectAnswer;
				JOptionPane.showMessageDialog(null, "这是最后一题！","提示",JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (str.equals("提交")) {
			GradeView gradeView = new GradeView(this.data);
			gradeView.setVisible(true);
		}
	}

}

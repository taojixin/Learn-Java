package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import www.gui.GenerateTest;

public class WriteListener implements ActionListener{
	GenerateTest gt;
	Object[][] data;
	public WriteListener(GenerateTest generte, Object[][] data) {
		this.gt = generte;
		this.data = data;
	}
	int num = 1;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		String str = btn.getText();//将按钮的文本值存到str中
		//判断点击的是哪个按钮
		if(str.equals("下一题")) {
//			String ifRight = gt.answer1
//			更改题目
			if(num < this.data.length) {
				System.out.println(num);
				gt.textPane.setText((String) data[num][0]);
				gt.answer1.setText("A：" + (String) data[num][1]);
				gt.answer2.setText("B：" + (String) data[num][2]);
				gt.answer3.setText("C：" + (String) data[num][3]);
				gt.answer4.setText("D：" + (String) data[num][4]);
				gt.lblNewLabel.setText("第" + (num+1) + "题");
				num = num + 1;
			} else {
				JOptionPane.showMessageDialog(null, "这是最后一题！","提示",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} else if (str.equals("提交")) {
			
		} 
	}

}

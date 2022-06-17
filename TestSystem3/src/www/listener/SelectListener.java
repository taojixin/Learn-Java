package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import www.gui.InputNum;
import www.gui.Login;
import www.gui.Select;

public class SelectListener implements ActionListener{
	Select select;
	public SelectListener(Select select) {
		this.select = select;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		String str = btn.getText();//将按钮的文本值存到str中
		if(str.equals("管理员")) {
			select.setVisible(false);
			Login login = new Login();
		    login.setVisible(true);
		} else if (str.equals("学生")) {
			select.setVisible(false);
			InputNum input = new InputNum();
			input.setVisible(true);
		}
	}

}

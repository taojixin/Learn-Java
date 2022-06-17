package guessnumber;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyListener implements ActionListener{
	private int ran = (int)(1+10000*Math.random());//用于生成随机的1到1000的数
	private int a = 0;//用于记录猜测了多少次
	MyFrame f;//存放窗口的相关信息
	
	public MyListener(MyFrame frame) {
		f = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		String str = btn.getText();//将按钮的文本值存到str中
		//判断点击的是哪个按钮
		if(str.equals("确定")) {
			int number = Integer.parseInt(f.jtf1.getText());//将输入框中输入的数字(此时还是String型)转换为数字型
			if(number > ran) {//将输入的数字和随机生产的数 ran 进行比较
				a++;//猜测次数 +1
				f.panel1.setBackground(Color.red);//猜大了，将背景改为红色
				f.jtf1.setText("");//清空输入框
				f.lb3.setText("太大了！");//输入框右边的提示文字 “太大了”
				f.lb1.setText("你已经猜了" + a + "次");//最上方的文字，记录猜了多少次了
			}else if(number < ran) {
				a++;//猜测次数 +1
				f.panel1.setBackground(Color.blue);//猜小了，将背景改为红色
				f.jtf1.setText("");//清空输入框
				f.lb3.setText("太小了！");//输入框右边的提示文字 “太小了”
				f.lb1.setText("你已经猜了" + a + "次");//最上方的文字，记录猜了多少次了
			}else {
				JOptionPane.showMessageDialog(null, "恭喜你猜对了","恭喜了",JOptionPane.INFORMATION_MESSAGE);//猜对时的提示框，这里的第一个参数此时必须是null
				f.panel1.setBackground(Color.white);//将背景恢复为开始的白色
				f.lb3.setText("");//清空输入框 右侧的 文字提示
				f.jtf1.setText("");//清空输入框
				f.lb1.setText("你已经猜了0次");//重置最上方的文字，猜测次数为0
				a = 0;//猜测次数清0
			}
		}else if(str.equals("重新开始")) {
			ran = (int)(1+1000*Math.random());//重新生产随机数
			f.panel1.setBackground(Color.white);//将背景恢复为开始的白色
			f.lb3.setText("");//清空输入框 右侧的 文字提示
			f.jtf1.setText("");//清空输入框
			f.lb1.setText("你已经猜了0次");//重置最上方的文字，猜测次数为0
			a = 0;//猜测次数清0
		}else{
			f.frame.setVisible(false);
		}
		
	}
}

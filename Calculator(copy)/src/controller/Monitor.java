package controller;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;

import model.Caculator;
import view.SimpleWindow;

public class Monitor extends MouseAdapter{
	SimpleWindow w;
	public Monitor(SimpleWindow window) {
		this.w = window;
	}
	double num1;
	double num2;
	char operator;
	int firstNumLong =0;
	int secondNumLong = 0;
	int firstNum = 0;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		char chars = btn.getText().charAt(0);//将按钮的文本值存到str中
		String str = btn.getText();
		
		if(chars >= 48 && chars <= 57) {
			w.show.setText(w.show.getText() + str);
			firstNumLong++;
		}else if(str.equals("+")) {
			w.show.setText(w.show.getText() + str);
			operator = '+';
			firstNum = firstNumLong;
			firstNumLong = 0;
		}else if(str.equals("-")) {
			w.show.setText(w.show.getText() + str);
			operator = '-';
			firstNum = firstNumLong;
			firstNumLong = 0;
		}else if(str.equals("*")) {
			w.show.setText(w.show.getText() + str);
			operator = '*';
			firstNum = firstNumLong;
			firstNumLong = 0;
		}else if(str.equals("/")) {
			w.show.setText(w.show.getText() + str);
			operator = '/';
			firstNum = firstNumLong;
			firstNumLong = 0;
		}else if(str.equals("清空")) {
			w.show.setText(" ");
			w.end.setText("");
			operator = ' ';
			firstNumLong = 0;
		}else if(str.equals("=")){
			String first = w.show.getText().substring(1,firstNum + 1);
			num1 = Double.parseDouble(first);
			String second = w.show.getText().substring(first.length() + 2);
			num2 = Double.parseDouble(second);
			switch (operator) {
			case '+':
				String ad = String.valueOf(Caculator.add(num1,num2));
				w.end.setText(ad);
				break;
			case '-':
				String su = String.valueOf(Caculator.sub(num1,num2));
				w.end.setText(su);
				break;
			case '*':
				String mu = String.valueOf(Caculator.mul(num1,num2));
				w.end.setText(mu);
				break;
			case '/':
				String di = String.valueOf(Caculator.div(num1,num2));
				w.end.setText(di);
				break;
			default:
				break;
			}
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		btn.setBackground(Color.yellow);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();//获取点击的按钮
		btn.setBackground(null);
	}
}

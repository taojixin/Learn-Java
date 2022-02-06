package demo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Monitor implements ActionListener{
	StudentManager manager = new StudentManager();
	Login f;
	public Monitor(Login f) {
		this.f = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		String str = btn.getText();
		if(str.equals("注册")){
			String id = f.regStuId.getText();
			String name = f.regStuName.getText();
			boolean flag = manager.searchStudent(id);
			if(flag == false){
				Student stu = new Student(name, id);
				manager.addStudent(stu);
				JOptionPane.showMessageDialog(f, "注册成功");
			}else{
				JOptionPane.showMessageDialog(f, "该学生已存在");
				f.regStuId.setText(null);
				f.regStuName.setText(null);
			}
		}
	}
	
}

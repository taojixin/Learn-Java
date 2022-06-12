package www.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import www.gui.GenerateTest;

public class JRBListener implements ActionListener{

	GenerateTest gt;
	Object[][] data;
	public JRBListener(GenerateTest generte, Object[][] data) {
		this.gt = generte;
		this.data = data;
	}
	int num = 0;
	String select = "";
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		System.out.println("111" + this.data[2][5]); 
		String[] str = e.getActionCommand().split("：");
		select = select + str[1] + ",";
		System.out.println(select); 
		String[] newArray = select.split(",");
		num++;
		if (num == this.data.length) {
			for (int a = 0;a < this.data.length;a++) {
				
				if (this.data[a][5].equals(newArray[a])) {
					this.data[a][6] = "对";
				} else {
					this.data[a][6] = "错";
				}
			}
		}
		System.out.println(this.data[0][6]); 
		
	}

}

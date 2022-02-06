package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Equipment;
import domain.NoteBook;
import domain.PC;
import domain.Printer;
import domain.Programmer;

//负责将data中的数据封装到Employee[]数组中去，同时提供相关操作的方法
public class NameListService {
	private Employee[] employees;
//构造器

	public NameListService() {
		employees = new Employee[Data.EMPLOYEES.length];
		
		for(int i = 0;i < employees.length;i++) {
			//获取员工类型
			int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
			//获取Employee的4个基本信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			
			Equipment equipment;
			double bonus;
			int stock;
			switch(type) {
			case Data.EMPLOYEE:
				employees[i] = new Employee(id,name,age,salary);
				break;
			case Data.PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case Data.DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case Data.ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}
	}
//方法
	//获取指定index位置上的员工的设备
	public Equipment createEquipment(int index) {
		int key = Integer.parseInt(Data.EQUIPMENTS[index][0]);
		String modelOrName = Data.EQUIPMENTS[index][1];
		switch(key) {
		case Data.PC://21
			String display = Data.EQUIPMENTS[index][2];
			return new PC(modelOrName,display);
		case Data.NOTEBOOK://22
			double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
			return new NoteBook(modelOrName,price);
		case Data.PRINTER://23
			String type = Data.EQUIPMENTS[index][2];
			return new Printer(modelOrName,type);
			
		}
		return null;
	}
	//获取当前所有员工
	public Employee[] getAllEmployees() {
		return employees;
	}
	//获取指定ID的员工对象
	public Employee getEmployee(int id) throws TeamException {
		for(int i = 0;i < employees.length;i++) {
			if(employees[i].getId() == id) {//此处注意==和equls的区别
				return employees[i];
			}
		}
		
		throw new TeamException("找不到指定的员工！");
	}
}

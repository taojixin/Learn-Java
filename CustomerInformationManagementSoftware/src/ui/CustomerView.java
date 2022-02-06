package ui;

import bean.Customer;
import service.CustomerList;
import util.CMUtility;

//CustomerView为主模块，负责菜单的显示和处理用户操作

public class CustomerView {
	CustomerList customerList = new CustomerList(10);
	//构造器初始化数据
	public CustomerView() {
		Customer customer = new Customer("王涛",'男',23,"132155575","48dsf@qq.com");
		customerList.addCustomer(customer);
	}
	
	//显示《客户管理软件》界面的方法
	public void enterMainMenu() {
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("\n-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");
			char menu = CMUtility.readMenuSelection();
			switch(menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("确定是否推出(Y/N):");
				char isExit = CMUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isFlag = false;
				}
			}
		}
		
	}
	//添加客户
	public void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱：");
		String email = CMUtility.readString(30);
		//将上述数据封装到对象中
		Customer customer = new Customer(name,gender,age,phone,email);
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess) {
			System.out.println("---------------------添加完成---------------------");
		}else {
			System.out.println("----------------记录已满,无法添加-----------------");
		}
	}
	//修改客户
	public void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		Customer cust;
		int number;
		for(;;) {
			System.out.print("请选择待修改客户编号（-1退出）：");
			number = CMUtility.readInt();
			
			if(number == -1) {
				return;
			}
			cust = customerList.getCustomer(number - 1);
			if(cust == null) {
				System.out.println("无法找到指定客户！");
			}else {//找到了客户
				break;
			}
		}
		//修改客户信息
		System.out.print("姓名(" + cust.getName() + ")：");
		String name = CMUtility.readString(4, cust.getName());
		System.out.print("性别(" + cust.getGender() + ")：");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + ")：");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + ")：");
		String phone = CMUtility.readString(15, cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + ")：");
		String email = CMUtility.readString(15, cust.getEmail());
		
		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean flag = customerList.replaceCustomer(number - 1, newCust);
		if (flag) {
			System.out
					.println("---------------------修改完成---------------------");
		} else {
			System.out.println("----------无法找到指定客户,修改失败--------------");
		}
	}
	//删除客户
	public void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		int index = 0;
		Customer cust = null;
		for (;;) {
			System.out.print("请选择待删除客户编号(-1退出)：");
			index = CMUtility.readInt();
			if (index == -1) {
				return;
			}

			cust = customerList.getCustomer(index - 1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			} else
				break;
		}

		System.out.print("确认是否删除(Y/N)：");
		char yn = CMUtility.readConfirmSelection();
		if (yn == 'N')
			return;

		boolean flag = customerList.deleteCustomer(index - 1);
		if (flag) {
			System.out
					.println("---------------------删除完成---------------------");
		} else {
			System.out.println("----------无法找到指定客户,删除失败--------------");
		}
	}
	//显示客户列表
	public void listAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------");
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("没有客户记录！");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();//获取所有客户
			for(int i = 0;i < custs.length;i++) {//输出所有客户信息
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender()
				+ "\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
		
		
		System.out.println("-------------------------客户列表完成-------------------------");
	}
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}

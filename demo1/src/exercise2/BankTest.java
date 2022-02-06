package exercise2;

public class BankTest {
	public static void main(String[] args) {
		//1.先创建Bank
		Bank bank = new Bank();
		//2.再在bank里创建客户
		bank.addCustomer("陶", "继鑫");
		//3.再为客户创建账户（同时给用户的账户设置balance）;
		//.setAccount创建的Account是空的，值为null，所以必须new一个Account（匿名对象）同时通过构造器给balance赋值为2000
		bank.getCustomer(0).setAccount(new Account(2000));
		//4.进行取款
		bank.getCustomer(0).getAccount().withdraw(1);
		//5.保存余额到变量balabce中
		double balance = bank.getCustomer(0).getAccount().getBalance();
		//6.输出客户信息
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + bank.getCustomer(0).getLastName() + " 的余额为：" + balance);
		
		System.out.println("***************************");
		
		bank.addCustomer("Jake", "smith");
		bank.getCustomer(1).setAccount(new Account(3000));
		bank.getCustomer(1).getAccount().deposit(500);
		double balance1 = bank.getCustomer(1).getAccount().getBalance();
		System.out.println("客户：" + bank.getCustomer(1).getFirstName() + bank.getCustomer(1).getLastName() + " 的余额为：" + balance1);
		
	}
}

package exercise1;

public class Account {
	//封装属性
	private int id;
	private double balance;
	private double annuallnterestRate;
	//构造器
	public Account(int id,double balance,double annuallnterestRate) {
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}
	//方法
		//get
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getAnnuallnterestRate() {
		return this.annuallnterestRate;
	}
		//set
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
		//取钱
	public void withdraw(double amount) {
		if(this.balance > amount) {
			this.balance -= amount;
			System.out.println("成功取出：" + amount);
			return;
		}
		System.out.println("余额不足，取款失败！");
	}
		//存钱
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("成功存入：" + amount);
		}
	}
	
}

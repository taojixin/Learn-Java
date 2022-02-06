package exercise2;

public class Account {
	//封装属性
	private double balance;
	//构造器
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	//方法
	public double getBalance() {
		return this.balance;
	}
	//存款
	public void deposit(double amt) {
		if(amt > 0) {
			this.balance += amt;
			System.out.println("成功存款：" + amt);
			return;
		}
	}
	//取款
	public void withdraw(double amt) {
		if(amt < this.balance) {
			this.balance -= amt;
			System.out.println("取款：" + amt);
		}else {
			System.out.println("余额不足！");
		}
	}
}

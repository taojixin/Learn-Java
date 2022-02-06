package exercise1;

public class Customer {
	//封装属性
	private String firstName;
	private String lastName;
	private Account account;
	//构造器
	public Customer(String f,String l) {
		this.firstName = f;
		this.lastName = l;
	}
	//方法
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public Account getAccount() {
		return this.account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
}

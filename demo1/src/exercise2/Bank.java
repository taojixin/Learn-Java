package exercise2;

public class Bank {
	//封装属性
	private Customer[] customer;
	private int numberOfCustomer;
	//构造器
	public Bank() {
		customer = new Customer[10];
	}
	//方法
		//添加客户
	public void addCustomer(String f,String l) {
		Customer cust = new Customer(f,l);
		customer[numberOfCustomer++] = cust;
	}
		//获取客户数量
	public int getNumOfCustomer() {
		return this.numberOfCustomer;
	}
		//返回指定的客户
	public Customer getCustomer(int index) {
		if(index >= 0 && index < numberOfCustomer) {
			return customer[index];
		}else {
			return null;
		}
	}
}

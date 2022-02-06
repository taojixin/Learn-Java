package exercise1;

public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer("Jane","Smith");
		Account cus = new Account(1000,2000,0.0123);
		customer.setAccount(cus);
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);
		System.out.println("[" + customer.getFirstName() + customer.getLastName() + "]" + "has a account: id is " + customer.getAccount().getId() + ",annuallnterestRate id " + customer.getAccount().getAnnuallnterestRate() + ",balance is " + customer.getAccount().getBalance());
	}
}

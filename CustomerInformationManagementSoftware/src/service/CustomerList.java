package service;

import bean.Customer;

/*CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
*/

public class CustomerList {
	private Customer[] customers;//用来保存客户对象的数组
	private int total = 0;//记录已保存客户对象的数量
	//构造器
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	//将指定的客户添加到数组中
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}else {
			customers[total++] = customer;
			return true;
		}
	}
	//修改指定索引的客户信息
	public boolean replaceCustomer(int index,Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	//删除指定索引的客户
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		for(int i = index;i < total - 1;i++) {
			customers[i] = customers[i + 1];
		}
		//清空没有属性的customers
//		customers[total - 1] = null;
//		total--;
		//或
		customers[--total] = null;
		return true;
	}
	//获取所有客户信息
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for(int i = 0;i < total;i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	//获取指定索引上的客户
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	//获取客户数量
	public int getTotal() {
		return this.total;
	}
}

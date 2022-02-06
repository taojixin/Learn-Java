package junit;

import org.junit.Test;

import domain.Employee;
import service.NameListService;
import service.TeamException;

//对NameListService的测试
public class NameListServiceTest {
	@Test
	public void testGetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for(int i = 0;i < employees.length;i++) {
			System.out.println(employees[i]);
		}
	}
	@Test
	public void testGetEmployee() {
		NameListService service = new NameListService();
		int id = 101;
		
		try {
			Employee employee = service.getEmployee(id);
			System.out.println(employee);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}

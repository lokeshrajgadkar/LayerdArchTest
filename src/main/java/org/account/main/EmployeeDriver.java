package org.account.main;
import java.util.List;

import org.account.dao.EmployeeDao;
import org.account.dao.EmployeeDaoImpl;
import org.account.dto.Employee;
import com.account.service.EmployeeService;
import com.account.service.EmployeeServiceImpl;

public class EmployeeDriver {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);
		
		List<Employee> empList = employeeService.getEmployees();
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	}

}

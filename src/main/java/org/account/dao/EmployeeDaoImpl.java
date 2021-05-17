package org.account.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.account.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	List<Employee> empList = new ArrayList<Employee>();
	@Override
	public Employee findEmployeeById(int empId) {
		
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		System.out.println("In EmployeeDeo");
		Employee employee  = new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("Lokesh");
		employee.setHireDate(LocalDate.of(2021, 04, 20));
		employee.setSalary(30000);
		employee.setJob("Software Developer");
		empList.add(employee);
		
		employee = new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("Sanket");
		employee.setHireDate(LocalDate.of(2017, 02, 03));
		employee.setSalary(50000);
		empList.add(employee);
		return empList;
	}

	@Override
	public List<Employee> findEmployeesByDept() {
		
		return null;
	}

	@Override
	public void deleteEmployee(Employee empId) {
		
	}

}

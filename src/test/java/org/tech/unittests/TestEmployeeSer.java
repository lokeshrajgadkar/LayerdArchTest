package org.tech.unittests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.account.dao.EmployeeDao;
import org.account.dto.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mockito;
import com.account.service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
class TestEmployeeSer {
	static EmployeeService employeeService = null;
	static EmployeeDao mockEmployee = null;
	private static Employee emp1;
	private static Employee emp2;

@BeforeAll
static void setUpBeforClass() throws Exception {
	mockEmployeeDao = Mokito.mock(EmployeeDao.class);
	employeeService = new EmployeeServiceImpl(mockEmployeeDao);
	empl1 = new Employee();
	empl1.setEmpNo(1);
	empl1.setEmpName("Akash");
	empl1.setHireDate(LocalDate.of(2018, 11 ,22));
	empl1.setSalary(8000);
	empl1.setJob("Developer");
	emp2 = new Employee();
	emp2.setEmpNo(2);
	emp2.setEmpName("Mohit");
	emp2.setJob("Manager");
	emp2.setHireDate(LocalDate.of(2016, 07 , 02));
	emp2.setSalary(10000);
	Mokito.when(mockEmployeeDao.getEmployees().thenReturn(Arrays.asList(emp1, emp2));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@AfterEach
	void TearDown() throws Exception {
	}

	@Test
	void getAllEmployeestest() {
		List<Employee> allEmployees = employeeService.getEmplyees();
		assertNotNull(allEmployee);
		assertEquals(2, allEmployees.size());
	}

}

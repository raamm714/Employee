package Employee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
  EmpBusinessLogic empLogic =new EmpBusinessLogic();
  EmployeeDetails employee = new EmployeeDetails();
	@Test
	public void testCalculateAppraisal() {
		employee.setName("Ram");
		employee.setAge(27);
		employee.setMonthlySalary(33000);
		double appraisal =empLogic.calAppraisal(employee);
		assertEquals(1000,appraisal,0.0);
	}

	@Test
	public void testYearlySalary(){
		employee.setName("Ram");
		employee.setAge(27);
		employee.setMonthlySalary(1000);
		double salary=empLogic.yearlySalary(employee);
		assertEquals(12000,salary,0.0);
	}
	
	
	
}

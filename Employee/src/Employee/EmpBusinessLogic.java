package Employee;

public class EmpBusinessLogic {
	
	public double yearlySalary (EmployeeDetails employeeDetails){
		double yearlySalary =0;
		yearlySalary= employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	
	}

	public double calAppraisal(EmployeeDetails employeeDetails){
		double apprasial=0;
		if (employeeDetails.getMonthlySalary() <1000){
			apprasial=500;
		} else {
			apprasial=1000;
		}
		return apprasial;
		
	}
}

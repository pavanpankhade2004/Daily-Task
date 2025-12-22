package blcprogram;

public class Employee1 {

	String EmployeeName;
	int EmployeeId;
	double EmployeeSalary;
	
	public void setEmployee1(int  Id,String Name,double Salary) {	
		EmployeeName = Name;
		EmployeeId = Id;
		EmployeeSalary = Salary;
		
		
	}
		
	
	public void getEmployeeInfo() {
		System.out.println("Enter Employee Name is:"+EmployeeName);
		System.out.println("Enter Employee Id is:"+EmployeeId);
		System.out.println("Enter Employee  Salary is:"+EmployeeSalary);
		
		
		
		
		
	}
	}



package blcprogram;

import java.util.Scanner;

public class Employee {

	int employeeNumber;
	String employeeName;
	double employeeSalary;
	
	public void SetEmployeeDta() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Number");
		employeeNumber=Integer.parseInt(sc.nextLine());
		System.out.println("Enter employee Name:");
		employeeName=sc.nextLine();
		
		System.out.println("Enter employee Salary:");
		employeeSalary=Double.parseDouble(sc.nextLine());
		sc.close();
	}
	
	public void getEmployeeData() {
		System.out.println("Employee Number is:"+employeeNumber);
		System.out.println("Employee Name is:"+employeeName);
		System.out.println("Employee Salary is:"+employeeSalary);
	}

	}
    
    
    



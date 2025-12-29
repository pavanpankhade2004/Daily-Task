//ELC
package com.nit.Arrays;

import java.util.Scanner;

public class Employees1ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of the employee:");
		int size=Integer.parseInt(sc.nextLine());
		
		Employee employees1[]=new Employee[size];
		for(int i=0;i<employees1.length;i++)
		{
			System.out.println("Enter details for Employee:" +(i+1));
			System.out.println("Enter id:");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter Salary:");
			double salary=Double.parseDouble(sc.nextLine());
			
			employees1[i]=new Employee(id,name,salary);
			
			

	}		
			
		
		for(Employee e:employees1) {
			System.out.println(e);
	

	}
	}
}

package com.bhavna.main;

import com.bhavna.services.EmployeeOperations;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeOperations employeeInterface = new EmployeeOperations();
		
		employeeInterface.addEmployee();
		employeeInterface.countEmployeeStartWithS ();
		employeeInterface.checkLocation();
//		employeeInterface.getEmployeeLocation();
		//employeeInterface.checkSalary();
		//employeeInterface.sortName();
		employeeInterface.printAllEmployee();
	}
}

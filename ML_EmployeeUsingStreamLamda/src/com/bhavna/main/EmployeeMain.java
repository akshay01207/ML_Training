package com.bhavna.main;

import com.bhavna.services.EmployeeInterface;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeInterface employeeInterface = new EmployeeInterface();
		
		employeeInterface.addEmployee();
		employeeInterface.countEmployeeStartWithS ();
		employeeInterface.checkLocation();
//		employeeInterface.getEmployeeLocation();
		//employeeInterface.checkSalary();
		//employeeInterface.sortName();
		employeeInterface.printAllEmployee();
	}
}

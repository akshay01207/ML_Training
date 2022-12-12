package com.bhavna.main;

import com.bhavna.models.Department;
import com.bhavna.models.Employee;
import com.bhavna.services.Operations;

public class Main {
	public static void main(String[] args) {
		Operations operations=new Operations();
		operations.fetchData();
		operations.updateData();
		
		
		Employee employee = new Employee(915, "Akshay Kumar", 45000, "2022-07-22");
		operations.addEmployeeData(employee);
		
		Department department = new Department(1006, "ML Team Java",915);
		operations.addDepartmentData(department);
		
	}
}

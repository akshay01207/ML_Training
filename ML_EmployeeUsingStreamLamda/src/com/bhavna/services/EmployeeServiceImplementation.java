package com.bhavna.services;

import java.util.ArrayList;
import java.util.List;

import com.bhavna.models.Employee;
	
	public class EmployeeServiceImplementation{
		List<Employee> employeeList = new ArrayList<Employee>();

		public void addEmployee() {

			// Creating Address
			Employee employee1 = new Employee("akshay", 50000, "Greater Noida");
			Employee employee2 = new Employee("arpit", 40000, "Gzb");
			Employee employee3 = new Employee("ekjot", 45000, "Delhi");
			Employee employee4 = new Employee("Saumya", 50000, "Bihar");
			Employee employee5 = new Employee("sarthak", 55000, "Greater Noida");
			Employee employee6 = new Employee("Vishal", 65000, "Hyderabad");
			Employee employee7 = new Employee("vanisha", 47000, "New Delhi");
			Employee employee8 = new Employee("Rashi", 30000, "Hyderabad");

			employeeList.add(employee1);
			employeeList.add(employee2);
			employeeList.add(employee3);
			employeeList.add(employee4);
			employeeList.add(employee5);
			employeeList.add(employee6);
			employeeList.add(employee7);
			employeeList.add(employee8);
			
//			List nameStartWithS= employeeList.stream()
//					.sorted()
//					.collect(Collectors.toList());
//			System.out.println(employeeList);
//			System.out.println(nameStartWithS);
			
	}
}

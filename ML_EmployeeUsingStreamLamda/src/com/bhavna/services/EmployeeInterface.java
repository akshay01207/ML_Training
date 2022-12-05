package com.bhavna.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bhavna.models.Employee;

public class EmployeeInterface extends EmployeeServiceImplementation {
	
	//1. Find the employee count whose name starts with s
	public void countEmployeeStartWithS() {
		System.out.println("\nEmployee count whose name starts with 'S' ");
		int count = (int) employeeList.stream().filter(n -> n.getName().startsWith("S")).count();
		System.out.println(count);
	}

	//2. Print all the employees with location Hyderabad
	public void checkLocation() {
		System.out.println("\nAll employees with location Hyderabad");
		employeeList.stream().filter(h -> h.getLocation().equals("Hyderabad")).map(h -> h.getName())
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	//3. Print location and employee in the map
	public void getEmployeeLocation() {
		System.out.println("\nLocation and the Employee in the Map");
		Map<String, ArrayList<String>> employeeData = new HashMap<String, ArrayList<String>>();
		employeeList.parallelStream().forEach(s -> {
			if (employeeData.containsKey(s.getLocation())) {
				employeeData.get(s.getLocation()).add(s.getName());
			} else {
				employeeData.put(s.getLocation(), new ArrayList<String>());
				employeeData.get(s.getLocation()).add(s.getName());
			}
		});
		
		System.out.println(employeeData);
	}

	//4 Check salary greater than 100000 using stream
	public void checkSalary() {
		System.out.println("check salary greater than 10000");
		List<String> empList = employeeList.stream().filter(s -> s.getSalary() > 30000).map(s -> s.getName())
				.collect(Collectors.toList());
		System.out.println(empList);
	}

	//5. Sort employees name
	public void sortName() {
		System.out.println("Sorted Employee name");
		employeeList.stream().sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).forEach(System.out::println);
	}

	//6. Print All Employee Data
	public void printAllEmployee() {
		System.out.println("\nDetails of All Employees");
		Iterator<Employee> employeeItr = employeeList.iterator();
		while (employeeItr.hasNext()) {
			System.out.println(employeeItr.next());
		}
		
	}
}
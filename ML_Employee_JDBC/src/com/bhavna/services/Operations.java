package com.bhavna.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bhavna.connection.MyConnection;
import com.bhavna.models.Department;
import com.bhavna.models.Employee;

public class Operations {
	public void fetchData() {
		Connection connection = MyConnection.connection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select * from employee e inner join department d on e.employeeId= d.departmentId;");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3)
						+ " " + resultSet.getString(4) + " " + resultSet.getInt(5) + " " + resultSet.getString(6));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateData() {
		Connection connection = MyConnection.connection();
		try {
			Statement statement = connection.createStatement();
			String query = "update employee set employeeName='ekjot' where employeeId=103";
			statement.executeUpdate(query);
			ResultSet resultSet = statement.executeQuery("select * from employee;");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3)
						+ " " + resultSet.getString(4));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void addEmployeeData(Employee employee) {
		Connection connection = MyConnection.connection();
		try {
			Statement statement = connection.createStatement();
			String query1 = "insert into employee values('" + employee.getEmployeeId() + "', '"
					+ employee.getEmployeeName() + "','" + employee.getSalary() + "', '" + employee.getJoiningDate()
					+ "')";

			statement.executeUpdate(query1);

			ResultSet resultSet = statement.executeQuery("select * from employee;");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3)
						+ " " + resultSet.getString(4));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void addDepartmentData(Department department) {
		Connection connection = MyConnection.connection();
		try {
			Statement statement = connection.createStatement();
			String query2 = "insert into department values('" + department.getDepartmentId() + "', '"
					+ department.getDepartmentName() + "')";

			statement.executeUpdate(query2);

			ResultSet resultSet = statement.executeQuery("select * from department;");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

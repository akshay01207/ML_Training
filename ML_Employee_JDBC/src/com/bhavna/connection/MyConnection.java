package com.bhavna.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public static Connection connection() {
		Connection connection = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDatabase", "root",
					"Bhavna@123");
		} catch (Exception e) {

			System.out.println(e);
		}

		return connection;
	}

}

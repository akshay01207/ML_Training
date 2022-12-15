<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Employee Record</title>
</head>
<body>

	<h1>Employee List</h1>
	<table border="1" width="75%" cellpadding="2">
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Joining Date</th>
			<th>Department ID</th>
			<th>Department Name</th>
			<th>Status</th>

		</tr>
		<c:forEach var="employee" items="${list}">
			<tr>
				<td>${employee.employeeId}</td>
				<td>${employee.employeeName}</td>
				<td>${employee.employeeSalary}</td>
				<td>${employee.joiningDate}</td>
				<td>${employee.deptId}</td>
				<td>${employee.deptName}</td>
				<td>${employee.status}</td>

			</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add an appointment</title>
</head>
<body>
	<form:form action="saveAppointment" method="post"
		modelAttribute="appointment">
		<table>
			<form:hidden path="id" />

			<tr>
				<td>Date of the Appointment</td>
				<td><form:input path="appDate" /></td>
			</tr>

			<tr>
				<td>Time of the Appointment</td>
				<td><form:input path="appTime" /></td>
			</tr>

			<tr>
				<td>SSN</td>
				<td><form:input path="ssn" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Add appointment"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>
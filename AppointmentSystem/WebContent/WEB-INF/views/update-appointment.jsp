<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update an existing Appointment</title>
</head>
<body>
	<form:form action="updateAppointment" method="post"
		modelAttribute="editedappointment">
		<form:hidden path="id" />
		<table>
			<tr>
				<td>Date of the appointment</td>
				<td><form:input path="appDate" /></td>
			</tr>

			<tr>
				<td>Time of the appointment</td>
				<td><form:input path="appTime" /></td>
			</tr>

			<tr>
				<td>SSN</td>
				<td><form:input path="ssn" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="update appointment"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
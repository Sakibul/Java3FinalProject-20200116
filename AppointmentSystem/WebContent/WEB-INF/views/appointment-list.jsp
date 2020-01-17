<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new appointment</title>
</head>
<body>
	<div>
		<a href="addappointment">Add a new appointment</a>
	</div>

	<div align="center">
		Appointment List
		<table border="1">
			<tr>
				<th>Date of the Appointment</th>
				<th>Time of the Appointment</th>
				<th>SSN</th>
				<th>Edit Appointment</th>
				<th>Delete Appointment</th>
			</tr>

			<c:forEach var="appointment" items="${appointList}">
				<tr>
					<td><c:out value="${appointment.appDate}"></c:out></td>
					<td><c:out value="${appointment.appTime}"></c:out></td>
					<td><c:out value="${appointment.ssn}"></c:out></td>
					<td><a href="editappointment?appointmentId=${appointment.id}">update
							appointment</a></td>
					<td><a
						href="deleteappointment?appointmentId=${appointment.id}">delete
							appointment</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
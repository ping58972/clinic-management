<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Table</title>
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.3/examples/sign-in/">

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous"/>


</head>
<body>
<hr/>
<h1>CLINIC MANAGEMENT</h1>
<hr/>
	<div id="wrapper">
		<div id="header">
			<h2>Appointments</h2>
		</div>
	
	<div id="container">
		<div id="content">
			<!-- put new button: Add appointment -->
			<input type="button" value="Add Appointment"
				onclick="window.location.href='add-Appointment-form.jsp'; return false;"
				class="btn btn-primary btn-lg" />
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Patient Name</th>
						<th scope="col">Dentist Name</th>
						<th scope="col">Date</th>
						<th scope="col">Time</th>
						<th scope="col">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="app" items="${appList}">
						<!-- Set up a link for each dentist -->
						<c:url var="tempLink" value="AppointmentServlet">
							<c:param name="command" value="LOAD" />
							<c:param name="appId" value="${app.id }" />
						</c:url>
						<c:url var="deleteLink" value="AppointmentServlet">
							<c:param name="command" value="DELETE" />
							<c:param name="appId" value="${app.id }" />
						</c:url>
						<tr>
							<th scope="row">${app.id}</th>
							<td>${app.patient}</td>
							<td>${app.dentist}</td>
							<td>${app.workDate}</td>
							<td>${app.startTime}</td>
							<td><a href="${tempLink}">Update</a> | <a
								href="${deleteLink}"
								onclick="if(!(confirm('Are you sure you want to delete this Appointment?'))) return false">Delete</a>
							</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	<hr/>
<hr/>
	<div id="wrapper">
		<div id="header">
			<h2>Patient List</h2>
		</div>
	
	<div id="container">
		<div id="content">
			<!-- put new button: Add patient -->
			<input type="button" value="Add Patient"
				onclick="window.location.href='add-patient-form.jsp'; return false;"
					class="btn btn-primary btn-lg" />
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Full Name</th>
						<th scope="col">Email</th>
						<th scope="col">Age</th>
						<th scope="col">Address</th>
						<th scope="col">Phone Number</th>
						<th scope="col">Script</th>
						<th scope="col">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="pat" items="${patientList}">
						<!-- Set up a link for each dentist -->
						<c:url var="tempLink" value="PatientServlet">
							<c:param name="command" value="LOAD" />
							<c:param name="patId" value="${pat.id }" />
						</c:url>
						<c:url var="deleteLink" value="PatientServlet">
							<c:param name="command" value="DELETE" />
							<c:param name="patId" value="${pat.id }" />
						</c:url>
						<tr>
							<th scope="row">${pat.id}</th>
							<td>${pat.fullName}</td>
							<td>${pat.email}</td>
							<td>${pat.age}</td>
							<td>${pat.address}</td>
							<td>${pat.phoneNumber}</td>
							<td>${pat.script}</td>
							<td><a href="${tempLink}">Update</a> | <a
								href="${deleteLink}"
								onclick="if(!(confirm('Are you sure you want to delete this Patient?'))) return false">Delete</a>
							</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	<hr/>
<hr/>
	<div id="wrapper">
		<div id="header">
			<h2>Dentist Schedule</h2>
		</div>
	
	<div id="container">
		<div id="content">
			<!-- put new button: Add Schedule -->
			<input type="button" value="Add Schedule"
				onclick="window.location.href='add-schedule-form.jsp'; return false;"
				class="btn btn-primary btn-lg"/>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Date Day</th>
						<th scope="col">Time</th>
						<th scope="col">End Time</th>
						<th scope="col">Dentists</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="sch" items="${scheduleList}">
						<tr>
							<th scope="row">${sch.workDate}</th>
							<td>${sch.startTime}</td>
							<td>${sch.endTime}</td>
							<td>${sch.dentists}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	<hr/>
<hr/>
	<div id="wrapper">
		<div id="header">
			<h2>Dentist Members</h2>
		</div>
	
	<div id="container">
		<div id="content">
			<!-- put new button: Add member -->
			<input type="button" value="Add Member"
				onclick="window.location.href='add-student-form.jsp'; return false;"
				class="btn btn-primary btn-lg" />
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Full Name</th>
						<th scope="col">Email</th>
						<th scope="col">Experience Year</th>
						<th scope="col">Address</th>
						<th scope="col">Phone Number</th>
						<th scope="col">Type Dentist</th>
						<th scope="col">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="den" items="${dentistsList}">
						<!-- Set up a link for each dentist -->
						<c:url var="tempLink" value="DentistServlet">
							<c:param name="command" value="LOAD" />
							<c:param name="dentistId" value="${den.id }" />
						</c:url>
						<c:url var="deleteLink" value="DentistServlet">
							<c:param name="command" value="DELETE" />
							<c:param name="dentistId" value="${den.id }" />
						</c:url>
						<tr>
							<th scope="row">${den.id}</th>
							<td>${den.fullName}</td>
							<td>${den.email}</td>
							<td>${den.experienceYear}</td>
							<td>${den.address}</td>
							<td>${den.phoneNo}</td>
							<td>${den.typeDentist}</td>
							<td><a href="${tempLink}">Update</a> | <a
								href="${deleteLink}"
								onclick="if(!(confirm('Are you sure you want to delete this Dentist Member?'))) return false">Delete</a>
							</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	<hr/>
<hr/>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</html>
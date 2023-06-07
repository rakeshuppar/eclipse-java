<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="scholar.css" />
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">.</div>
			<div class="col-6">
				<form method="post" action="click" enctype="multipart/form-data">
					<h2>Scholarship Application Form</h2>

					<c:forEach items="${errors}" var="errors">
						<span style="color: red;">${errors.defaultMessage}</span>
						<br>
					</c:forEach>

					<span style="color: green;">${successfull} </span>

					<div>
						StudentName:<input value="${dto.studentName }" type="text" class="form-control"
							aria-label="studentName" name="studentName">
					</div>
					<br>
					<div>
						Gender: <input type="radio" name="gender" value="Male">Male
						<input type="radio" name="gender" value="Female">Female
					</div>
					<br>
					<div>
						Age:<input  value="${dto.age}" type="number" class="form-control" aria-label="age"
							name="age">
					</div>

					<div>
						Category:<select class="form-control" name="category">
							<option value=" ">Select</option>
							<option>Cat-1</option>
							<option>Cat-2A</option>
							<option>Cat-2B</option>
							<option>Cat-3A</option>
							<option>Cat-3B</option>
						</select>
					</div>
					<br>
					<div>
						Religion: <input name="religion" type="checkbox">Hindu <input
							name="religion" type="checkbox">Muslim <input
							name="religion" type="checkbox">Christian <input
							name="religion" type="checkbox">Others
					</div>
					<br>
					<div>
						MobileNumber:<input value="${dto.mobileNum }" type="text" class="form-control"
							aria-label="email" name="mobileNum">
					</div>

					<div>
						Email:<input value="${dto.email }"type="text" class="form-control" aria-label="email"
							name="email">
					</div>

					<div>
						AdharNumber: <input type="text" class="form-control" value="${dto.adharNum }"
							aria-label="adharNum" name="adharNum">
					</div>

					<div>
						Address:
						<textarea type="text" class="form-control" rows="4" cols="20"
							aria-label="address" name="address"></textarea>
					</div>
					<div>
					Select File:<input type="file" name="file"/>
					</div>
					<br>
					<div>
						<input type="submit" value="click">
					</div>
				</form>
			</div>
			<div class="col">.</div>
		</div>
	</div>
</body>
</html>
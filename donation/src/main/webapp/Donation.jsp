<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">.</div>

			<div class="col">
				<form method="post" action="save">
					<h1>Blood Donation Form</h1>

					<c:forEach items="${errors}" var="errors">
						<span style="color: red;">${errors.defaultMessage}</span><br>
					</c:forEach>

						<span style="color: green;">${successMsg} </span>

					<div>
						FirstName <input type="text" class="form-control"
							aria-label="First name" name="fName">
					</div>
					<div>
						LastName <input type="text" class="form-control"
							aria-label="Last name" name="lName">
					</div>
					<div>
						Age <input type="number" class="form-control"
							aria-label="age" name="age">
					</div>
					<div>
						Gender <input type="text" class="form-control"
							aria-label="First name" name="gender">
					</div>
					<div>
						BloodGroup <select type="select" class="form-control"
							aria-label="First name" name="bloodGroup">
							<option value=" ">Select</option>
							<option>A+</option>
							<option>B+</option>
							<option>AB+</option>
							<option>O+</option>
						</select>
					</div>
					<div>
						Address
						<textarea type="text" class="form-control" rows="4" cols="20"
							aria-label="First name" name="address"></textarea>
					</div>
					<div>
						<input type="submit" value="save">
					</div>

				</form>
			</div>
			<div class="col">.</div>
		</div>
	</div>



</body>
</html>
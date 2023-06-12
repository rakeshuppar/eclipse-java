<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="job.js"></script>
<title>X-Workz</title>
</head>

<body style="background-color: silver; border-spacing: 100px;">

	<div class="container">

		<div class="row">

			<div class="col">.</div>

			<div class="col-6">
				<h1 style="color: maroon; text-align: center;">Job Application
					Form</h1>
				<br>
				<c:forEach items="${errors }" var="errors">
					<span style="color: red;">${errors.defaultMessage}</span>
					<br>
				</c:forEach>

				<span style="color: green;">${Successfull}</span> <br> <a
					href="image.jsp"> DownloadFile</a> 
					<a href="display">DisplayDetails</a>

				<form action="send" method="post" enctype="multipart/form-data" name="new">


					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Name
						</label> <input type="text" id="name" name="name" class="form-control"
							value="${dto.name}">
							<div id='fname' style="color: red;">Enter your Name</div>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Qualification
						</label> <input type="text" id="qualification" name="qualification" class="form-control"
							value="${dto.qualification}">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Age
						</label> <input type="text" id="age" name="age" class="form-control"
							value="${dto.age}">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Gender
						</label> <input type="text" id="gender" name="gender" class="form-control"
							value="${dto.gender}">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">MobileNumber
						</label> <input type="number" id="mobilenum" name="mobilenum" class="form-control"
							value="${dto.mobilenum}">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Email
						</label> <input type="text" id="email" name="email" class="form-control"
							value="${dto.email}">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Address
						</label>
						<textarea name="address" id="address" class="form-control" rows="4" cols="15"
							value="${dto.address}"></textarea>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Select
							File </label> <input type="file" name="file" class="form-control">
					</div>
					<br> <input type="submit" onclick="valid()" value="SUBMIT">
				</form>
			</div>

			<div class="col">.</div>
		</div>
	</div>
</body>
</html>
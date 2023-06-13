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

<script>
	function validationForm() {
		var name = document.getElementById("name").value;
		var qualification = document.getElementById("qualification").value;
		var age = document.getElementById("age").value;
		var gender = document.getElementById("gender").value;
		var mobilenum = document.getElementById("mobilenum").value;
		var email = document.getElementById("email").value;
		var address = document.getElementById("address").value;

		if (name == "") {
			// 			alert("Enter the Name");
			document.getElementById("name2").innerHTML = "* Enter the Name";
			return false;
		}
		if (name.length < 3) {
			// 			alert("Name must be at least 3 char");
			document.getElementById("name2").innerHTML = "* Name should have at least 3 letters";
			return false;
		}
		if (qualification == "") {
			// 			alert("Enter the qualification");
			document.getElementById("qualification2").innerHTML = "* Enter the Qualification";
			return false;
		}
		if (qualification.length < 4) {
			// 			alert("Qualification must be at least 4 char");
			document.getElementById("qualification2").innerHTML = "* Qualification must be greater than  4";
			return false;
		}
		if (age < 18) {
			// 			alert("Age must be greater than 18");
			document.getElementById("age2").innerHTML = "*Age must be greater than 18";
			return false;
		}
		if (gender == "") {
			// 			alert("Please enter the gender");
			document.getElementById("gender2").innerHTML = "* Gender should not be empty";
			return false;
		}

		if (mobilenum == "") {
			// 			alert("Please enter the Mobile Number");
			document.getElementById("mobilenum2").innerHTML = "* Please enter the Mobile Number";
			return false;
		}
		if (email == "") {
			// 			alert("Enter the Email ID");
			document.getElementById("email2").innerHTML = "* Enter the Email ID";
			return false;
		}
		if (email.length < 10) {
			// 			alert("Email ID  must be at least 10 char");
			document.getElementById("email2").innerHTML = "* Email ID must have at least 10 letters";
			return false;
		}
		if (address == "") {
			// 			alert("Please enter the Address");
			document.getElementById("address2").innerHTML = "* Please enter the Address";
			return false;
		}
		return true;
	}
</script>

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
					href="image.jsp"> DownloadFile</a> <a href="display">DisplayDetails</a><a></a>
				<form action="send" method="post" enctype="multipart/form-data"
					onsubmit="return validationForm()">


					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Name
						</label> <input type="text" id="name" name="name" onchange="return validationForm()"
							class="form-control" value="${dto.name} " /><span id="name2"
							style="color: red">*</span>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Qualification
						</label> <input type="text" id="qualification" name="qualification"
							class="form-control" value="${dto.qualification}" /><span
							id="qualification2" style="color: red">*</span>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Age
						</label> <input type="text" id="age" name="age" class="form-control"
							value="${dto.age}" /><span id="age2" style="color: red">*</span>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Gender
						</label> <input type="text" id="gender" name="gender" class="form-control"
							value="${dto.gender}" /><span id="gender2" style="color: red">*</span>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">MobileNumber
						</label> <input type="number" id="mobilenum" name="mobilenum"
							class="form-control" value="${dto.mobilenum}" /><span
							id="mobilenum2" style="color: red">*</span>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Email
						</label> <input type="text" id="email" name="email" class="form-control"
							value="${dto.email}" /><span id="email2" style="color: red">*</span>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Address
						</label>
						<textarea name="address" id="address" class="form-control"
							rows="4" cols="15" value="${dto.address}" /></textarea>
						<span id="address2" style="color: red">*</span>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Select
							File </label> <input type="file" name="file" class="form-control" /><span
							style="color: red">*</span>
					</div>
					<br> <input type="submit" value="SUBMIT"
						onclick="validationForm()">
				</form>
			</div>
			<div class="col">.</div>

		</div>

	</div>

</body>
</html>
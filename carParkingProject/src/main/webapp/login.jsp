<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script type="text/javascript">
	function validEmail() {
		var email = document.getElementById("email").value;

		if (email.length < 10 || email == null || email == "") {
			document.getElementById("email2").innerHTML = "Enter the Email Id"
			return false;
		} else {
			document.getElementById("email2").innerHTML = " "
			return false;
		}
		return true;
	}

	function validPassword() {
		var password = document.getElementById("password").value;

		if (password == null || password == "" || password.length < 2) {
			document.getElementById("password2").innerHTML = "Enter the Password"
			return false;
		} else {
			document.getElementById("password2").innerHTML = " "
			return false;
		}
		return true;
	}
</script>

</head>
<body style="background-color: silver;">
	<nav class="navbar navbar-expand-lg navbar-light bg-primary">
		<span><img alt="10px" width="80px"
			src="https://www.x-workz.in/Logo.png"></span>
	</nav>
	<div class="container text-center;">
		<div class="row">
			<div class="col">.</div>
			<div class="col">
				<br>
				<h1 style="color: maroon; text-align: center;">Login Page</h1>
				<br> <span style="color: red; text-align: center;">${error}</span>
				<br>
				<form action="login" method="post">

					<div class="mb-3">
						<span style="color: red;" id="email2"></span> <input type="text"
							name="email" id="email" class="form-control"
							onchange="validEmail()" placeholder="abcd@gmail.com" />
					</div>

					<div class="mb-3">
						<span style="color: red;" id="password1"></span> <input
							type="text" name="password" id="password" class="form-control"
							onchange="validPassword()" placeholder="****" />
					</div>

					<div class="d-grid gap-2 col-4 mx-auto">
						<input type="submit" value="login" style="text-align: center;"
							class="btn btn-dark btn-lg" />
					</div>

				</form>

			</div>
			<div class="col">.</div>
		</div>
	</div>
</body>

<nav class="bg-primary">
	<footer
		style="text-align: center; color: red; height: 80px; margin-top: 372px">
		<large>@2023 Copyright&copy;xworkz.com</large>
	</footer>
</nav>

</html>
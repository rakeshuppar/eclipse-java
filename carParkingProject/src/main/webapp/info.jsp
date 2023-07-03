<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>

<body style="background-color: silver;">

	<nav class="navbar navbar-dark bg-primary">
		<div class="container-fluid">
			<span><img alt="10px" width="100px"
				src="https://www.x-workz.in/Logo.png"></span>

			<ul>
				<a type="submit" href="login.jsp" class="btn btn-dark btn-lg">Logout</a>
				<a style="color: black; font-size: x-large; font-stretch: narrower;">Admin,${dtos.name}</a>
			</ul>
		</div>
	</nav>
	<br>
	<!--  	<h1 style="color: green; text-align: center;">${success}</h1>-->
	<br>


	<a type="button" class="btn btn-dark btn-lg" href="adminInfo.jsp">Parking
		Info</a>

	<a type="button" class="btn btn-dark btn-lg" href="search.jsp">Show
		Information</a>

	<br>
</body>

<nav class="bg-primary">
	<footer
		style="text-align: center; color: red; height: 80px; margin-top: 535px">
		<large>@2023 Copyright&copy;xworkz.com</large>
		<pre>Last login Time,${dtos.lastLoginTime}</pre>
	</footer>
</nav>

</html>
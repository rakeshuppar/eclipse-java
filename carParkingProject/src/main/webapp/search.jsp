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
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body style="background-color: silver;">
	<nav class="navbar navbar-dark bg-primary">
		<div class="container-fluid">
			<span><img alt="10px" width="80px"
				src="https://www.x-workz.in/Logo.png"></span>
			<ul>
				<a type="submit" href="info.jsp" class="btn btn-dark btn-lg">Home</a>
				<a style="color: black; font-size: x-large; font-stretch: narrower;">Admin,${dtos.name}</a>
			</ul>


			<div class="collapse navbar-collapse" id="navbarSupportedContent">
			</div>
		</div>
	</nav>
	<br>
	<h1 style="text-align: center; color: maroon;">Search Parking
		Location</h1>
	<br>

	<div class="container">
		<div class="row">
			<div class="col">.</div>
			<div class="col">
				<form action="search" method="get" style="text-align: center;">
					<div>
						<select name="location" id="location" class="form-select"
							aria-label="Default select example" style="text-align: center;">
							<option selected style="text-align: center;">Select
								Location</option>
							<option value="Rajajinagar">Rajajinagar</option>
							<option value="BTM">BTM</option>
							<option value="Hebbal">Hebbal</option>
							<option value="Kengeri">Kengeri</option>
							<option value="Jayanagar">Jayanagar</option>
							<option value="Indiranagar">Indiranagar</option>
						</select>
					</div>
					<br> <input type="submit" value="serach"
						class="btn btn-info btn-lg" />
				</form>
			</div>
			<div class="col">.</div>
		</div>
	</div>
	<br>
	<table class="table">
		<thead class="table-dark">
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Location</th>
				<th scope="col">Type</th>
				<th scope="col">Classification</th>
				<th scope="col">Days</th>
				<th scope="col">Price</th>
				<th scope="col">Discount</th>
			</tr>
		</thead>
		<tbody class="table-light">
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.id }</td>
					<td>${dto.location}</td>
					<td>${dto.type}</td>
					<td>${dto.classfication}</td>
					<td>${dto.days}</td>
					<td>${dto.price}</td>
					<td>${dto.discount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
<nav class="bg-primary">
	<footer
		style="text-align: center; color: red; height: 80px; margin-top: 365px">
		<large>@2023 Copyright&copy;xworkz.com</large>
		<pre>Last login Time,${dtos.lastLoginTime}</pre>
	</footer>
</nav>
</html>
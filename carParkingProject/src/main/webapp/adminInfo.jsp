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

<nav class="navbar navbar-dark bg-primary">
	<div class="container-fluid">
		<span><img alt="10px" width="100px"
			src="https://www.x-workz.in/Logo.png"></span>

		<ul>
			<a type="submit" href="info.jsp" class="btn btn-dark btn-lg">Home</a>
			<a style="color: black; font-size: x-large; font-stretch: narrower;">Admin,${dtos.name}</a>
		</ul>
	</div>
</nav>
<body style="background-color: silver;">
	<div class="container text-center;">
		<div class="row">
			<div class="col">.</div>
			<div class="col-6">

				<h1 style="color: maroon; text-align: center;">Admin
					Information</h1>
				<span style="color: red;">${error}</span> <span
					style="color: green;">${success}</span> 
					<span style="color: red;">${dtoError}</span>
				<br>
				<form action="adminInfo" method="post">
					<div class="mb-3">
						<select name="location" id="location" class="form-select"
							aria-label="Default select example">
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
					<br>
					<div class="mb-3">
						<select class="form-select" aria-label="Default select example"
							name="type" id="type">
							<option selected style="text-align: center;">Select
								Vehicle Type</option>
							<option value="Two_Wheeler">Two_Wheeler</option>
							<option value="Four_Wheeler">Four_Wheeler</option>
						</select>
					</div>
					<br>
					<div class="mb-3">
						<select class="form-select" aria-label="Default select example"
							name="classfication" id="classfication">
							<option selected style="text-align: center;">Select
								Vehicle Classification</option>
							<option value="Maruti Suzuki">Maruti Suzuki</option>
							<option value="BMW">BMW</option>
							<option value="Hyundai">Hyundai</option>
							<option value="Renault">Renault</option>
							<option value="Toyata">Toyata</option>
							<option value="Honda">Honda</option>
							<option value="Skoda">Skoda</option>
							<option value="Tata Motors">Tata Motors</option>
							<option value="Bike">Bike</option>
						</select>
					</div>
					<br>
					<div class="mb-3">
						<select class="form-select" aria-label="Default select example"
							name="days" id="days">
							<option selected style="text-align: center;">Select
								Number Of Days</option>
							<option value="1">1</option>
							<option value="7">7</option>
							<option value="15">15</option>
							<option value="30">30</option>
							<option value="90">90</option>
							<option value="180">180</option>
							<option value="365">365</option>
						</select>
					</div>
					<br>
					<div class="mb-3">
						<input type="text" name="price" id="price" class="form-control"
							placeholder="price(Rs)" style="text-align: center;">
					</div>

					<div class="mb-3">
						<input type="text" name="discount" id="discount"
							class="form-control" placeholder="discount(%)"
							style="text-align: center;">
					</div>
					<br>
					<div class="d-grid gap-2 col-4 mx-auto">
						<input type="submit" value="Save" style="text-align: center;"
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
		style="text-align: center; color: red; height: 80px; margin-top: 85px">
		<large>@2023 Copyright&copy;xworkz.com</large>
		<pre>Last login Time,${dtos.lastLoginTime}</pre>
	</footer>
</nav>
</html>
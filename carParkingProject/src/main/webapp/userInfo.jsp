<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<meta charset="utf-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


<script type="text/javascript">
	function EmailAjax() {
		console.log("EmailAjax log-in");
		var email = document.getElementById("email").value;
		var url = "http://localhost:8081/carParkingProject/validateEmail/"
				+ email;
		console.log(url);
		const xmlHttp = new XMLHttpRequest();
		xmlHttp.open("GET", url);
		xmlHttp.send();
		xmlHttp.onload = function() {
			console.log(this.responseText);
			document.getElementById("display").innerHTML = this.responseText;
		}

	}
</script>

<script>
	function ajaxWithObject() {
		console.log("ajaxWithObject logged in");
		var location = document.getElementById("location").value;
		var type = document.getElementById("type").value;
		var classification = document.getElementById("classification").value;
		var days = document.getElementById("days").value;

		var url = "http://localhost:8081/carParkingProject/getPriceAndDiscount/"
				+ location + "/" + type + "/" + classification + "/" + days;
		console.log(url);
		const xmlHttp = new XMLHttpRequest();
		xmlHttp.open("GET", url);
		xmlHttp.send();
		xmlHttp.onload = function() {
			document.getElementById("display").innerHTML = this.responseText;
			console.log(this.responseText);
			var obj = JSON.parse(this.responseText);
			console.log(obj.price);
			console.log(obj.discount);
			document.getElementById("price").value = obj.price;
			document.getElementById("discount").value = obj.discount;
			var total = obj.price - ((obj.price * obj.discount) / 100);
			console.log(total);
			document.getElementById("total").value = total;

		}
	}
</script>



</head>
<body style="background-color: silver;">
	<nav class="navbar navbar-dark bg-primary">
		<div class="container-fluid">
			<span><img alt="10px" width="100px"
				src="https://www.x-workz.in/Logo.png"></span>
		</div>
	</nav>
	<h5 style="color: red;">${error}<a href="">here</a>
	</h5>
	<h5 style="color: green">${success}</h5>

	<div class="container">
		<div class="row">
			<div class="col">.</div>

			<div class="col-6">
				<form action="save" method="post" onsubmit="return validateFields()">
					<span style="color: red;" id="display"></span>
					<h1 style="color: maroon; text-align: center;">User
						Registration Page</h1>
					<br>
					<div class="mb-3">
						UserName<input type="text" name="userName" id="name"
							class="form-control" style="text-align: center;">
					</div>
					<br>
					<div class="mb-3">
						<input type="text" name="email" id="email" onchange="EmailAjax()"
							class="form-control" style="text-align: center;">
					</div>
					<br>
					<div class="mb-3">
						MobileNumber<input type="text" name="mobileNum" id="mobileNum"
							class="form-control" style="text-align: center;">
					</div>
					<br>
					<div class="mb-3">
						VehicleNumber<input type="text" name="vehicleNumber"
							id="vehicleNumber" class="form-control"
							style="text-align: center;">
					</div>
					<br>
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
							name="classification" id="classification">
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
							name="days" id="days" onchange="ajaxWithObject()">
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
						Price<input type="text" name="price" id="price"
							readonly="readonly" class="form-control" placeholder="price(Rs)"
							style="text-align: center;">
					</div>
					<br>
					<div class="mb-3">
						Discount<input type="text" name="discount" id="discount"
							readonly="readonly" class="form-control"
							placeholder="discount(%)" style="text-align: center;">
					</div>
					<div class="mb-3">
						TotalAmount<input type="text" name="total" id="total"
							value="${ dto1.total}" class="form-control"
							style="text-align: center;">
					</div>

					<br>
					<div class="mb-3">
						Agreement<input type="checkbox" name="agreement" id="agreement"
							style=text-align:center;
							onchange="document.getElementById('saved').disabled=!this.checked;">
					</div>
					<br>
					<div class="d-grid gap-2 col-4 mx-auto">
						<input type="submit" id="saved" value="Save" disabled="disabled"
							style="text-align: center;" class="btn btn-dark btn-lg" />
					</div>
				</form>

			</div>

			<div class="col">.</div>

		</div>
	</div>
</body>
<nav class="bg-primary">
	<footer
		style="text-align: center; color: red; height: 80px; margin-top: 365px">
		<large>@2023 Copyright&copy;xworkz.com</large>
	</footer>
</nav>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
</html>
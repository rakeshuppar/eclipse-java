<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<a href="view">View</a>
</head>
<body>
	<h1>Contact Application</h1>
	<span><a href="view.jsp">View</a></span>
	
	<form action="save" method="post">
		<div>
			Name:<input type="text" name="name">
		</div>
		<div>
			Email:<input type="email" name="email">
		</div>
		<div>
			Country:<select name="country">
				<option value="India">India</option>
				<option value="Pakistan">Pakistan</option>
				<option value="SriLanka">SriLanka</option>
				<option value="Bangladesh">Bangladesh</option>
				<option value="Nepal">Nepal</option>
			</select>
		</div>
		<div>
			MobileNumber:<input type="text" name="mobileNum">
		</div>
		<div>
			Type:<select name="type">
				<option value="Family">Family</option>
				<option value="College Friend">College Friend</option>
				<option value="Relation">Relation</option>
				<option value="School Friend">School Friend</option>
			</select>
		</div>
		<label for="Description">Description:</label>
		<div>
			<textarea id="des" name="description" rows="4" cols="50"></textarea>
		</div>
		<div>
			<input type="submit" value="save">
		</div>
	</form>
</body>
</html>
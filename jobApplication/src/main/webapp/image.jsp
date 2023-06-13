<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: silver;">
	<h1 style="color: maroon; text-align: center;">Downloading Files
		Page</h1>
	<br>
	<form action="fileDownload" method="get" style="text-align: center;">
		FileName :<input type="text" name="fileName" /> 
		ContentType :<input type="text" name="contentType" />
		<input type="submit" value="Download" />
	</form>
</body>
</html>
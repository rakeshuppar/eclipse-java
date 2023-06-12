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
<title>Insert title here</title>
</head>
<body>
<a href="scholar.jsp"></a>

<h1 style="color: maroon; text-align: center;" >Submission Form</h1>

<form action="fileDownload" method="get" style="text-align: center;">
FileName:<input type="text" name="fileName"/>
ContentType:<input type="text" name="contentType"/>
<input type="submit" value="Download"/>
</form>

</body>
</html>
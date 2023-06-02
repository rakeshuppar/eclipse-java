<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Company:${company}</h3>
<pre>
<form action="info" method="post">
From:<input type="text" name="from">
<br>
To:<input type="text" name="to">
<br>
Amount:<input type="text" name="amount">
<br>
<button type="submit" value="send">Send Amount</button>
</form>
<a href="amount.jsp">Amount Page</a>
</pre>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<%= request.getParameter("name") %>
<%= request.getParameter("qualification") %>
<%= request.getParameter("stream") %>
<%= request.getParameter("course") %>
<%= request.getParameter("college") %>
<%= request.getParameter("city") %>
<%= request.getParameter("state") %>
<%= request.getParameter("country") %>
</pre>
</body>
</html>
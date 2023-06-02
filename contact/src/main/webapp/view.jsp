<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
<thead>
<tr>
<th scope="col">Names</th>
<th scope="col">Email</th>
<th scope="col">Country</th>
<th scope="col">MobileNumber</th>
<th scope="col">Type</th>
<th scope="col">Description</th>
</tr>
</thead>
<tbody>
<c:forEach var="dto" items="${list}">
<tr>
<th scope="row1"></th>
<td>${dto.hname }</td>
<td>${dto.email }</td>
<td>${dto.hcountry }</td>
<td>${dto.hnumber }</td>
<td>${dto.htype }</td>
<td>${dto.hdescription }</td>
</tr>
</c:forEach >

<%--<c:forEach var="skill2" items="${list }" >
<tr>
<th scope="row2"></th>
<td>${hname }        </td>
<td>${email }        </td>
<td>${hcountry }     </td>
<td>${hnumber }      </td>
<td>${htype }        </td>
<td>${hdescription } </td>
</tr>
</c:forEach > --%>

<%-- <c:forEach var="skill3" items="${list2 }" >
<tr>
<th scope="row3">3</th>
<td>${hname }</td>
<td>${email }</td>
<td>${hcountry }</td>
<td>${hnumber }</td>
<td>${htype }</td>
<td>${hdescription }</td>
</tr>
</c:forEach > --%>
</tbody>
</table>
</body>
</html>
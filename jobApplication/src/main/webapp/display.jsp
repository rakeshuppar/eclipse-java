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
	<table class="table">
		<thead class="table-dark">
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Qualification</th>
				<th scope="col">Age</th>
				<th scope="col">Gender</th>
				<th scope="col">Mobile Number</th>
				<th scope="col">Email</th>
				<th scope="col">Address</th>
				<th scope="col">File</th>
			</tr>
		</thead>

		<tbody class="table-light">
			<c:forEach items="${fall}" var="song">
				<tr>
					<td>${song.name}</td>
					<td>${song.qualification }</td>
					<td>${song.age}</td>
					<td>${song.gender }</td>
					<td>${song.mobilenum}</td>
					<td>${song.email }</td>
					<td>${song.address }</td>
					<td><a target="_blank"
						href="fileDownload?fileName=${song.fileName}&contectType=${song.contectType}">
							${song.fileName}</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</body>
</html>
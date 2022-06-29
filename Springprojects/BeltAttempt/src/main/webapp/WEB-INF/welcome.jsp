<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Login And Registration</title>
</head>
<body>
<h1>Dashboard</h1>
<h3>Welcome, <c:out value="${user.userName}"></c:out>!</h3>
<h4>TV Shows</h4>
<table>
<thead>
	<tr>
		<th>Shows</th>
		<th>Networks</th>
		<th>Average Rating</th>
	</tr>
</thead>
<tbody>
	<c:forEach  var="tvshow" items="${ tvshows }">
		<tr>
			<td><a href="/tvshows/${ tvshow.id }"><c:out value="${tvshow.title }"></c:out></a></td>
			<td><c:out value="${tvshow.network }"></c:out></td>	
			<td><c:out value="${tvshow.rating }"></c:out></td>	
		</tr>
	</c:forEach>
</tbody>
</table>
<p><a href="/tvshows/new">new show</a></p>
<p><a href="/logout">logout</a></p>
</body>
</html>
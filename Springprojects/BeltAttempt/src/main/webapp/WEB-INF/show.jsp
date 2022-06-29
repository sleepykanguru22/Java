<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>show</title>
</head>
<body>

	<h1>show <c:out value="${ tvshows.title }" /></h1>
	<p><a href="/welcome">dashboard</a></p>
	
	<h2> Posted by:<c:out value="${ tvshows.creator.userName}" /> </h2>
	
	<p>newtwork:<c:out value="${ tvshows.network }" /></p>
	<p>description:<c:out value="${ tvshows.description }" /></p>


<p><a href="/tvshows/${tvshows.id}/edit">edit</a></p>
</body>
</html>
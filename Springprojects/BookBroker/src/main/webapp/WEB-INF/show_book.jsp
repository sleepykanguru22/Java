<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show book</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1><c:out value="${book.title}"></c:out></h1>
<br>
<p><a href="/books">back to the shelves</a></p>
<br>
<span style="color: red"><c:out value="${user.userName}"></c:out></span>
<span> read </span>
<span style="color: purple"><c:out value="${book.title}"></c:out></span>
<span> by </span>
<span style="color: green"><c:out value="${book.author}"></c:out></span>
<br>
<span>Here are <c:out value="${user.userName}"></c:out>'s thoughts:</span>
<hr>
<p><c:out value="${book.thoughts}"></c:out></p>
<c:if test = "${userId == book.user.id}">
   <hr>
	<a href="/books/edit/${book.id}">Edit</a>
</c:if>
</body>
</html>
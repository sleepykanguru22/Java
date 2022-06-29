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
<title>Insert title here</title>
</head>
<body>
<h1>Add new show</h1>
<form:form action="/tvshows/create" method="post" modelAttribute="tvshow">
	<p>
   		<form:label path="title">title:</form:label>
   		<form:input  path="title" />
   		<form:errors class="text-danger" path="title" />
   	</p>
   	
   	<p>
   		<form:label path="network">network:</form:label>
   		<form:input  path="network" />
   		<form:errors class="text-danger" path="network" />
   	</p>

	<p>
   		<form:label path="rating">rating:</form:label>
   		<form:input  path="rating" />
   		<form:errors class="text-danger" path="rating" />
   	</p>
   	
   	<p>
   		<form:label path="description">description:</form:label>
   		<form:input  path="description" />
   		<form:errors class="text-danger" path="description" />
   	</p>
   	
   	<button>save</button>
</form:form>
<p><a href="/welcome">dashboard</a></p>
<p><a href="/logout">logout</a></p>
</body>
</html>
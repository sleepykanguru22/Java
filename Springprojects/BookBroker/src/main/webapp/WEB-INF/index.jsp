<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Book Club</h1>
<p>A place for friends to share thoughts on books.</p>

<form:form action="/register" method="post" modelAttribute="newUser">

	<table>
		<thead>
	    	<tr>
	            <td colspan="2">Register</td>
	        </tr>
	    </thead>
	    <thead>
	    	<tr>
	            <td class="float-left">User Name:</td>
	            <td class="float-left">
	            	<form:errors path="userName" class="text-danger"/>
					<form:input class="input" path="userName"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Email:</td>
	            <td class="float-left">
	            	<form:errors path="email" class="text-danger"/>
					<form:input class="input" path="email"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Password:</td>
	            <td class="float-left">
	            	<form:errors path="password" class="text-danger"/>
					<form:input class="input" path="password"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Confirm PW:</td>
	            <td class="float-left">
	            	<form:errors path="confirm" class="text-danger"/>
					<form:input class="input" path="confirm"/>
	            </td>
	        </tr>
	        <tr>
	        	<td colspan=2><input class="input" class="button" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
<hr>
<form:form action="/login" method="post" modelAttribute="newLogin">

	<table>
		<thead>
	    	<tr>
	            <td colspan="2">Log In</td>
	        </tr>
	    </thead>
	    <thead>
	        <tr>
	            <td class="float-left">Email:</td>
	            <td class="float-left">
	            	<form:errors path="email" class="text-danger"/>
					<form:input class="input" path="email"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Password:</td>
	            <td class="float-left">
	            	<form:errors path="password" class="text-danger"/>
					<form:input class="input" path="password"/>
	            </td>
	        </tr>
	        <tr>
	        	<td colspan=2><input class="input" class="button" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
</body>
</html>
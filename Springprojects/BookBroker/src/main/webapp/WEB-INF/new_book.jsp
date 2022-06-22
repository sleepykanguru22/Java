<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new book</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="in-line">
<h2 class="float-left"><a href="/books">back to the shelves</a></h2>
</div>
<h1>Add a Book to Your Shelf!</h1>

<form:form action="/newBook" method="post" modelAttribute="book">

	<table>
	    <thead>
	    	<tr>
	            <td class="float-left">Title:</td>
	            <td class="float-left">
	            	<form:errors path="title" class="text-danger"/>
					<form:input class="input" path="title"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Author:</td>
	            <td class="float-left">
	            	<form:errors path="author" class="text-danger"/>
					<form:input class="input" path="author"/>
	            </td>
	        </tr>        
	        <tr>
	            <td class="float-left">My Thoughts:</td>
	            <td class="float-left">
	            	<form:errors path="thoughts" class="text-danger"/>
					<form:textarea rows="3" class="input" path="thoughts"/>
	            </td>
	        </tr>   
	        <tr>
	        	<td colspan=2><input class="input" class="button" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
</div>
</body>
</html>
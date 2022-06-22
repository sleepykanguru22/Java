<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new question</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>What is your question?</h1>
<p><a href="/">Home</a></p>
<hr>
<h6 style="color: red;">${errorMsg}</h6>
<form:form action="/questions/new" method="post" modelAttribute="question">

	<table>
	    <thead>
	    	<form:hidden class="input" path="id" value="${id}"/>
	    	<tr>
	            <td class="float-left">Question:</td>
	            <td class="float-left">
	            	<form:errors path="text" class="text-danger"/>
					<form:textarea rows="4" class="input" path="text"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Tags:</td>
	            <td class="float-left">
					<input class="input" name="listOfTags" id="listOfTags"/>
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
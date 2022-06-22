<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new answer</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>${question.text}</h1>

<h3 class="in-line">
Tags:
<c:forEach var="tag" items="${question.tags}">
	<button type="button"><c:out value="${tag.subject}"></c:out></button>
</c:forEach>
</h3>
<p><a href="/">Home</a></p>
<hr>
<table>
	<thead>
		<tr>
			<th class="float-left">Answers</th>
		</tr>
	</thead>
    <tbody>
		<c:forEach var="answer" items="${question.answers}">
			<tr>
				<td class="float-left"><c:out value="${answer.text}"></c:out></td>
			</tr>
		</c:forEach>
    </tbody>
</table>

<hr>
<h4>Add your answer:</h4>
<form:form action="/answers/${question.id}" method="post" modelAttribute="answer">
	<table>
	    <thead>
	    	<tr>
	            <td class="float-left">Answer:</td>
	            <td class="float-left">
	            	<form:errors path="text" class="text-danger"/>
					<form:textarea rows="4" class="input" path="text"/>
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
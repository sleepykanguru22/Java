<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) --> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- Functions --> 
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
 <h1>All DA Super Heros!</h1>
   <table class="table">
   	<thead>
   		<tr>
   			<th>ID</th>
   			<th>Name</th>
   			<th>Super Power</th>
   			<th>Weakness</th>
   			<th>Actions</th>
   		</tr>
   	</thead>
   	<tbody>
   		<c:forEach  var="superHero" items="${ superHeros }">
   			<tr>
   				<td><c:out value="${ superHero.getId() }" /></td>
   				<td><a href="/superheros/${ superHero.id }"><c:out value="${ superHero.getName() }" /></a></td>
   				<td><c:out value="${ superHero.getSuperPower() }" /></td>
   				<td><c:out value="${ superHero.getWeakness() }" /></td>
   				<td>
   					<a href="/superheros/${ superHero.id }/edit">Edit this Hero</a>
   					<form action="/superheros/${ superHero.id }/delete" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input class="btn btn-danger" type="submit" value="Delete">
					</form>
   				</td>
   			</tr>
   		</c:forEach>
   	</tbody>
   </table>
   
   <a href="/superheros/new">Create A New Super Hero</a>
   <a href="/sidekicks/new">Create a New Side Kick</a>
</body>
</html>
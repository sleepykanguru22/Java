<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<table class="table table-hover"> 
<thead><tr>
<th>Name</th>
<th>Price</th>
</tr></thead>
<tbody>
<tr> 
<c:forEach var="oneFruit" items="${fruitsFromMyController}">
<td><c:out value="${oneFruit}"></c:out></td>
</c:forEach>
</tr>
</tbody>
</table>
   
</body>
</html>
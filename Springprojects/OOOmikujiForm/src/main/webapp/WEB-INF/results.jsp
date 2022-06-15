<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
<link rel="stylesheet" href="css/style.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
 <div class="contaner-fluid"><h1>Here's your Omikuji Results!</h1>
<div class="result">
			<p>In <c:out value="${num}"/> years, you will live in <c:out value="${city}"/>
			with <c:out value="${realPerson}"/> as your room mate, <c:out value="${activity}"/> for a living.
			The next time you see a <c:out value="${organism}"/>,you will have good luck. Also,<c:out value="${comment}"/>.
			</p>
		</div>
</div>
 <a href="/omikuji/form">Home</a>
</body>
</html>
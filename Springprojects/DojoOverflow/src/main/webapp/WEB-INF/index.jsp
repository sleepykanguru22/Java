<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<body>

<h1>Questions Dashboard</h1>
<p><a href="/questions/new">New Question</a></p>
<hr>
<table>
	<thead>
		<tr>
			<th>Question</th>
			<th>Tags</th>
		</tr>
	</thead>
    <tbody>
		<c:forEach var="question" items="${questions}">
			<tr>
				<td><a href="/answers/${question.id}"><c:out value="${question.text}"></c:out></a></td>
				<td>
					<c:forEach var="tag" items="${question.tags}">
						<span><c:out value="${tag.subject}"></c:out><c:if test = "${question.tags.indexOf(tag)<question.tags.size()-1}">, </c:if></span>
					</c:forEach>
				</td>
			</tr>
		</c:forEach>
    </tbody>
</table>
</body>
</html>
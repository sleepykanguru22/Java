<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Languages</title>
</head>
<body style="margin: 10vw;">
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="language" items="${languages}">
			<tr>
				<td><a href="/languages/${language.id}"><c:out value="${language.name}"></c:out></a></td>
				<td><c:out value="${language.creator}"></c:out></td>
				<td><c:out value="${language.currentVersion}"></c:out></td>
				<td><a href="/languages/${language.id}/delete">delete</a>&nbsp<a href="/languages/${language.id}/edit">edit</a></td>
			</tr>	
		</c:forEach>
    </tbody>
</table>
<br>
<div>
<form:form action="/languages" method="post" modelAttribute="language">

	<div>
		<form:label path="name">Language Name: </form:label><br />
		<form:errors path="name" class="text-danger"/>
		<form:input path="name"/>
	</div>

	<div>
		<form:label path="creator">Creator: </form:label><br />
		<form:errors path="creator" class="text-danger"/>
		<form:input path="creator"/>
	</div>
	
	<div>
		<form:label path="currentVersion">Version: </form:label><br />
		<form:errors path="currentVersion" class="text-danger"/>
		<form:input type="double" path="currentVersion"/>
	</div>
	
	<div>
		<input class="button" type="submit" value="Submit"/>
	</div>
	
	

</form:form>
</div>
</body>
</html>
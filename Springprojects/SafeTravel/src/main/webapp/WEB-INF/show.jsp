<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
		<div class="container mt-4 mx-auto">
			<h2>Expense Details:</h2>
			<div class="my-3">
				<a href="/expenses" class="text-decoration-none">Go Home</a>
			</div>
			<div class="col-10 mx-auto">
				<p><span class="h4">Expense Name:</span> <c:out value="${expense.expenseName}" /></p>
				<table class="table">
					<tbody>
						<tr>
							<th>Vendor:</th>
							<td><c:out value="${expense.vendor}" /></td>
						</tr>
						<tr>
							<th>Charge:</th>
							<td>$<c:out value="${expense.amount}" />.00</td>
						</tr>
						<tr>
							<th>Description:</th>
							<td><c:out value="${expense.description}" /></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
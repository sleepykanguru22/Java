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
<div class="container-fluid mt-5"> 

<h1 class="text-center">Safe Travels</h1>
<div class="container mb-3">
<table class="table table-hover">
<thead>
<tr>
<th class="text-center">Expenses</th>
<th class="text-center">Vendor</th>
<th class="text-center">Amount</th>
<th class="text-center">Edit</th>
<th class="text-center">Delete</th>
</tr>
</thead>
<tbody>
<c:forEach var="expense" items="${expenses}">
			<tr>
				<td class="text-center" ><a href="/expense/${expense.id }"><c:out value="${expense.expenseName}"></c:out></a></td>
				<td class="text-center"><c:out value="${expense.vendor}"></c:out></td>
				<td class="text-center">$<c:out value="${expense.amount}"></c:out></td>
				 <td class="text-center"><a href="/edit/${expense.id}">edit</a></td>
				<td> <form action="/expenses/${expense.id}" method="post">
    				<input type="hidden" name="_method" value="delete">
    				<input class="btn btn-danger" type="submit" value="Delete">
				</form></td>
			</tr>	
		</c:forEach>
</tbody>
</table>
</div>
<div class="container">
 <form:form action="/expenses" method="post" modelAttribute="expense" class="form-control ">
 	<div class="row">
 	<div class="col"><h2 class="mb-3">Add Expense</h2></div></div>
	<div class="row">
	<div class="col-4">
		<form:label path="expenseName">Expense Name: </form:label><br />
		<form:errors path="expenseName" class="text-danger"/>
		<form:input style="width:250px;" path="expenseName"/>
	</div>

	<div class="col-4">
		<form:label path="vendor">Vendor: </form:label><br />
		<form:errors path="vendor" class="text-danger"/>
		<form:input style="width:250px;" path="vendor"/>
	</div>
	
	<div class="col-4">
		<form:label path="amount">Amount: </form:label><br />
		<form:errors path="amount" class="text-danger"/>
		<form:input style="width:250px;" type="double" path="amount"/>
	</div>
	
	<div class="col-12">
		<form:label path="description">Description: </form:label><br />
		<form:errors path="description" class="text-danger"/>
		<form:textarea style="width:100%;" rows="5" path="description"/>
	</div>
	</div>
	
	<div class="row">
		<input class="btn btn-dark" type="submit" value="Submit"/>
	</div>
</form:form> 
</div>
</div>
</body>
</html>
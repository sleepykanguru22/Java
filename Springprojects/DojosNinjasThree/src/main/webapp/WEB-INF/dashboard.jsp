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
 <div class="container">
 <h1 class="text-center my-5">Dojo Dashboard</h1><span> <a href="/dojo/add">New Dojo</a></span>
   <table class="table">
      <thead>
        <tr>
          <th>Location</th>
           <th>Actions</th>
        </tr>
      </thead>
      <tbody>
       <c:forEach var="dojo" items="${dojos}">
			<tr>
				<td class="text-center" ><a href="/dojo/${dojo.id }"><c:out value="${dojo.locationName}"></c:out></a></td>
				
		</c:forEach>
</tbody>
      </tbody>
    </table>
 </div>
</body>
</html>
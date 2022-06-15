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
<h1>Testing</h1>
 <form action="omikuji/show" method="post">
        <label>Pick any number from 5 to 25:</label>
        <input type="number" id="quantity" name="number" min="5" max="25">
        <label>Enter the name of any city:</label>
        <input type="text" name="city">
        <label>Enter your professional endeavor or hobby:</label>
        <input type="text" name="activity">
         <label>Enter any type of living thing:</label>
        <input type="text" name="organism">
         <label>Say something nice to someone:</label>
         <textarea id="comment" name="comment" rows="4" cols="50"></textarea>
        <p>Send and show a friend</p>
        <input type="submit" value="Send">
    </form>
</body>
</html>
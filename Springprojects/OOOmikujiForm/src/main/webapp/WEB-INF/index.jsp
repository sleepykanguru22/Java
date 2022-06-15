<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid"><h1>Send an Omikuji</h1>
    <form action="/omikuji/show" method="post" class="form-control">
      <div class="form-group">
        <label for="num">Pick any number from 5 to 25!</label>
        <input type="number" name="num" id="num" min="5" max="25" />
      </div>
      <div class="form-group">
        <label for="city">Enter the name of any city:</label>
        <input type="text" name="city" id="city" />
      </div>
       <div class="form-group">
        <label for="realPerson">Enter the name of any real person:</label>
        <input type="text" name="realPerson" id="realPerson" />
      </div>
      <div class="form-group">
        <label for="activity">Enter a professional endeavor or hobby:</label>
        <input type="text" name="activity" id="activity" />
      </div>
      <div class="form-group">
        <label for="organism">Enter any type of living thing:</label>
        <input type="text" name="organism" id="organism" />
      </div>
      <div class="form-group">
        <label for="comment">Say something nice to someone:</label>
        <textarea
          class="form-control"
          name="comment"
          id="comment"
          cols="30"
          rows="10"
        ></textarea>
      </div>
      <p>Send and show a friend</p>
      <button class="btn btn-outline-primary">Send</button>
    </form>
     <a href="/omikuji/show">Click me!</a>
    </div>
 
</body>
</html>
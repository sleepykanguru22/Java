<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container d-flex gap-3 mt-5">
<h1>Your Gold</h1>
<div class="total border border-primary border-5">0</div>
</div>
<div class="container"><div class="row mt-5 text-center ">
      <div class="col">
        <div class="form form-control border-primary border-3">
          <h4>Farm</h4>
          <p>earns 10-20 gold</p>
          <form action="/gold" method="post">
          <input type="submit" value="Find Gold!" />
          </form>
        </div>
      </div>
      <div class="col">
        <div class="form form-control border-primary border-3">
          <h4>Cave</h4>
          <p>earns 5-10 gold</p>
          <form action="/gold" method="post">
          <input type="submit" value="Find Gold!" />
          </form>
        </div>
      </div>
      <div class="col">
        <div class="form form-control border-primary border-3">
          <h4>House</h4>
          <p>earns 2-5 gold</p>
          <form action="/gold" method="post">
          <input type="submit" value="Find Gold!" />
          </form>
        </div>
      </div>
      <div class="col">
        <div class="form form-control border-primary border-3">
          <h4>Quest</h4>
          <p>earns/takes 0-50 gold</p>
          <form action="/gold" method="post">
          <input type="submit" value="Find Gold!" />
          </form>
        </div>
      </div>
    </div>
 </div>
<div class="container">
<h1>Activities</h1>
<div class="activities border border-primary border-5"></div>
</div>
</div>
</body>
</html>
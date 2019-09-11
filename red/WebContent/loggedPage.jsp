<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="./css/prova.css">
<meta charset="ISO-8859-1">
<title>Logged</title>
</head>
<body>
<div class="navbar navbar-expand-sm">
  <span class="pull-left"><img src="/red/image/logo.jpg" width="45" height="45" alt=""></span>
  <div class="dropdown">
    <button class="dropbtn">Menu 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Credit</a>
      <a href="#">Settings</a>
      <a href="#">Help</a>
    </div>
  </div>
<p>
Welcome <c:out value="${sessionScope.logged.toString()}"></c:out>
</p>
<c:if test="${(sessionScope.logged != null) and sessionScope.logged.getClass() == 'User'}">
  <div class="dropdown">
    <button class="dropbtn">Tables 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Users</a>
      <a href="#">SuperUser</a>
    </div>
  </div>
</c:if>
  	  <div class="icon">
      <a href="#"><i class="fa fa-fw fa-user"></i> Logout</a>
    </div>     
</div>

<h3>Dropdown Menu inside a Navigation Bar</h3>
<p>Hover over the "Dropdown" link to see the dropdown menu.</p>

</body>

<nav class="navbar navbar-default navbar-fixed-bottom">
      <div class="navbar-bottom-right">
      <a href="#"><i class="fa fa-fw fa-user-plus"></i> Admin</a>
      </div>
      <div class="navbar-bottom-left">
      <i class="fa fa-fw fa-copyright"></i> Copyright Red Group
    </div>
</nav>
</html>
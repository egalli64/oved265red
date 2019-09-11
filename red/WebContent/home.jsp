<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link href="css/bootstrap-dropdownhover.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/home.css">
</head>
<body>

<div class="navbar navbar-expand-sm">
  <span class="pull-left"><img src="/red/image/logo.jpg" width="45" height="45" alt=""></span>
  <div class="dropdown">
    <button class="dropbtn">Cities 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Milano</a>
      <a href="#">Roma</a>
    </div>
  </div>
  <div class="dropdown">
    <button class="dropbtn">Cars 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">eCar</a>
      <a href="#">Suv</a>
      <a href="#">cityCar</a>
    </div>
  </div>
  	  <div class="icon">
      <a href="#"><i class="fa fa-fw fa-user"></i> Login</a>
      <a href="#"><i class="fa fa-fw fa-sign-in"></i> Sign Up</a>
    </div>     
</div>



<div class="navbar-fixed-bottom">
      <a href="#"><i class="fa fa-fw fa-user-plus"></i> Admin</a>
      <span><i class="fa fa-fw fa-copyright"></i> Copyright Red Group</span>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link href="css/bootstrap-dropdownhover.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/home.css">
<title>Login Page</title>
</head>
<body>

	<h2 id="error"><c:if test="${users !=null }">User not registered</c:if></h2>
<form action="/red/Login" method="post">
	<span> <label for="nm" class="labels">Name: </label> <input type="text"
		name="email" id="nm" placeholder="username" required />
	</span>
	<span>
	<label for="ps" class="labels">Password: </label> <input type="password" name="password" id="ps"
				placeholder="password" required />
	</span>
	<span>
	<input type="submit" value="log in" class="logbtn" />
	</span>
</form>
<div id = "bottomleft">
<a href="signUp.jsp" class="labels">Sign Up!</a>
<br>
<a href="adminLog.jsp" class="labels">I'm an administrator!</a>
</div>

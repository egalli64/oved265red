<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/loginStyle.css">
<title>Administrator Login</title>
</head>
<body>
	<h2>Welcome Super-User!</h2>

<form action="red/resources/Login" method="post">
	<span> <label for="nm">Name: </label> <input type="text"
		name="name" id="nm" placeholder="username" required />
	</span>
	<span> <label for="nm">Password: </label> <input type="text"
		name="name" id="nm" placeholder="Password" required />
	</span>
	<span> 
		<input type="submit" value="log in" class="logbtn" />
	</span>
	<div>
		<a href="index.jsp">Back to login page</a>
	</div>
</form>
<br>
</body>
</html>
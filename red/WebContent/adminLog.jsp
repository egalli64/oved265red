<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/loginStyle.css">
<title>Administrator Login</title>
</head>
<body>
	<h2 class="labels">Welcome Super-User!</h2>
	
	<h2 id="serror"><c:if test="${users != null }">Admin not recognized</c:if> </h2>

	<form action="/red/Login" method="post">
		<span> <label for="nm" class="labels">Name: </label> <input
			type="text" name="name" id="nm" placeholder="username" required />
		</span> <span> <label for="ps" class="labels">Password: </label> <input
			type="password" name="spassword" id="ps" placeholder="password"
			required />
		</span> <span> <input type="submit" value="log in" class="logbtn" />
		</span>
	</form>
	<br>
</body>
</html>
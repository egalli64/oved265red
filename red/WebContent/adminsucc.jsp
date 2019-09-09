<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Login success</title>
</head>
<body>
	<h1>
		Welcome
		<c:if test="${users != null}">Admin</c:if>
	</h1>

	<table>
		<tr>
			<th>name</th>
			<th>email</th>
		</tr>
		<c:forEach var="cur" items="${users}">
			<tr>
				<td>${cur.superName }</td>
				<td>${cur.superUsername }</td>
			</tr>
		</c:forEach>
	</table>

	<form action="" method="post">

		<h1>Create new admin</h1>

		<label for="name" class="white"><b>Name</b></label> <input type="text"
			placeholder="Enter Name" name="name" required> <label
			for="surname" class="white"><b>Surname</b></label> <input type="text"
			placeholder="Enter Surname" name="surname" required> <label
			for="email" class="white"><b>Email</b></label> <input type="text"
			placeholder="Enter Email" name="email" required> <label
			for="birthdate" class="white"><b>Birth date</b></label> <input
			type="date" placeholder="Enter birthdate" name="birth"
			value="1960-01-01" min="1900-01-01" max="2099-12-31"> <label
			for="psw" class="white"><b>Password</b></label> <input
			type="password" placeholder="Enter Password" name="psw" required>

		<div class="clearfix">
			<button type="reset" class="cancelbtn">Cancel</button>
			<button type="submit" class="signupbtn">Sign Up</button>
		</div>


	</form>

</body>
</html>
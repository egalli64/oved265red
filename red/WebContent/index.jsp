<html>
<head>
<link rel="stylesheet" href="./css/loginStyle.css">
<title>Login Page</title>
</head>
<body>

	<h2>Welcome to our car sharing site!</h2>
<form action="red/resources/Login" method="post">
	<span> <label for="nm">Name: </label> <input type="text"
		name="email" id="nm" placeholder="username" required />
	</span>
	<span>
	<label for="nm">Password: </label> <input type="text" name="password" id="nm"
				placeholder="password" required />
	</span>
	<span>
	<input type="submit" value="log in" class="logbtn" />
	</span>
</form>
<div>
<a href="signUp.jsp">Sign Up!</a>
<br>
<a href="adminLog.jsp">I'm an administrator!</a>
</div>


	<label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>



</body>
</html>


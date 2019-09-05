<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/signupStyle.css">
<title>Sign Up!</title>
</head>
<body>
	 <form action="" style="border:1px solid #ccc">
  <div class="container">
    <h1>Join us!</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
    
    <label for="surname"><b>Surname</b></label>
    <input type="text" placeholder="Enter Surname" name="surname" required>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    
     <label for="birthdate"><b>Birth date</b></label>
    <input type="text" placeholder="Enter Email" name="birth date" required>
    
    <label for="licenseid"><b>Driving License ID</b></label>
    <input type="text" placeholder="Enter Driving License ID" name="driveID" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>

    <a href="index.jsp">Back to login page</a>
   

    <div class="clearfix">
      <button type="reset" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form> 	
</body>
</html>
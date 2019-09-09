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
	 <form action="/red/Registration" style="border:1px solid #ccc" method="post">
  <div class="container w3-black">
    <h1 class="white">Join us!</h1>
    <p class="white">Please fill in this form to create an account.</p>
    <hr>

    <label for="name" class="white"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
    
    <label for="surname" class ="white"><b>Surname</b></label>
    <input type="text" placeholder="Enter Surname" name="surname" required>
    
    <label for="email" class="white"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    
     <label for="birthdate" class="white"><b>Birth date</b></label>
    <input type="date" placeholder="Enter birthdate" name="franco"  value="2018-07-22"
       min="1900-01-01" max="2099-12-31"> required>
    
    <label for="licenseid" class="white"><b>Driving License ID</b></label>
    <input type="text" placeholder="Enter Driving License ID" name="driveID" required>

    <label for="psw" class="white"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="creditcard" class="white"><b>U</b>Credit Card</label>
    <input type="number" placeholder="Credit Card" name="creditcard" required>

    <a href="index.jsp" class="white">Back to login page</a>
   

    <div class="clearfix">
      <button type="reset" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form> 	
</body>
</html>
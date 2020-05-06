


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
<style>
body{
background-image: url("./images/login.jpg");
background-size: cover;
padding: 40px 450px 40px 450px;

}
div{
border: solid orange 5px  ;
background-color:white ;
}
.button1 {font-size: 30px;
width:120px;
text-align: center;
background-color: orange;

}


</style>
</head>
<body> <br><br><br><br><br><br><br>
<div>
<center>
   
<form action="./loginmvclog" method="post">
<h1>Login Page</h1>
<br>User Name:<input  type="text" name="username" placeholder="Enter UserName" pattern="[A-Za-z]" maxlength="40"><br>
<br>Password:&nbsp<input type="password" name="password" placeholder="Enter Password" maxlength="12"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"><br>
<br>Role<input type="radio" name="role" value="Admin">Admin<br>
&nbsp&nbsp <input type="radio" name="role" value="Manager">Manager<br>
&nbsp&nbsp <input type="radio" name="role" value="Customer">Customer<br>
<br><input type="submit" value="Login" class="button1">
<br><br>
</form>
</center>
</div>
</body>
</html>
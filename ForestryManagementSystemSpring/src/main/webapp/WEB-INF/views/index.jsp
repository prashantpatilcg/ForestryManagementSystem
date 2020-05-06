<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Morgan Accounts</title>  
  <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script> 
 <style >
 body{
  background-image:url("./fs3.jpg");  
  background-size:cover;
  background-attachment:fixed; 
 
 }
 p{
 text-align: center;
 }
 
 nav{
 position:fixed;
 }
 
 </style>
 
 
 
</head>
<body>
<script type="text/javascript">
alert("Profile created:  Login with your credentials");
</script>
<style>

body {
  background-image: url('https://cdn.pixabay.com/photo/2017/08/16/16/10/stopwatch-2648253_960_720.jpg');
  background-repeat: no-repeat;
}
</style>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-fixed-top" role="navigation">
    <div class="container">
        <a class="navbar-brand" href="#">Morgan Accounts</a>
        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
            &#9776;
        </button>
        <div class="collapse navbar-collapse" id="exCollapsingNavbar">
            <ul class="nav navbar-nav">
                <li class="nav-item"><a href="#" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="#" class="nav-link">About</a></li>
            </ul>
           
            <ul class="nav navbar-nav flex-row justify-content-between ml-auto">
                <li class="nav-item order-2 order-md-1"><a href="#" class="nav-link" title="settings"><i class="fa fa-cog fa-fw fa-lg"></i></a></li>
                <li class="dropdown order-1">
                    <button type="button" id="dropdownMenu1" data-toggle="dropdown" class="btn btn-outline-secondary dropdown-toggle">Login <span class="caret"></span></button>
                    <ul class="dropdown-menu dropdown-menu-right mt-2" >
                       <li class="px-3 py-2">
                           <form  action="./loginmvclog"  method="post"  class="form" role="form">
                                <div class="form-group">
                                <h3>&nbsp;&nbsp;&nbsp;&nbsp;Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3>
                                    <input type="text" name="username" placeholder="UserName" required maxlength="40" pattern="[A-Za-z]*" title="invalid User name" class="form-control form-control-sm"  >
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" placeholder="Passsword" maxlength="12"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="invalid Password" required class="form-control form-control-sm" >
                                </div>
                                <div class="form-group" >
                                   Role:<br>
                                                                      
                                   <input type="radio" name="role" value="Admin"  >Admin
                                   <input type="radio" name="role" value="Manager"  >Manager
                                   <input type="radio" name="role" value="Customer"  >User
                                </div>
                                
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-block">Login</button>
                                </div>
                                <a href="./createusermvc1" ><p>New User? Create Account</p></a>
                                <a href="./phone" ><p>Forgot Password</p></a>
                                
                                
                            </form>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div id="modalPassword" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3>Forgot password</h3>
                <button type="button" class="close font-weight-light" data-dismiss="modal" aria-hidden="true">Ã</button>
            </div>
            <div class="modal-body">
                <input id="emailInput" placeholder="Email" class="form-control form-control-sm" type="text" >
            </div>
            
            
            
            <div class="modal-footer">
                <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
                <button class="btn btn-primary">Save changes</button>
            </div>
        </div>
   </div>
</div>

</body>
</html>
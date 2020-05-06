<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Forestry Management</title>  
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
 
 nav{
 position:fixed;
 }
 
 </style>
 
 
 
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-fixed-top" role="navigation">
    <div class="container">
        <a class="navbar-brand" href="#">Forestry Management System</a>
        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
            &#9776;
        </button>
        <div class="collapse navbar-collapse" id="exCollapsingNavbar">
            <ul class="nav navbar-nav">
                <li class="nav-item"><a href="#" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="#" class="nav-link">About</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Feedback</a></li>
                <li class="nav-item"><a href="front" class="nav-link">Logout</a></li>
            </ul>
           
            <ul class="nav navbar-nav flex-row justify-content-between ml-auto">
                <li class="nav-item order-2 order-md-1"><a href="#" class="nav-link" title="settings"><i class="fa fa-cog fa-fw fa-lg"></i></a></li>
                <li class="dropdown order-1">
                    <button type="button" id="dropdownMenu1" data-toggle="dropdown" class="btn btn-outline-secondary dropdown-toggle">Login <span class="caret"></span></button>
                    <ul class="dropdown-menu dropdown-menu-right mt-2">
                       <li class="px-3 py-2">
                           <form  action="./loginmvclog"  method="post"  class="form" role="form">
                                <div class="form-group">
                                <h3>&nbsp;&nbsp;&nbsp;&nbsp;Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3>
                                    <input type="text" name="username" placeholder="UserName" class="form-control form-control-sm" >
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" placeholder="Passsword" class="form-control form-control-sm" >
                                </div>
                                <div class="form-group">
                                   Role<input type="radio" name="role" value="Admin" class="form-control form-control-sm" >Admin <br>
                                   <input type="radio" name="role" value="Manager" class="form-control form-control-sm" >Manager <br>
                                   <input type="radio" name="role" value="Customer" class="form-control form-control-sm" >Customer
                                </div>
                                
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-block">Login</button>
                                </div>
                                <div class="form-group text-center">
                                 <small><a href="Register.jsp">Register?</a></small><br>
                                    <small><a href="#" data-toggle="modal" data-target="#modalPassword">
                                     Forgot password</a></small>
                                </div>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User profile</title>  
  <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script> 

<style>
body{
  background-image:url("edit.jpeg");  
  background-size:cover;
  background-attachment:fixed; 
  }

 nav{

 top:0px;
position:sticky;
 }
 
 .container-link{
 
 background-color:#CF000;
 float:center; 
 border:0px solid #fff; padding:40px; width:500px;
-webkit-box-shadow: -1px 3px 47px 3px rgba(20,20,17,1);
-moz-box-shadow: -1px 3px 47px 3px rgba(20,20,17,1);
box-shadow: -1px 3px 47px 3px rgba(20,20,17,1);
margin:100px 300px 0px 100px;
/* padding:px 20px 0px 0px; */
  
  }
 
 .alert a{
 font-size:25px;
 font-color:pink;
 /* text-decoration:none;
 color:#0000ff;
border-bottom:1px solid #ff0000;  */
 }
 
 
</style>


</head>
<body>
<script type="text/javascript">
alert("Login successful!");
</script>

<style>

body {
  background-image: url('https://cdn.pixabay.com/photo/2018/04/10/09/00/businessman-3306755_960_720.jpg');
  background-repeat: no-repeat;
}
</style>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top" role="navigation">
    <div class="container">
        <a class="navbar-brand" href="#">Morgan Accounts</a>
        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
            &#9776;
        </button>
        <div class="collapse navbar-collapse" id="exCollapsingNavbar">
            <ul class="nav navbar-nav">
                <li class="nav-item"><a href="CustomerHome" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="#" class="nav-link">About</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Feedback</a></li>
                <li class="nav-item"><a href="logoutmvc" class="nav-link">Logout</a></li>
            </ul>
            
            
      <ul class="nav navbar-nav flex-row justify-content-between ml-auto">
                <li class="nav-item order-2 order-md-1"><a href="#" class="nav-link" title="settings"><i class="fa fa-cog fa-fw fa-lg"></i></a></li>
                <li class="dropdown order-1">
                 
                    <ul class="dropdown-menu dropdown-menu-right mt-2">
                       <li class="px-3 py-2">
                           
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
     
<div class="link" id="link">
<form class="container-link">
<div class="alert alert-info" role="alert">
<ul>
    <li><a href="./listOfProductmvc" class="alert-link" >Products</a></li>
  <li><a href="PdispachReports.jsp" class="alert-link">View Orders</a></li>
  </ul>
</div>




  
  <!-- <div class="alert alert-primary" role="alert">
           <a href="#" class="nav-link">Edit Profile</a>
              <a href="#" class="nav-link">Order</a>
                <a href="#" class="nav-link">View Reports</a>
                <a href="#" class="nav-link">Products</a>
                <br>
            </div> -->
            </form>
</div>
</body>
</html>
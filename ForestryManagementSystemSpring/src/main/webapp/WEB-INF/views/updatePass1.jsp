<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>update password</title>  
  <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script> 
<script >
function validate()                                    
{ 
    var username = document.forms["addcustomer"]["username"];               
    var address = document.forms["addcustomer"]["address"];    
    var emailid = document.forms["addcustomer"]["emailid"];  
    var password =  document.forms["addcustomer"]["password"];  
    var cpassword =  document.forms["addcustomer"]["cpassword"];  
    var contactno = document.forms["addcustomer"]["contactno"];  
    var role = document.forms["addcustomer"]["role"];  
    
    if(cpassword.value!=password.value)                        
    { 
        window.alert("confirmation password is not matched, please retype the confirmation password"); 
        cpassword.focus(); 
        return false; 
    }
    
   
    return true; 
}
</script>

<style >
<style type="text/css">
  *{color: #fff}
  body{
  background-image:url("https://cdn5.vectorstock.com/i/1000x1000/97/84/padlock-with-security-lock-concept-and-futuristic-vector-15189784.jpg");  
  background-size:cover;
  background-attachment:fixed; 
  }
  .form-container{ background-color:#CF000;
  border:0px solid #fff; padding:40px; width:500px;
-webkit-box-shadow: -1px 3px 47px 3px rgba(20,20,17,1);
-moz-box-shadow: -1px 3px 47px 3px rgba(20,20,17,1);
box-shadow: -1px 3px 47px 3px rgba(20,20,17,1);
margin:-20px 500px -20px 0px;
}

 
 nav{

 top:0px;
position:sticky;

 }
  

h1,h3{
color:#0080ff;
text-shadow: 2px 2px 4px #000000; 
 text-shadow: #FC0 1px 0 10px; 
}

label{
color:#fff;
text-shadow: 2px 2px 4px #CF0000;
font-size=20px 
}

.form-check-input{
color:#fff;
text-shadow: 2px 2px 4px #CF0000; 
}

.container{
margin:30px 100px 1px 10px;

font{
color:#0080ff;
text-shadow: 2px 2px 4px #000000; }

}
/* #name{width:80%;
hieght:50%;
} */
input[type-text]{
width:100%;
transition:3s;
}


input[type-text]:focus{
border-color:dodgerBlue;
box-shadow:0 0 8px 0 dodgreBlue;
}

font{
color:#0080ff;
text-shadow: 2px 2px 4px #000000; 
 text-shadow: #FC0 1px 0 10px; 
}

.sticky{
positon:fixed;
}





</style>

</head>
<body>
<script type="text/javascript">
alert("Autherized user...");
</script>
<script >

window.onscroll = function() {myFunction()};

var header = document.getElementById("sticky");

var sticky = header.offsetTop;

function myFunction() {
if (window.pageYOffset > sticky) {
 header.classList.add("sticky");
} else {
 header.classList.remove("sticky");
}
}
</script>
 

<nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top" role="navigation">
    <div class="container">
        <a class="navbar-brand" href="#">Morgan Accounts</a>
        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
            &#9776;
        </button>
        <div class="collapse navbar-collapse" id="exCollapsingNavbar">
            <ul class="nav navbar-nav">
                <li class="nav-item"><a href="PmanagerHome" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="#" class="nav-link">About</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Feedback</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Logout</a></li>
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
     




<div class="container">  
  <form class="form-container" name=addcustomer method=post action="./updatePass" onsubmit="return validate()" >  
  <h3>Update&nbsp;Password</h3>  
  
    <div class="form-group">  
      <label for="address">New Password</label>  
      <input type="password" class="form-control" name=password placeholder="New Password" maxlength="12"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required>  
    </div>
    
    <div class="form-group">  
      <label for="address">Confirm Password</label>  
      <input type="password" class="form-control" name=cpassword placeholder="Confirm Password" maxlength="12"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required>  
    </div>
    
     
    <button type="submit" class="btn btn-primary">Update</button>  
  </form>  
</div>  

</body>
</html>




<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>user form</title>
 <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

<script> 
function validate()                                    
{ 
    var password =  document.forms["adduser"]["password"];  
    var cpassword =  document.forms["adduser"]["cpassword"];  
    if(cpassword.value!=password.value)                        
    { 
        window.alert("confirmation password is not matched, please retype the confirmation password"); 
        cpassword.focus(); 
        return false; 
    }
   

   
    return true; 
}</script> 

<style >
<style type="text/css">
  *{color: #fff}
 
  .form-container{ background-color:#CF000;
  border:0px solid #fff; padding:40px; width:800px;
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
body {
 background-image:url("https://cdn.pixabay.com/photo/2017/08/16/16/10/stopwatch-2648253_960_720.jpg");  
  background-size:cover;
}
</style>
</head>

<body>

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
                <li class="nav-item"><a href="front" class="nav-link">Logout</a></li>
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
 
    <form:form method="POST" commandName="form1" action="./createuser" onsubmit="return validate()"  name="adduser" class="form-container">
        <h3>Information</h3>
        <table>
                      
            <tr>      
                <td><label for="name">User name *</label></td>
                <td><input type="text" name=username class="form-control"  placeholder="User name" required  maxlength="40" pattern="[A-Za-z]*" title="should contain 1 Uppercase and 1 Lowercase"></td>
                <td><form:errors path="username" cssStyle="color: #ff0000;"/></td>
            </tr>
            <tr>
                <td> <label for="address">Address *</label>  </td>
                <td><input type="text" class="form-control" name=address placeholder="Address" required maxlength="50">  </td>
                <td><form:errors path="address" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td><label for="address">E-mail *</label></td>
                <td><input type="email" class="form-control" name=emailid placeholder="E-mail" required maxlength="50"></td>
                <td><form:errors path="emailid" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td><label for="address">Password *</label></td>
                <td><input type="password" class="form-control" name=password placeholder="Password" required maxlength="12"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"></td>
                <td><form:errors path="password" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td><label for="address">Confirm Password *</label></td>
                <td><input type="password" class="form-control" name=cpassword placeholder="Confirm password" required maxlength="12"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"></td>
<%--                 <td><form:errors path="cpassword" cssStyle="color: #ff0000;" /></td>
 --%>            </tr> 
            <tr>
                <td><label for="address">Phone No *</label></td>
                <td><input type="number"  class="form-control" name=contactno  placeholder="Contact No" required maxlength="12" pattern="[6-9]{1}[0-9{9}]" title="invalid mobile number"></td>
                <td><form:errors path="contactno" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td><label for="address">Role: *</label></td>
                <td><input type="radio" name="role" value="Customer"  ><label for="address"> New User </label></td>
                <td><form:errors path="role" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td><center><input type="submit" name="submit" value="Submit"  class="btn btn-primary"  ></center></td>
            </tr>
            <tr>
        </table>
    </form:form>
 </div>  
</body>
</html>
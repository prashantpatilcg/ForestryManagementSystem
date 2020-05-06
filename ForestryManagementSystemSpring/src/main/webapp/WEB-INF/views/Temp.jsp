<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Forestry management>
</head>
<body>
<form action="./loginmvclog" method="post">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">User name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="username" placeholder="User name">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="password" placeholder="Password">
    </div>
  </div>
  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">Role</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="role"  value="Admin" >
          <label class="form-check-label" for="gridRadios1">
            Admin
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="role"  value="Manager">
          <label class="form-check-label" for="gridRadios2">
            Manager
          </label>
        </div>
        <div class="form-check disabled">
          <input class="form-check-input" type="radio" name="role"  value="Customer" >
          <label class="form-check-label" for="gridRadios3">
            Customer
          </label>
        </div>
      </div>
    </div>
  </fieldset>
 
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Login</button>
    </div>
  </div>
</form>
</body>
</html>
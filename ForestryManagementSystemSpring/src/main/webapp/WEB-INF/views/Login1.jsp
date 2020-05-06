<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form submission</title>
</head>
 
<body>
    <h2>Fill your form!</h2>
 
    <form:form name=addcustomer method=post action="./createuser"  commandName="Login1"  >
        <table>
            <tr>
                <td>Enter your name:</td>
                <td><form:input path="username" /></td>
                <td><form:errors path="username" cssStyle="color: #ff0000;"/></td>
            </tr>
            <tr>
                <td>Enter your address:</td>
                <td><form:input path="address" /></td>
                <td><form:errors path="address" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td>Enter your email id:</td>
                <td><form:input path="emailid" /></td>
                <td><form:errors path="emailid" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td>Enter your password:</td>
                <td><form:input path="password" /></td>
                <td><form:errors path="password" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td>Enter your cpassword:</td>
                <td><form:input path="cpassword" /></td>
                <td><form:errors path="cpassword" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
                <td>Enter your contact no:</td>
                <td><form:input path="contactno" /></td>
                <td><form:errors path="contactno" cssStyle="color: #ff0000;" /></td>
            </tr>
            <tr>
            	<td>Role: *<br></td>
          		<td> <input type="radio" name="role" value="Customer"  > New User</label></td>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="Submit"></td>
            </tr>
            <tr>
        </table>
    </form:form>
    
 
</body>
</html>
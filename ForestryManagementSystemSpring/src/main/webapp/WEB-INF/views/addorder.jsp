<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<BODY>
<P align=center><FONT color=deepskyblue size=4><STRONG>ADD&nbsp;ORDER DETAILS</STRONG></FONT></P>
<form name=addorders method=post action="./addorder">
<TABLE align=center border=0 cellPadding=1 cellSpacing=1 style="WIDTH: 233px; HEIGHT: 148px" 
width="75%">


 
  
    <TR>
    <TD>Customer&nbsp;Id
    </TD>
    <TD><INPUT type="number" name=customerid></TD></TR>
    
  <TR>
    <TD>Product&nbsp;Id
    </TD>
    <TD><INPUT type="number" name=productid></TD></TR>
    
    <TR>
    <TD>Quantity
    </TD>
    <TD><INPUT type="number" name=quantity></TD></TR>
  
  
  <TR>
  <td><INPUT id=submit1 name=submit1 style="LEFT: 151px; TOP: 318px" type=submit value=Submit></TD></TR></TABLE>
<P></P></form>
</BODY>
</html>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>

<br><br>
<center>
<h2>Login Page</h2>

<form action=Login method=post >
    <table >
    <tr>
    <td><label for=email>Email</label><br></td>
    <td><input type="email" name=email id=email /></td>
    </tr>
    <tr>
    <td><label for=pass>Password</label><br></td>
    <td><input type="password" name=password id=pass /></td>
    </tr>
    
    <tr>
    <td><input type=submit value=submit /></td>
    <td><input type=reset /></td>
    </tr>
    </table>
	
</form>


<br><br>

<h4><a href=UserDetails.jsp >Create new Account</a></h4>
</center>
<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>

<%
		session.setAttribute("message", null);
	}
%>

</body>
</html>
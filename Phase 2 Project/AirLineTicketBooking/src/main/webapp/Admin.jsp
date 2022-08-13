<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<br><br>
<center>
<h2>Admin Login</h2>

<form action=LoginAdmin method=post>
	Email : <input type="email" name=email id=email /><br><br>
	Password : <input type="password" name=password id=pass /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>

<br><br>
<a href=PasswordReset.jsp>Forgot Password</a>
</center>
<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="Admin.jsp">Admin Login</a>





<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user!=null){
%>
<center>
<p><h3>Welcome <%=user.get("name") %><h3></p></center>

<%
	}else{
%>

<%
	}
%>
<br><br>
<center>

<form action=FlightDetails method=post>
	Source : <input type=text name=from id=from/><br><br>
	Destination : <input type=text name=to id=to/><br><br>
	Date of travel :<input type=date name=departure id=departure/><br><br>
	No.of persons : <input type=number name=travellers id=travellers/><br><br>
	<input type=submit value=Search /> <input type=reset />
</form><br><br>
<a href="Logout">Logout</a>
</center>
</body>
</html>
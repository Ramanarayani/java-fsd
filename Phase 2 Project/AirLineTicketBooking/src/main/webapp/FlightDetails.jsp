<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>

<br>
<%
	@SuppressWarnings("unchecked")
	List<String[]> flights=(List<String[]>)session.getAttribute("flights");
	if(flights!=null){
%>
<center>
<h2>Available Flights</h2>


<table border="1">
<tr>
	<th>Name</th>
	<th>Time</th>
	<th>Price</th>
</tr>



<%
	for(String[] flight:flights){
%>

<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
<td><a href=Payment.jsp>Book Now</a></td>
</tr>
</table>
</center>

<%
	}
%>


<%
	}
	else{
%>
<h2>There are no available flights</h2>
<%
	}
%>
</body>
</html>
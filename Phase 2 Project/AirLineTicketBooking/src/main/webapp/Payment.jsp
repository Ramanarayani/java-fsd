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
<h2>Payment Details</h2>

<table border="0">
<%
	for(String[] flight:flights){
%>
<tr>
<th>Price :</th>
<td><%=flight[2]%></td>
</tr>
<br>
</table>
</center>

<%
	}
%>


<br>
<br>
<%
	}
	else{
%>
<h1></h1>
<%
	}
%>



<center>
<form action=FlightBooking.jsp method=post>
	Enter Debit Card Number : <input type=text name=cardno id=cardno/><br><br>
	 Enter expiry Date:<input type="password" name=text id=cvv /><br><br>
	<input type=submit value=Pay />
</form>
<br><br>
<a href="Logout">Logout</a>
</center>
</body>
</html>
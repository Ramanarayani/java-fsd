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
<h2>Add New Flight Details</h2>


<form action=AddFlight method=post>
	Name :<input type="text" name=name id=name /><br><br>
	From :<input type="text" name=from id=from /><br><br>
	To :<input type="text" name=to id=to /><br><br>
	Departure :<input type="date" name=departure id=departure /><br><br>
	Time :<input type="time" name=time id=time /><br><br>
	Price :<input type="text" name=price id=price /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>

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
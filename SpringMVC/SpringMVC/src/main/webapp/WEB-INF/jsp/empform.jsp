<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<center>
		<h2>Search Employee</h2>
      

<form action=search.jsp method=post>
	Enter employee id to be searched :<input type=id name=id id=id/><br><br>

	<input type=submit value=Search /> <input type=reset />
</form>
</div>
</center>
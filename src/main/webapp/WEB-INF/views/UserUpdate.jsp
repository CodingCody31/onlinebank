<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Settings Page</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	
		
</head>
<body>
	
					
								<div>
			<form:form id="regForm" modelAttribute="user" action="/update/${id}" method="post"  >
			<input type="hidden" name="_method" value="put" >
				<br><br><br>
				<table class="table table-hover" >
				<tr>
					<td> <form:label path="first_name">First Name</form:label></td>
					<td> <form:input path="first_name" name="first_name" id="first_name"/></td>
				</tr> 
				<tr>
					<td><form:label path="last_name">Last Name</form:label></td>
					<td><form:input path="last_name" name="last_name" id="last_name" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email" name="email" id="email" /></td>
				</tr>
					<tr>
					<td><form:label path="username">Username</form:label></td>
					<td><form:input path="username" name="username" id="username" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:input path="password" name="password" id="Password" /></td>
				</tr>
			</table>
<input
			type="submit" value="Update User" style="background-color:#1A2F42;color:white;width:250px;height:50px; font-size: 150%;">		  </form:form>
		
			
			</div>

			 
					
<br>
			
					
</body>
</html>
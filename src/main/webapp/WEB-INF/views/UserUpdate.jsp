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
	<div class="header">
			<img id ="logo" src="images/logo.png">
		</div>
		<div class="sidebar">
			<a href="/accounts"><h1 id="nav_text_accounts">Accounts</h1></a>
			<br>
			<a href="/transactions"><h1 id="nav_text_transactions">Transactions</h1></a>
			<br>
			<a href="/transfers"><h1 id="nav_text_transfers">Transfers</h1></a>
			<br>
			<a href="/settings"></a><h1 id="nav_text_settings"><b>Settings</b></h1></a>
			<br>
			<a href="/"><h1 id="nav_text_signoff">Sign Off</h1></a>
					</div> 
					
								<div>
			<form:form id="regForm" modelAttribute="user" action="/settings/${id}" method="post">
			<input type="hidden" name="_method" value="put">
				<br><br><br>
				<table class="table table-hover">
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
					<td><form:label path="password">Password</form:label></td>
					<td><form:input path="password" name="password" id="Password" /></td>
				</tr>
			</table>
		  <input type="submit" value="Submit"/>
		  </form:form>
		
			
			</div>

			 
					
<br>
			
					
</body>
</html>
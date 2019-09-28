<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="header">
		<img id="logo" src="images/logo.png">
	</div>
	<div class="signup_page">
		<div id="signup_body">
			<h1>Sign Up</h1>
			<%-- <form:errors path="user.*"/> --%>
		<form:form method="post" action="/createAccount" modelAttribute="account">
			
			<select name="type">
				<option value="0" selected>(Please Select Account type:)</option>
				<option value="Savings">Saving</option>
				<option value="Checking">Checking</option>
				<option value="IRA">IRA</option>
				<option value="CD">CD</option>
			</select> <input type="text" name="choicetext">
		</div>
		<p align="center">
			<br> <input type="submit" name="submit" value="Sign Up">
			</form:form>
	</div>
</body>
</html>
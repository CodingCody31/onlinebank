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
			<h1>Please Choose</h1>
			<%-- <form:errors path="user.*"/> --%>
		<form:form method="POST" action="/createAccount" modelAttribute="account">
			<form:select path="type" name="type">
				<form:option value="0">(Please Select Account type:)</form:option>
				<form:option value="Savings">Savings</form:option>
				<form:option value="Checking">Checking</form:option>
				<form:option value="IRA">IRA</form:option>
				<form:option value="CD">CD</form:option>
			</form:select> 
			<br>
			<input type="submit" name="submit" value="Submit">
			</form:form>
			</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign Up</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="header">
			<img id ="logo" src="images/logo.png">
		</div>
		<div class="signup_page">
			<div id="signup_body">
				<h1>Sign Up</h1>
				<%-- <form:errors path="user.*"/> --%>
				<form:form method="POST" action="/signup" modelAttribute="user">
					<form:label path="username">
					<form:input type="username" path="username" name="username" placeholder="Username"/>
					</form:label>
					<br>
					<form:label path="password">
					<form:password path="password" name="password" placeholder="Password"/>
					</form:label>
					<br>
					<form:label path="passwordConfirmation"></form:label>
           			<form:password path="passwordConfirmation" placeholder="Password Confirmation"/>
					<br>
					<form:label path="first_name">
					<form:input type="first_name" path="first_name" name="first_name" placeholder="First Name"/>
					</form:label>
					<br>
					<form:label path="last_name">
					<form:input type="last_name" path="last_name" name="last_name" placeholder="Last Name"/>
					</form:label>
					<form:label path="email">
					<form:input type="email" path="email" name="email" placeholder="Email"/>
					</form:label>
					<br>
					<input type="submit" name="submit" value="Sign Up">
				</form:form>
			</div>
		</div>
</body>
</html>
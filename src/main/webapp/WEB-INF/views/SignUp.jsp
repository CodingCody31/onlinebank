<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
				<form>
					<input type="text" name="username" placeholder="Username" required>
					<br>
					<input type="password" name="password" placeholder="Password" required>
					<br>
					<input type="text" name="question" placeholder="Security Question?" required>
					<br>
					<input type="text" name="question" placeholder="Security Answer" required>
					<br>
					<p>What are you opening today?</p>
					<select name="accounts">
	  					<option value="checkings">Checkings</option>
	  					<option value="savings">Savings</option>
	  					<option value="business">Buisness</option>
	 					<option value="retirement">IRA Account</option>
					</select>
					<br>
					<input type="submit" name="submit" value="Sign Up">
				</form>
			</div>
		</div>
</body>
</html>
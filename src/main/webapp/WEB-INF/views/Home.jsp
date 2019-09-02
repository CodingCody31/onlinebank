<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Merit America Online Bank</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="header">
			<img id ="logo" src="images/logo.png">
		</div>
		<div class ="jumbotron">
			<div class="titles">
				<h1 id="title">The Best Banking<br>In The World!</h1>
				<h2 id="subtitle">Easy sign up, and no hidden fee's</h2>
				<a href="/signup" id ="signup">Sign Up</a>
			</div>
			<div id="signin">
				<p>View Your Accounts</p>
				<form action = /account.html>
					<input type="text" name="username" placeholder="Username" required>
					<br>
					<input type="password" name="password" placeholder="Password" required>
					<br>
					<a href="#">Forgot Username/Password?</a>
					<br>
					<input type="submit" name="submit" value="Sign On">
				</form>
			</div>
		</div>
		<div class = "types_of_accounts">
			<div id="checkings">
				<img src="images/check.png">
				<h2>Checkings</h2>
			</div>
			<div id="savings">
				<img src="images/piggy_bank.png">
				<h2>Savings</h2>
			</div>
			<div id="buisness">
				<img src="images/bank.png">
				<h2>Business</h2>
			</div>

		</div>
</body>
</html>
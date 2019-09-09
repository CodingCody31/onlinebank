<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Transfers Page</title>
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
			<a href="/transfers"><h1 id="nav_text_transfers"><b>Transfers</b>
			
			<fieldset>
			<legend>Select Account</legend>
			<input type="checkbox" name="account" value="savings" checked />Savings
			<input type="checkbox" name="account" value="checking" />Checking		
			</fieldset>
			</h1></a>
			<br>
			<a href="/settings"></a><h1 id="nav_text_settings">Settings</h1></a>s
			<br>
			<a href="/"><h1 id="nav_text_signoff">Sign Off</h1></a>
		</div>
</body>
</html>
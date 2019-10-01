<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
			<a href="settings/${userId}"></a><h1 id="nav_text_settings"><b>Settings</b></h1></a>
			<br>
			<a href="/"><h1 id="nav_text_signoff">Sign Off</h1></a>
					</div> 
			<div>
			<h1> <c:out value="${user.first_name}"/> </h1>
			
			</div>

			

			 			
			<input type="button" value="Update" onclick="window.location='/update/${user.user_id}'" >
			
			<button type="button"> Delete </button>

					
<br>
			
					
</body>
</html>
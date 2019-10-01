<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Settings Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">


</head>
<body>


	<h1>Settings</h1>


	<input type="button" value="Update"
		onclick="window.location='/update/${user.user_id}'"
		style="background-color: #1A2F42; color :white ; width:450px; height:50px; font-size: 150%;">

	<button type="button"
		style="background-color: #1A2F42; color: white; width: 450px; height:50px; font-size: 150%;">
		Delete</button>


	<br>


</body>
</html>
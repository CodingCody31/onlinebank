
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Initiate Transfer</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>


	<h1>Transfer Money</h1>
	<form action="/makeTransfer/" method="post" modelAttribute="user">

		<h3>From</h3>

		<select name='idFrom' style="width:450px;height:50px;  background-color: white;
		">

			<c:forEach items="${user}" var="user">
				<option value="${user.account_id}" selected>Account
					:${user.type} Amount : ${user.amount}</option>
			</c:forEach>
		</select> <br></br>
		<h3>To</h3>

		<select name='idTo'  style="width:450px;height:50px;  background-color: white;
		">

			<c:forEach items="${user}" var="user">
				<option value="${user.account_id}" selected>Account
					:${user.type} Amount : ${user.amount}</option>
			</c:forEach>
		</select>

		<h3>Amount</h3>

		<input type="text" name="amount" style="width:250px;height:40px;  background-color: white;
		"><br> <br><input
			type="submit" value="Send Money" style="background-color:#1A2F42;color:white;width:450px;height:50px; font-size: 150%;">
	</form>
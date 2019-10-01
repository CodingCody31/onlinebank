<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Initiate Transfer</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

		
			<h1>Transfers</h1>
<form  action="/makeTransfer/" method="post" modelAttribute="user">
			
				<h3>FROM </h3>
			
	<select name='idFrom'>
	
    <c:forEach items="${user}" var="user">
        <option value="${user.account_id}" selected>Account :${user.type} Amount : ${user.amount}</option>
    </c:forEach>
</select>
<br></br>
	<h3>TO</h3>

<select name='idTo'>
	
    <c:forEach items="${user}" var="user">
        <option value="${user.account_id}" selected>Account :${user.type} Amount : ${user.amount}</option>
    </c:forEach>
</select>
		
  Amount: <input type="text" name="amount"><br>
  <input type="submit" value="Submit">
</form>

	<h1>Transfers</h1>
	<form action="/transfers/{id}/{fromId}/{toId}">

		<h3>FROM</h3>

		<select name='Transfers_from'>

			<c:forEach items="${user}" var="user">
				<option value="${user.account_id}" selected>Account
					:${user.type} Amount : ${user.amount}</option>
			</c:forEach>
		</select> <br></br>
		<h3>TO</h3>

		<select name='Transfers_to'>

			<c:forEach items="${user}" var="user">
				<option value="${user.account_id}" selected>Account
					:${user.type} Amount : ${user.amount}</option>
			</c:forEach>
		</select> <br></br> Amount: <input type="text" name="lname"><br> <input
			type="submit" value="Submit"> <br></br>

	</form>
>>>>>>> aa8f4120ff0625a4a66f08bfec4ef5b3c7b31088

</body>
</html>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">

<title>Deposit</title>
</head>
<body>


<form:form action="/account/deposit/" method="post" modelAttribute="account">



<form:label path="amount">Deposit
<form:errors path="amount"/>
<form:input path="amount"/>
</form:label>



<input type="submit" value="Submit"/>
</form:form>
</body>
</html>
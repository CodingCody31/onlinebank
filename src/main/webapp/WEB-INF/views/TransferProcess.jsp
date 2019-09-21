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
	<div >
		
			<h1>Transfer</h1>
			<form:form action="/transfers" method="post" modelAttribute="accountObject">
				<h2>
			        <form:label  path="transfer_from">Transfer From:</form:label>
			        <form:select  path="account">
						<c:forEach items="${accountslist}" var="account">
							<form:option value="${account.id}"><c:out value="${account.id}"/></form:option>
						</c:forEach>c:forEach>
					</form:select>
			    </h2>	  
			    <h2>
			        <form:label  path="transfer_to">Transfer To:
			        <li>Choose account to transfer to</li>
			        </form:label>
    			    <form:select  path="account">
						<c:forEach items="${accountslist}" var="state">
							<form:option value="${account.id}"><c:out value="${account.id}"/></form:option>
						</c:forEach>c:forEach>
					</form:select>
			    </h2>
			     <h2>
			        <form:label  path="amoumt">Enter Amount:</form:label>
    			   <form:input  type="double" path="amount"/>
					
			    </h2>
			    <h2>
			        <form:label  path="date">Date:
			        <li>pick a date</li>
			        </form:label>
			        <form:input  type="date" path="date"/>
			    </h2>
			    <input  type="submit" value="Send"/>	 
			</form:form>
		</div>
		
</body>
</html>
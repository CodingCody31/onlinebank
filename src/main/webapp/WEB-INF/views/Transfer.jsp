<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> 
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
			<a href="/transfers"><h1 id="nav_text_transfers"><b>Transfers</b> </h1></a>
			
			<br>
			<a href="/settings"></a><h1 id="nav_text_settings">Settings</h1></a>
			<br>
			<a href="/"><h1 id="nav_text_signoff">Sign Off</h1></a>
		</div>
		
		<div>
		  
		  <h2>
			        <form:label path="transfers">Transfer:</form:label>
    			    <form:select path="accountslist">
						<c:forEach items="${accounts}" var="account">
							<form:option value="${account.id}"><c:out value="${account.id}"/></form:option>
						</c:forEach>c:forEach>
					</form:select>
		  </h2>
					<form:form >			    
								 <input type="submit" value="Select"/>
					</form:form>
           </div>
                 
		</body>
</html>
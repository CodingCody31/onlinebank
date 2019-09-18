<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Page</title>
</head>
<body>
<h2>Accounts</h2>



<form action="deposit">
  Deposit: <input type="text" name="fname"><br>
  <input type="submit" value="Submit">
</form>

<c:forEach items="${user}" var="user">
       <tr>
           <td><c:out value="${user.account_id} ${user.type} ${user.amount}"/> <br/></td>
           
          
       </tr>
       </c:forEach>
</body>
</html>
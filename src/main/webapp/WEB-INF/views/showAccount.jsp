<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">

<title>Account Page</title>
</head>
<body>
	<div class="header">
			<img id ="logo" src="images/logo.png" value="<%=session.getAttribute("userId")%>"/>>
	</div>
	<div class="sidebar">
		<a href="/showAccount"><h1 id="nav_text_accounts">
				<b>Accounts</b>
			</h1></a> <br> <a href="transaction.html"><h1
				id="nav_text_transactions">Transactions</h1></a> <br> <a
			href="/transfers/${userId }"><h1 id="nav_text_transfers">Transfers</h1></a> <br>
		<a href="setting"></a>
		<h1 id="nav_text_settings">Settings</h1>
		</a> <br> <a href="index.html"><h1 id="nav_text_signoff">Sign
				Off</h1></a>
	</div>
	<div class="main_container">

		<p>Account Summary</p>


		<div class="#accountBox">
			<div class="#main_boxes">

				<c:forEach items="${user}" var="user">
					<tr>
						<div
							style="margin-left: 60px; background-color: #1A2F42; font-size: 150%; color: white display: inline-block; border-radius: 30px; border: 2px solid black; width: 60%; padding: 5px 5px 5px 5px; color: white; height: 120px; margin-bottom: 10px; margin-right: 10px; box-shadow: 2px 2px 10px grey;">

							<td><c:out value="${user.type}" /><br> <c:out
									value="...${user.acc_num}" /><br> <c:out
									value="Available Balance : $ ${user.amount}" /><br>

								<button
									onclick="window.location.href = '/deposit/${user.account_id}'; ">Deposit</button>
								<button
									onclick="window.location.href = '/withdraw/${user.account_id}'; ">Withdraw</button>

								<br /></td>
						</div>

					</tr>
				</c:forEach>
			</div>
		</div>
		<button onclick="window.location.href = 'createAccount'; " style="margin-right :360px; background-color: #1A2F42; font-size: 150%; color: white display: inline-block; border-radius: 30px; border: 2px solid black; width: 40%; padding: 5px 5px 5px 5px; color: white; height:50px; margin-top :50px; box-shadow: 2px 2px 2px grey;">Create
			Account</button>
		<a href="transaction.html"><div id="main_boxes"></div></a>
	</div>
</body>
</html>
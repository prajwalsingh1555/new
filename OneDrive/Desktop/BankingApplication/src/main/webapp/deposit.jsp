<%@page import="Beans.accountDAO"%>
<%@page import="Beans.DepositBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}
	body{
		background-image: url("https://wallpaperaccess.com/full/12313.jpg");
		background-repeat: no-repeat;
		background-size: cover;
		background-position: center;
		height: 100vh;
		width: 100vw;
	}
	ul{
		display: flex;
		align-items: center;
		justify-content: right;
		color: white;
		font-size: 1.5rem;
		list-style: none;
		margin-top: .5rem;
	}
	a{
		color: white;
		margin-left: 1rem;
	}

.main{
display: flex;
flex-direction: column;
justify-content: center;
align-items:center;
}
input[type=text],[type=password], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
display: flex;
flex-direction: column;
justify-content: center;
align-items:center;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  height: 600px;
  width: 500px;
}

.butn{
	height: 25px;
	width: 80px;
	color: white;
	background-color: red;
	border: none;
	border-radius: 5px;
	margin-left: 1rem;
}
</style>
</head>
<body>
<div class="main">
	<div class="navbar"> 
		<ul>
		<li><a href="Homepage.jsp">Home</a></li>
		<li><a href="addAccount.jsp">Add Account</a></li>
		<li><a href="deposit.jsp">Deposit</a></li>
		<li><a href="">Transfer</a></li>
		<li><a href="">Close Account</a></li>
		<li><a href="">Credit Card</a></li>
		<li><a href="">Withdrawal</a></li>
		<li><a href="">Balance</a></li>
		<li><form action="<%=request.getContextPath()%>/SignupAndLoginAuthentication?action=logout" method="post"><button class="butn">LOGOUT</button></form></li>
		</ul>
	</div>
	<h3>Contact Form</h3>
	
	<%
	accountDAO ad = new accountDAO();
	String username = ad.getUsername();
	String account_no = ad.getAccount_no();
	
	%>

<div class="container">
<h1>ADD ACCOUNT</h1>
  <form action="accountcrudservlet?action=deposit" method="post">
    <label for="fname">Username</label>
    <input type="text" id="fname" name="username" placeholder="Your username.." value="<%=username %>" required readonly>

    <label for="lname">Password</label>
    <input type="password" id="lname" name="password" placeholder="Enter Password" required>


    <label for="lname">Account Number</label>
    <input type="text" id="lname" name="account_no" placeholder="Account Number" value="<%=account_no %>" required readonly>

    
    <label for="lname">Amount</label>
    <input type="text" id="lname" name="amount" placeholder="Enter Deposit Amount" required>

    <input type="submit" value="Submit">
  </form>
</div>
</div>

</body>
</html>
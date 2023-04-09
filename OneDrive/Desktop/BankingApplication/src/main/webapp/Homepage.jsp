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
.container {
display: flex;
flex-direction: column;
justify-content: center;
align-items:center;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  height: 550px;
  width: 500px;
}
.butn{
	height: 25px;
	width: 80px;
	color: white;
	background-color: red;
	border: none;
	border-radius: 5px;
	margin-left: .8rem;
	
}
</style>
</head>
<body>
<div class="main">
	<div class="navbar"> 
		<ul>
		<li><a href="Homepage.jsp">Home</a></li>
		<li><a href="addAccount.jsp">Add Account</a></li>
		<li><a href="deposit.jsp">Desposit</a></li>
		<li><a href="">Transfer</a></li>
		<li><a href="">Close Account</a></li>
		<li><a href="">Credit Card</a></li>
		<li><a href="">Withdrawal</a></li>
		<li><a href="">Balance</a></li>
		<li><form action="<%=request.getContextPath()%>/SignupAndLoginAuthentication?action=logout" method="post"><button class="butn">LOGOUT</button></form></li>
		</ul>
	</div>
</div>

</body>
</html>
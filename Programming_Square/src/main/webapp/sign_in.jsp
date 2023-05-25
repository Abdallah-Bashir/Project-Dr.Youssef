<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<title>Sign In</title>
	<link rel="stylesheet" href="sign up.css">
</head>
<body>
	<div class="container">
		<h1>Sign In</h1>
		<form method="POST" action="login_servlet_page">
			<label for="username">Username</label>
			<input type="text" id="username" name="username" required>

			<label for="password">Password</label>
			<input type="password" id="password" name="password" required>

			<button type="submit">Sign In</button>
		</form>
		<p>You want to register?<a href="sign_up.jsp"> Sign up</a></p>
	</div>
</body>
</html>
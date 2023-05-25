<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Sign Up</title>
	<link rel="stylesheet" href="sign up.css">
</head>
<body>
	<div class="container">
		<h1>Sign Up</h1>
		<form method="POST" action="Register_servlet_page">
			<label for="name">Name</label>
			<input type="text" id="name" name="name" required>
			
			<label for="name">Username</label>
			<input type="text" id="username" name="username" required>
			
			<label for="email">Email</label>
			<input type="email" id="email" name="email" required>
			
			<label for="password">Password</label>
			<input type="password" id="password" name="password" required>
			
			
			
			<button type="submit">Sign Up</button>
		</form>
		<p>Already have an account? <a href="sign_in.jsp">Sign In</a></p>
	</div>
</body>
</html>
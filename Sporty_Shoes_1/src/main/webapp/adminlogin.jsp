<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H2>Admin Login</H2>
<br>
<form action="checkAdmin" method="post">
<label>Username</label>
<input type="text" name="name"><br>
<label>Password</label>
<input type="text" name="password"><br>
<br>
<input type="submit" value="Submit">
</form>

<a href="adminsignin">Want to create a new Admin?</a>

</body>
</html>
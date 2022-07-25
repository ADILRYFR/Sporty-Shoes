<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H2>User Signin</H2>
<br>
<form action="createUser" method="post">
<label>Username</label>
<input type="text" name="name"><br>
<label>Password</label>
<input type="text" name="password"><br>
<input type="submit" value="Submit">
</form>


<a href="login">Already have an account? Click here</a>
<a href="adminlogin">Admin? Click here</a>


</body>
</html>
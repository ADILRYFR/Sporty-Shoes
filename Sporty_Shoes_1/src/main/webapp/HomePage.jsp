<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Hello ${requestScope.user}</h2>

<a href="login">Login Page</a>
<% request.setAttribute("user",request.getAttribute("user")); %>



</body>
</html>
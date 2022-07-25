<%@page import="java.util.Iterator"%>
<%@page import="com.bean.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<tr> 
<th>ID</th>
<th>Username</th>
<th>Password</th>
</tr>

<%
System.out.println("lit");
Object obj = request.getAttribute("lut");
System.out.println("Lut");
List<User> listuser = (List<User>)obj;
Iterator<User> it = listuser.iterator();
while(it.hasNext()){
	User u = (User)it.next();
	%>
     <tr>
     <td><%= u.getUser_id() %>
     <td><%= u.getUser_username() %></td>
     <td><%= u.getUser_password() %></td>
	</tr>
	<%
}

%>

</table>
<a href="adminhomepage">Home page</a>

</body>
</html>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
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
<br>
<table border="1">
<tr>
<th>Product</th>
<th>Category</th>
<th>Price</th>
</tr>

<%
System.out.println("Chheck");
Object obj = request.getAttribute("produt");
System.out.println("Check again");
if(obj!=null){
  List<Product> list = (List<Product>)obj;
  Iterator<Product> it = list.iterator();
  while(it.hasNext()){
	  Product p = it.next();
	  %>
	  <tr>
	  <td><%=p.getP_name() %></td>
	  <td><%= p.getP_category() %></td>
	  <td><%= p.getP_price() %></td>
	  </tr>
	  <%
  }
}
else{
	 %>
	  <tr>
	  <td>No Products To Show</td>
	  
	  </tr>
	  <%
}
%>

<tr>


</table>
<br>
<a href="adminhomepage">Home Page</a>
</body>

</html>
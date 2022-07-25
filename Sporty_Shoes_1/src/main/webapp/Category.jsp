<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedHashSet"%>
<%@page import="java.util.Set"%>
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
<h2>Categories of Available Products</h2>
<form action="getProducts" method="post">
<table border="2">
<tr>
<th>Category</th>
</tr>

<% Object obj = request.getAttribute("lit");
   if(obj!=null){
	   List<Product> list = (List<Product>)obj;
	   List<String> newlist = new ArrayList<>();
	
		   Iterator<Product> ita = list.iterator();
		   while(ita.hasNext()){ 
			   Product p = ita.next();
			   newlist.add(p.getP_category());
		   }
		   Set<String> hashset = new LinkedHashSet<>(newlist);
		   List<String> nodup = new ArrayList<>(hashset);
	   
	   Iterator<String> it = nodup.iterator();
	   while(it.hasNext()){
		   String p = it.next();
		   %>
		 <tr> <td> <%=p %>  </td>  </tr>
		   
		   <%
	   }
   }else{
	   
   }

%>

</table>
<br><br>
<label>Enter the category</label>
<label>(case sensitive)</label>
<input type="text" name="category"><br>
<input type="Submit" value="submit">
</form>
<br><br>
<a href="adminhomepage">Home Page</a>

</body>
</html>
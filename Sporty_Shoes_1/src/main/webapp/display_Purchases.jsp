<%@page import="java.util.LinkedHashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Purchase"%>
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

<form action="Purchases" method="post">
<h3>Filters</h3>
<label>Category</label>
<select name="category">

<%
Object obj = request.getAttribute("Purchase");
Object obj1 = request.getAttribute("listis");


if(obj==null){
	
}


List<Purchase> list = (List<Purchase>)obj;
List<Purchase> listp = (List<Purchase>)obj1;
List<String> newlist = new ArrayList<>();
List<String> date = new ArrayList<>();

Iterator<Purchase> it = listp.iterator();

while(it.hasNext()){
	Purchase p = it.next();
	newlist.add(p.getP_category());
	date.add(p.getPurchase_Date());
}


Set<String> hashset = new LinkedHashSet<>(newlist);
List<String> nodup = new ArrayList<>(hashset);
Iterator<String> ik = nodup.iterator();
while(ik.hasNext()){
	String p = ik.next();
	%>
	
	
	<option> <%= p %>  </option>
	
	<%
}

%>

</select>

<br>
<label>Date</label>
<select name="Date">

<%
Set<String> list_1 = new LinkedHashSet<>(date);
List<String> newlist1 = new ArrayList<>(list_1);

Iterator<String> ita = newlist1.iterator();
while(ita.hasNext()){
	String p = ita.next();
	%>
	
	<option> <%= p %>  </option>
	l
	<%
}
%>

</select>
<br>
<input type="submit" value="submit">
<br><br><br>
<h2>Filtered Purchases</h2>

<table border="2">
<tr>

<th>Purchase ID</th>
<th>Product ID</th>
<th>Category</th>
<th>Date</th>
<th>Price</th>

</tr>
<%
Iterator<Purchase> itaa = list.iterator();
while(itaa.hasNext()){
	Purchase p = itaa.next();
	%>
	<tr>
	
	<td><%=p.getPurchase_id() %></td>
	<td><%=p.getProduct_id() %></td>
	<td><%=p.getP_category() %></td>
	<td><%=p.getPurchase_Date() %></td>
	<td><%=p.getP_price() %></td>	
	</tr>
	
	<%
}
%>


</table>

<br><br><br><br>
<h2>The existing Purchases</h2>
<table border="2">
<tr>

<th>Purchase ID</th>
<th>Product ID</th>
<th>Category</th>
<th>Date</th>
<th>Price</th>

</tr>
<%
Iterator<Purchase> its = listp.iterator();
while(its.hasNext()){
	Purchase p = its.next();
	%>
	<tr>
	
	<td><%=p.getPurchase_id() %></td>
	<td><%=p.getProduct_id() %></td>
	<td><%=p.getP_category() %></td>
	<td><%=p.getPurchase_Date() %></td>
	<td><%=p.getP_price() %></td>	
	</tr>
	
	<%
}
%>


</table>
<br>
</form>

<a href="adminhomepage">Home Page</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.entities.ProduitsTest" %>
    <%@page import="com.entities.Categorie" %>
<%@page import="java.util.ArrayList" %>
<%Categorie maCategorie = (Categorie)request.getAttribute("categorie"); %>
<%ArrayList<ProduitsTest> mesProduit = (ArrayList<ProduitsTest>)request.getAttribute("mesProduits"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=maCategorie.getNomCat()%> - <%=maCategorie.getDescription() %></title>
</head>
<body>
	<%@include file="Header.jsp" %>
	<main>
	 
	 	<h2><%=maCategorie.getNomCat()%> - <%=maCategorie.getDescription() %></h2>
	 <div id="shopbox">
	<%
	
	if(mesProduit != null){
		for (ProduitsTest prod : mesProduit) {
	%>
	<div>
	<a href="AfficherInformation?id=<%=prod.getId()%>"><ul class="shopindex">
		<img src="image/<%=prod.getItemImgLink() %>">
		<li><%=prod.getName() %></li>
		<li><%=prod.getDescription() %></li>
		<li>price : <%=prod.getPrice() %> $</li>
		<li>quantity : <%=prod.getNbOfItem() %></li>

	</ul></a>
		</div>
		<%}
	}%>
	
	</div>
	</main>
		
	<%@include file="footer.jsp" %>
</body>
</html>
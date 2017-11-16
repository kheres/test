<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.entities.ProduitsTest" %>
<%@page import="java.util.ArrayList" %>
<%ArrayList<ProduitsTest> mesProduit = (ArrayList<ProduitsTest>)request.getAttribute("mesProduits"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shop | TacticFit</title>
</head>
<body>
	 <%@include file="Header.jsp" %>
	 <main>
	 <div class="imgprincipal">
		 
	 	<img src="image/running2.jpg">
	 	<a href=index?categorie=1>
	 		<p>Get yourself some kicks</p>
	 	</a>
	 </div>
	 <div class="imgprincipal">
		 
	 	<img src="image/hats.jpg">
	 	<a href=index?categorie=3>
	 		<p>Keep your head warm</p>
	 	</a>
	 </div>


	 	<!--  <h2>all product</h2>-->
	<!-- <div id="shopbox">-->
	<%--
	
	if(mesProduit != null){
		for (ProduitsTest prod : mesProduit) {
	--%>
	<!--  <div>
	<ul class="shopindex">
		<img src="image/<%--=prod.getItemImgLink() --%>">
		<li><%--=prod.getName() --%></li>
		<li><%--=prod.getDescription() --%></li>
		<li>price : <%--=prod.getPrice() --%> $</li>
		<li>quantity : <%--=prod.getNbOfItem() --%></li>
	</ul>
		</div>
		<%--}
	}--%>
	
	</div>
-->
	</main>
		 <%@include file="footer.jsp" %>
</body>
</html>
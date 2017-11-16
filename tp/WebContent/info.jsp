<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.entities.ProduitsTest" %>
<%ProduitsTest prod = (ProduitsTest)request.getAttribute("mesProduits"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>information</title>
</head>
<body>
		 <%@include file="Header.jsp" %>
	 <main>
		<div class="col-12"id="infoprod">
			<div class="col-6"><img src="image/<%=prod.getItemImgLink() %>"></div>
			<div class="col-6">
				<div class="col-12"><%=prod.getName() %></div>
				<div class="col-12"><%=prod.getDescription() %></div>
				<div class="col-12">price : <%=prod.getPrice() %> $</div>
				<div class="col-12">quantity : <%=prod.getNbOfItem() %></div>
				<%if(user != null){ %>
				<div class="col-12"><a href="AjouterCart?id=<%=prod.getId() %>">add to cart</a></div>
				<%}else{ %>
				<div class="col-12"><a href="login.jsp">add to cart</a></div>
				<%} %>
			</div>

		</div>

	</main>
		 <%@include file="footer.jsp" %>
</body>
</html>
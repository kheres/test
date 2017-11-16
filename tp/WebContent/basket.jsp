<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.entities.ProduitsTest" %>
    <%@page import="com.entities.Cart" %>
<%@page import="java.util.ArrayList" %>
<% Cart cart = (Cart) session.getAttribute("cart"); 
					float prix = 0;%>

<%ArrayList<ProduitsTest> mesProduit = (ArrayList<ProduitsTest>)request.getAttribute("mesProduits"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <%@include file="Header.jsp" %>
	 	<div ">			
			<table id="basket" border="1" width="100%" >
				<tbody>
					<tr>
					<th>id</th>
						<th>title</th>
						<th>Description</th>
						<th>Price</th>
						<th>Quantite</th>
						<th>option</th>
					</tr>
							<%if (cart != null) { 
			HashMap<String, Integer> items = cart.getCartItems();
 for(String i :items.keySet()) {
					int id = Integer.parseInt(i);
					ProduitsTest mov = mesProduit.get(--id);
					
					

		%><%System.out.println(i);%>
					<tr>
						<td><%=mov.getId() %></td>
						<td><%=mov.getName()%></td>
						<td><%=mov.getDescription()%></td>
						<td><%=mov.getPrice()%></td>
						<td><%=items.get(i) %></td>

					    <td colspan="2"><a href="Modifierlist?id=<%=i%>">remove </a></td>
					</tr>


		<%
		prix += mov.getPrice();
 }}%>
							</tbody>
			</table>
			<div>
				<p>Le cout total est de : <%= prix %>$</p>
				<form action="">
				 <input type="submit" value="Soumettre la commande"></form>
			</div>


	</div>
	 		 <%@include file="footer.jsp" %>
</body>
</html>
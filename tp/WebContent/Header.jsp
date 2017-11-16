<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.entities.Utilisateur" %>
<% Utilisateur user = (Utilisateur) session.getAttribute("utilisateur"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/style.css">
 <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
 
 <script>
  !function(){var analytics=window.analytics=window.analytics||[];if(!analytics.initialize)if(analytics.invoked)window.console&&console.error&&console.error("Segment snippet included twice.");else{analytics.invoked=!0;analytics.methods=["trackSubmit","trackClick","trackLink","trackForm","pageview","identify","reset","group","track","ready","alias","debug","page","once","off","on"];analytics.factory=function(t){return function(){var e=Array.prototype.slice.call(arguments);e.unshift(t);analytics.push(e);return analytics}};for(var t=0;t<analytics.methods.length;t++){var e=analytics.methods[t];analytics[e]=analytics.factory(e)}analytics.load=function(t){var e=document.createElement("script");e.type="text/javascript";e.async=!0;e.src=("https:"===document.location.protocol?"https://":"http://")+"cdn.segment.com/analytics.js/v1/"+t+"/analytics.min.js";var n=document.getElementsByTagName("script")[0];n.parentNode.insertBefore(e,n)};analytics.SNIPPET_VERSION="4.0.0";
  analytics.load("yz3az24BkpnEpuSK3NRlCqZq63Sr13ip");
  analytics.page();
  }}();
</script>
</head>
<body>
<header class="col-xs-12 col-sm-12 col-lg-11">
<nav id="menu">
<ul>
	<li><a class="icon"  href="index"><img src=image/Body.png></a></li>
	<li><a  href="index">Accueil</a></li>
	<li>	<div class="dropdown">
		<button onclick="myFunction()" class="dropbtn">Magasiner</button>
  		<div id="myDropdown" class="dropdown-content">
   			<input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
   				<a href="index?categorie=1">Shoes</a>
   				<a href="index?categorie=5">T-shirt</a>
    			<a href="index?categorie=2">Shorts</a>
    			<a href="index?categorie=3">Hat</a>
    			<a href="index?categorie=4">accessories</a>
 		 </div>
	</div></li>
	<li><a href="contact.jsp">Contact</a></li>
	<li><a <%if(user != null){ %>href="AjouterCart"<%}else{ %> href="login.jsp"<%} %>>Panier</a></li>
	<%if(user != null){%>
		<li><a href="logout">Logout</a></li>
		<li><p>Hey, <%=user.getPrenom() %></p></li>
		<%}else { %>
	<li><a href="login.jsp">login</a></li>
	<li><p>Hey, Sign in now</p></li>
	<%} %>
</ul>
</nav>
<script>
/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}

function filterFunction() {
    var input, filter, ul, li, a, i;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    div = document.getElementById("myDropdown");
    a = div.getElementsByTagName("a");
    for (i = 0; i < a.length; i++) {
        if (a[i].innerHTML.toUpperCase().indexOf(filter) > -1) {
            a[i].style.display = "";
        } else {
            a[i].style.display = "none";
        }
    }
}
</script>
</header>
</body>
</html>
package com.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entities.Utilisateur;
import com.entities.Cart;

public class GestionSession {
	
	
public void ajouterEtudianToSession(HttpServletRequest request,Utilisateur utilisateur ){
		
		HttpSession mySession = request.getSession(); 
		mySession.setAttribute("utilisateur",utilisateur);
		
		
	}
public static void detruireSession(HttpServletRequest request,HttpServletResponse response) {
	
	HttpSession session=request.getSession();
	    session.invalidate();
	
	try {
		request.getRequestDispatcher("index").forward(request, response);
		
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void addToCart(HttpServletRequest request,String id,int nbitem){
	HttpSession mySession = request.getSession();
	Cart shoppingCart;
	shoppingCart = (Cart) mySession.getAttribute("cart");
	if(shoppingCart == null){
		shoppingCart = new Cart();
	}
	shoppingCart.addToCart(id, nbitem);
	mySession.setAttribute("cart", shoppingCart);
}

public static void remove(HttpServletRequest request,String id){
	HttpSession mySession = request.getSession();
	Cart shoppingCart;
	shoppingCart = (Cart) mySession.getAttribute("cart");
	shoppingCart.removeFromCart(id);
	mySession.setAttribute("cart", shoppingCart);
}

}

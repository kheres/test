package com.entities;

import java.util.HashMap;

public class Cart {
	    HashMap<String, Integer> cartItems;
	    public Cart(){
	     cartItems = new HashMap<>();
	      
	    }
	    public HashMap getCartItems(){
	        return cartItems;
	    }
	    public void addToCart(String itemId, int number){
	        cartItems.put(itemId, number);
	    }
	     
	    public void removeFromCart(String id){
	    	cartItems.remove(id);
	    }
	}


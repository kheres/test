package com.utils;

public class Validation {
	
	public static boolean isNumber(String nb){
		boolean retour = false;
		
		try {
			Integer.parseInt(nb);
			retour = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return retour;
	}
	

}

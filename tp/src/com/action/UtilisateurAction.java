package com.action;


import com.entities.Utilisateur;
import com.manager.UtilisateurManager;

public class UtilisateurAction {
	public static boolean creeNouveauMembre(Utilisateur membre){
		boolean retour = false;
		if(UtilisateurManager.insert(membre)){
			retour = true;
		}
		
		return retour;
	}
	public static boolean userExiste (Utilisateur membre){
	 	boolean retour = false ;
	 			if(UtilisateurManager.userExiste(membre)){
	 				retour = true;
	 			}
	 	System.out.println(retour);
	 	return  retour;
	}
}

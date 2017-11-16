package com.manager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.entities.Utilisateur;
import com.service.ConnectionBD;

public class UtilisateurManager {
	private static String queryInsert = "insert into customers(first_name,last_name,email,password,avatar,join_date) value(?,?,?,?,?,CURDATE())";
	private static String queryConnexion = "select * from customers where email=? and password=? ";
	
	public static boolean insert(Utilisateur user){
		boolean retour = false;
		ResultSet idRetour = null;
		int nbLigne = 0;
		PreparedStatement ps;
		try {
			ps = ConnectionBD.getConnection().prepareStatement(queryInsert,Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1,user.getPrenom());
			ps.setString(2,user.getNom());
			ps.setString(3,user.getEmail());
			ps.setString(4,user.getPassword());
			ps.setString(5,user.getImgLink());
			nbLigne = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//		System.out.println("nb ligne " + nbLigne);
		if(nbLigne >0 )
			retour = true;		
		ConnectionBD.closeConnection();
		return retour;
	}
	
	public static boolean userExiste(Utilisateur membre) {
		boolean retour = false;
		PreparedStatement ps;

		int nbMembre = 0;
		try {

			ps = ConnectionBD.getConnection().prepareStatement(queryConnexion);
			ps.setString(1, membre.getEmail());
			ps.setString(2, membre.getPassword());
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				nbMembre++;
				membre.setId(result.getInt("id"));
				membre.setNom(result.getString("first_name"));
				membre.setPrenom(result.getString("first_name"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		if (nbMembre >0)
			retour = true;
		System.out.println(nbMembre);
		ConnectionBD.closeConnection();
		System.out.println(retour);
		return retour;
	}
	
}

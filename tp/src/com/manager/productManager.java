package com.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.entities.ProduitsTest;
import com.service.ConnectionBD;

public class productManager {
	private static String queryGetyAll = "select * from productstest";
	private static String querydelete = "delete from productstest where id = ?";
	private static String queryGetByIdCat = "select * from productstest where categorie = ?";
	private static String queryGetById = "select * from productstest where id =?";
	
	public static ArrayList<ProduitsTest> getAll(){
		ArrayList<ProduitsTest> mesProduit = null;
		Connection con = ConnectionBD.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(queryGetyAll);
			ResultSet result = ps.executeQuery();
			if(result.isBeforeFirst()){
				mesProduit = new ArrayList<ProduitsTest>();
			}
			while(result.next()){
				ProduitsTest m = new ProduitsTest();
				m.setId(result.getInt("id"));
				m.setName(result.getString("name"));
				m.setNbOfItem(result.getInt("quantity"));
				m.setDescription(result.getString("description"));
				m.setPrice(result.getFloat("price"));
				m.setItemImgLink(result.getString("image"));
				mesProduit.add(m);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return mesProduit;
	}
	
	public static ArrayList<ProduitsTest> getByIdCat(int idcat){
		ArrayList<ProduitsTest> mesProduit = null;
		Connection con = ConnectionBD.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(queryGetByIdCat);
			ps.setInt(1, idcat);
			ResultSet result = ps.executeQuery();
			if(result.isBeforeFirst()){
				mesProduit = new ArrayList<ProduitsTest>();
			}
			while(result.next()){
				ProduitsTest m = new ProduitsTest();
				m.setId(result.getInt("id"));
				m.setName(result.getString("name"));
				m.setNbOfItem(result.getInt("quantity"));
				m.setDescription(result.getString("description"));
				m.setPrice(result.getFloat("price"));
				m.setItemImgLink(result.getString("image"));
				mesProduit.add(m);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return mesProduit;
	}
	
	public static ProduitsTest getById(int prodId){
		boolean retour = false;
		ProduitsTest m = null;
		int nbLigne = 0;
		PreparedStatement ps;
		try {
			ps = ConnectionBD.getConnection().prepareStatement(queryGetById);
			ps.setInt(1,prodId);
			ResultSet result = ps.executeQuery();
				result.next();
				m = new ProduitsTest();
				m.setId(result.getInt("id"));
				m.setName(result.getString("name"));
				m.setNbOfItem(result.getInt("quantity"));
				m.setDescription(result.getString("description"));
				m.setPrice(result.getFloat("price"));
				m.setItemImgLink(result.getString("image"));
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(nbLigne >0 )
			retour = true;		
		ConnectionBD.closeConnection();
		return m;
	}
	
	
	public static boolean delete(int prodId){
		boolean retour = false;
		int nbLigne = 0;
		PreparedStatement ps;
		try {
			ps = ConnectionBD.getConnection().prepareStatement(querydelete);
			ps.setInt(1,prodId);
			
			
			nbLigne = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(nbLigne >0 )
			retour = true;		
		ConnectionBD.closeConnection();
		return retour;
	}
	
	
}

package com.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.entities.Categorie;
import com.service.ConnectionBD;

public class CategorieManager {
	private static String queryGetById = "select * from product_categories where id = ?";
	
	public static Categorie getById(int id){
		Categorie mesProduit = null;
		Connection con = ConnectionBD.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(queryGetById);
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
				result.next();
				mesProduit = new Categorie();
				mesProduit.setId(result.getInt("id"));
				mesProduit.setNomCat(result.getString("name"));
				mesProduit.setDescription(result.getString("description"));
				
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return mesProduit;
	}
}

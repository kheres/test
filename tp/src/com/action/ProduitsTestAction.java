package com.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Categorie;
import com.entities.ProduitsTest;
import com.manager.CategorieManager;
import com.manager.productManager;

public class ProduitsTestAction {
	public static boolean afficherProduit(HttpServletRequest request)
	{
		ArrayList<ProduitsTest> mesProduits = productManager.getAll();
		request.setAttribute("mesProduits", mesProduits);

		return (mesProduits != null ? true : false);
	}
	
	public static boolean afficherProduit(HttpServletRequest request, int id)
	{
		ArrayList<ProduitsTest> mesProduits = productManager.getByIdCat(id);
		Categorie categorie = CategorieManager.getById(id);
		request.setAttribute("mesProduits", mesProduits);
		request.setAttribute("categorie", categorie);

		return (mesProduits != null || categorie != null ? true : false);
	}
	
	public static boolean afficherProduitById(HttpServletRequest request, int id)
	{
		ProduitsTest mesProduits = productManager.getById(id);
		request.setAttribute("mesProduits", mesProduits);

		return (mesProduits != null ? true : false);
	}
}

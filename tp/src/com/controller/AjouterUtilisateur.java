package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.action.UtilisateurAction;
import com.entities.Utilisateur;

/**
 * Servlet implementation class AjouterUtilisateur
 */
@WebServlet("/AjouterUtilisateur")
public class AjouterUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idString = request.getParameter("id");
		String lname = request.getParameter("lname");
		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String uname = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		if(idString != null){
				
			//MembreAction.updateEtudiant(etu);
		}else{
			Utilisateur membre = new Utilisateur(lname,fname,email,password,uname);			
			UtilisateurAction.creeNouveauMembre(membre);
		}
				
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		
		
	}

}

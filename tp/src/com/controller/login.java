package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.action.UtilisateurAction;
import com.entities.Utilisateur;
import com.segment.analytics.Analytics;
import com.segment.analytics.messages.IdentifyMessage;
import com.segment.analytics.messages.TrackMessage;
import com.utils.GestionSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		GestionSession mySession = new GestionSession();
		Utilisateur membre = new Utilisateur(email, pass);
		boolean connexion = UtilisateurAction.userExiste(membre);
		if (connexion == true) {
			mySession.ajouterEtudianToSession(request, membre);
			/*Utilisateur u = (Utilisateur) request.getAttribute("utilisateur");
			Map<String, String> tmp = new HashMap<String, String>();
			tmp.put("email", u.getEmail());
			tmp.put("Name", u.getNom());
			Analytics analytics = Analytics.builder(info.KEY).build();
			analytics.enqueue(IdentifyMessage.builder()
					.userId("" + u.getId())
					.traits(tmp)
					.build()
					);*/
			request.getRequestDispatcher("index").forward(request, response);
		} else {
			request.getRequestDispatcher("authentificationErrorPage.jsp").forward(request, response);

		}
	}

}

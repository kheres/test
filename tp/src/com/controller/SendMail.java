package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Utilisateur;
import com.utils.GestionMail;

/**
 * Servlet implementation class SendMail
 */
@WebServlet("/sendMail")
public class SendMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String msg = "Bienvenue Mr Z bienvenue a ISI";
		Utilisateur u = (Utilisateur) request.getSession().getAttribute("utilisateur"); 
		String to = u.getEmail();
		String sujet = "Ceci est un message important";
		PrintWriter out = response.getWriter();
		out.println("Message transmis avec succes");
		 out.println(
			        "<html>\n" +
			        "<head><title>" + sujet + "</title></head>\n" +
			        "<body bgcolor=\"#f0f0f0\">\n" +
			        "<h1 align=\"center\">" + sujet + "</h1>\n" +
			        "<p align=\"center\">" + msg + "</p>\n" +
			        "</body></html>");
		
		GestionMail.sendEmail(msg, to, sujet);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

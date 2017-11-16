package com.entities;

import java.util.Date;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private Date dateOfCreation;
	private String imgLink;
	private String email;
	private String password;
	private String username;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public String getImgLink() {
		return imgLink;
	}
	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public Utilisateur(String nom, String prenom, Date dateOfCreation, String imgLink, String email,
			String password, String username) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateOfCreation = dateOfCreation;
		this.imgLink = imgLink;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public Utilisateur(int id, String nom, String prenom, Date dateOfCreation, String imgLink, String email,
			String password, String username) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateOfCreation = dateOfCreation;
		this.imgLink = imgLink;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public Utilisateur(String email, String password, String username) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public Utilisateur(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Utilisateur(String nom, String prenom, String email, String password, String username) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}

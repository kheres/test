package com.entities;

public class Categorie {
	private int id;
	private String description;
	private String nomCat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public Categorie(int id, String description, String nomCat) {
		super();
		this.id = id;
		this.description = description;
		this.nomCat = nomCat;
	}
	public Categorie() {
		super();
	}
	
	
}

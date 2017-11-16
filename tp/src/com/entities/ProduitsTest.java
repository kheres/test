package com.entities;

import java.io.Serializable;

public class ProduitsTest implements Serializable  {
	private int id;
	private String name;
	private float price;
	private int nbOfItem;
	private String itemImgLink;
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNbOfItem() {
		return nbOfItem;
	}
	public void setNbOfItem(int nbOfItem) {
		this.nbOfItem = nbOfItem;
	}
	public String getItemImgLink() {
		return itemImgLink;
	}
	public void setItemImgLink(String itemImgLink) {
		this.itemImgLink = itemImgLink;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

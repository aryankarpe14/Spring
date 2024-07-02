package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Business {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String category;
	private int revenue;
	public Business() {
		// TODO Auto-generated constructor stub
	}
	public Business(int id, String name, String category, int revenue) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.revenue = revenue;
	}
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	@Override
	public String toString() {
		return "Business [id=" + id + ", name=" + name + ", category=" + category + ", revenue=" + revenue + "]";
	}
	
	
}

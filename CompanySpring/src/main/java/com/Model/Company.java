package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String category;
	private String comOwner;
	private int empcount;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int id, String name, String category, String comOwner, int empcount) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.comOwner = comOwner;
		this.empcount = empcount;
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

	public String getComOwner() {
		return comOwner;
	}

	public void setComOwner(String comOwner) {
		this.comOwner = comOwner;
	}

	public int getEmpcount() {
		return empcount;
	}

	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", category=" + category + ", comOwner=" + comOwner
				+ ", empcount=" + empcount + "]";
	}
	
}

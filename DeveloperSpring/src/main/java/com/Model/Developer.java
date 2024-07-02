package com.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Developer {

	
	@Id
	private int did;
	private String dname;
	private int experience;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public Developer(int did, String dname, int experience) {
		super();
		this.did = did;
		this.dname = dname;
		this.experience = experience;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Developer [did=" + did + ", dname=" + dname + ", experience=" + experience + "]";
	}

	
}

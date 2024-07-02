package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int tid;
	private String tname;
	private int salary;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tid, String tname, int salary) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.salary = salary;
	}

	

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", salary=" + salary + "]";
	}
	
	
	
	
}

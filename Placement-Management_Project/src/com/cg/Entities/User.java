package com.cg.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User 
{
	@Id
	@Column(name="user_id")
	private int user_id;
	private String name;
	private String type;
	private String password;
	
	@OneToOne(mappedBy="user") //Using OneToOne Mapping
	private Admin admin;
	
	@OneToOne(mappedBy="user") //Using OneToOne Mapping
	private College college;
	
	
	
	// getter and setter method
	public int getId() {
		return user_id;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public void setId(int id) {
		this.user_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
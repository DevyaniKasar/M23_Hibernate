package com.cg.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@Column(name="Admin_Id")
	 private long Admin_id;
	 private String name;
	 private String password;
	 
	 @OneToOne(mappedBy="Admin")
		private User user;


     //Getter And Setter
    public long getAdmin_id() {
			return Admin_id;
		}

		public void setAdmin_id(long admin_id) {
			Admin_id = admin_id;
		}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   //For User
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	

	 
	 

}

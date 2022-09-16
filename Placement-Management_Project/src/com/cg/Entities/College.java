package com.cg.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College  
{
	
	@Id
	private int clg_id;
	private User collegeAdmin ;
	private String CollegeName ;
	private String location ;
	
	
	
	
	
	
	
	// getter and setter method
	public int getId() {
		return clg_id;
	}
	public void setId(int id) {
		this.clg_id = id;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//to-String method to convert object into string
	@Override
	public String toString() {
		return "College [CollegeName=" + CollegeName + "]";
	}
	
}
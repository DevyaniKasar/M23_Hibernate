package com.cg.Client;

import java.time.LocalDate;

import com.cg.Entities.Admin;
import com.cg.Entities.Certificate;
import com.cg.Entities.College;
import com.cg.Entities.Placement;
import com.cg.Entities.Student;
import com.cg.Entities.User;
import com.cg.Service.AdminService;
import com.cg.Service.AdminServiceImpl;
import com.cg.Service.CollegeService;
import com.cg.Service.CollegeServiceImpl;
import com.cg.Service.PlacementService;
import com.cg.Service.PlacementServiceImpl;
import com.cg.Service.StudentService;
import com.cg.Service.StudentServiceImpl;
import com.cg.Service.UserService;
import com.cg.Service.UserServiceImpl;

public class Client 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
		Student s=new Student();
		StudentService service=new StudentServiceImpl();
        
		s.setId(11);
		s.setRoll(101);
		s.setQualification("BE");
		s.setCourse("IT");
		s.setYear(2021);
		s.setHallTicketNo(10101);
		
		Certificate c=new Certificate();
		c.setCert_id(354);
		c.setYear(2021);
		
		//OneToOne bidirectional
		s.setCertificate(c);
		c.setStudent(s);
		service.addStudent(s);
		

		//College input 
		College clg=new College();
		CollegeService college = new CollegeServiceImpl();
		clg.setId(40411);
		clg.setCollegeName("NDMVP");
		clg.setLocation("Nashik");
		
		

		//For User
		User u=new User();
		u.setId(1010);
		u.setName("Sara");
		u.setPassword("14525");
		u.setType("new User");
		
		
		
		
		
	
		//Placement input
		Placement p=new Placement();
		PlacementService placement =new PlacementServiceImpl();
		p.setId(1515);
		p.setName("TNS Foundation");
		p.setQualification("BE");
		p.setYear(2022);
		p.setCollege(clg);
		LocalDate date=LocalDate.now();
		p.setDate(date);
		placement.addPlacement(p);
		
		//for placement table
		System.out.println("Placement Id is: "+p.getId());
		System.out.println("Placement Date is: "+p.getDate());
		System.out.println("Placement Qualification is: "+p.getQualification());
		System.out.println("Placement Year is: "+p.getYear());
		System.out.println("Placement Name is: "+p.getName());
		System.out.println("Placement College is: "+p.getCollege());
		
		
		//Admin input 
		Admin a=new Admin();
		AdminService ad=new AdminServiceImpl();
		a.setId(4585);
		a.setName("Purva");
		a.setPassword("45345");
				
	
				
		//Adding data
		ad.addNewAdmin(a);
		
		//for User table
	    System.out.println("User ID is : " +u.getId());
		System.out.println("User Name is: "+u.getName());
		System.out.println("User Type is : "+u.getType());
		System.out.println("User Password is : "+u.getPassword());
		
		
		//Displaying output for admin table
		System.out.println("Admin ID is : " +a.getId());
		System.out.println("Admin Name is: "+a.getName());
		System.out.println("Admin Password is : "+a.getPassword());
		
		//adding data
		
		service.searchStudentById(11);
		
		
		
		
}
}
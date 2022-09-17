package com.cg.Client;



import com.cg.Entities.Admin;
import com.cg.Entities.Certificate;
import com.cg.Entities.Student;
import com.cg.Entities.User;
import com.cg.Service.StudentService;
import com.cg.Service.StudentServiceImpl;
import com.cg.Service.UserService;
import com.cg.Service.UserServiceImpl;


public class Client 
{
	
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
		
	
		
		User u=new User();
		UserService service1=new UserServiceImpl();
        
		u.setUser_id(101);
		u.setName("Devyani");
		u.setType("User");
		u.setPassword("Dk");
		
		
		
		Admin a=new Admin();
		a.setAdmin_id(0);
		a.setName("Hariom");
		a.setPassword("1234");
		
		//OneToOne bidirectional
	    u.setAdmin(a);
		a.setUser(u);
		service1.addUser(u);		
}
 }

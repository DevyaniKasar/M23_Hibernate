package com.cg.Client;

import com.cg.Entities.Student;
import com.cg.Service.StudentService;
import com.cg.Service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		
		Student s=new Student();
		
		//create Operation
		s.setRollno(101);
		s.setName("Devyani");
		service.addStudent(s);
		
		/*//create Operation
		s.setRollno(102);
		s.setName("DK");
		service.addStudent(s);*/
		
		/*//retrieve data
		s=service.getStudentById(102);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());*/
		
		/*//update
		s=service.getStudentById(102);
		s.setName("DEVU");
		service.updateStudent(s);*/
		
		/*//delete
		s=service.getStudentById(101);
		service.deleteStudent(s);
		System.out.println("Data is deleted");*/



	}

}

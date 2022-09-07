package com.cg.Dao;

import com.cg.Entities.Student;

public interface StudentDao 
{
	//abstract method by default
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}

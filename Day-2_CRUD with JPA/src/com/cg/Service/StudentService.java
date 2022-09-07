package com.cg.Service;

import com.cg.Entities.Student;

public interface StudentService 
{
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);

}

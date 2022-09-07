package com.cg.Service;

import com.cg.Dao.StudentDao;
import com.cg.Dao.StudentDaoImpl;
import com.cg.Entities.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao dao;
	
	public StudentServiceImpl() {
		super();
		dao=new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student s) {
		dao.beginTransaction();
		dao.addStudent(s);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student s) {
		dao.beginTransaction();
		dao.updateStudent(s);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteStudent(Student s) {
		dao.beginTransaction();
		dao.deleteStudent(s);
		dao.commitTransaction();
		
	}

	@Override
	public Student getStudentById(int rollno) {
		Student s=dao.getStudentById(rollno);
		return s;
	}

}

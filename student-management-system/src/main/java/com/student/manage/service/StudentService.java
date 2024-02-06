package com.student.manage.service;

import java.util.List;

import com.student.manage.entities.Student;

public interface StudentService {

	Student createStudent(Student student); 
	
	List<Student>  getAll();
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}

package com.student.manage.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.manage.entities.Student;
import com.student.manage.repository.StudentRepository;
import com.student.manage.service.StudentService;

@Service
public class ServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	

	public ServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		 studentRepository.deleteById(id);
		
	}

}

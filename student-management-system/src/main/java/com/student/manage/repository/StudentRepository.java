package com.student.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.manage.entities.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

}

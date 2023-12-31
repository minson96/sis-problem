package com.example.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sis.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	Student findByStudentIdAndName();
}

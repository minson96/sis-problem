package com.example.sis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sis.entity.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long> {
	List<Grade> findByLecture(String lecture);
}

package com.example.sis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sis.entity.Student;
import com.example.sis.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentService {
	private final StudentRepository studentRepository;

	public void addStudent(String name, int studentId, String major, String requieredSubject) {
		Student studentInfo = Student.builder()
			.name(name)
			.studentId(studentId)
			.major(major)
			.requiredSubject(requieredSubject)
			.build();
		studentRepository.save(studentInfo);
	}

}

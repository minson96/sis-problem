package com.example.sis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sis.entity.Grade;
import com.example.sis.entity.Student;
import com.example.sis.repository.GradeRepository;
import com.example.sis.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GradeService {
	private final GradeRepository gradeRepository;
	private final StudentRepository studentRepository;
	//c
	public void enterGrade(Student student, String lecture, int score) {
		if (student.getRequiredSubject() == lecture){

		} else {

		}
		student.getRequiredSubject()
		Grade grade = Grade.builder()
			.student(student)
			.lecture(lecture)
			.score(score)
			.build();
		gradeRepository.save(grade);
	}

	public char selectGrade()
	//r
	public List<Grade> getLectureGradeList(String lecture) {
		return gradeRepository.findByLecture(lecture);
	}
	//u
	//d
	public void deleteGrade() {
		List<Grade> gradeList = gradeRepository.findAll();
		gradeRepository.deleteAll(gradeList);
	}
}

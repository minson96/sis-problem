package com.example.sis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sis.service.StudentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
	private final StudentService studentService;

	@GetMapping("/add")
	public String addStudent() {return "/student/add";}
	@PostMapping("/add")
	public String addStudent(String name, int studentId, String major, String requiredSubject) {
		studentService.addStudent(name, studentId, major, requiredSubject);
		return "/student/add";
	}
}

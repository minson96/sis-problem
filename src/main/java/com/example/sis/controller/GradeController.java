package com.example.sis.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sis.dto.ScoreResponse;
import com.example.sis.entity.Student;
import com.example.sis.service.GradeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/grade")
@RequiredArgsConstructor
public class GradeController {
	private final GradeService gradeService;

	@GetMapping("/add")
	public String addGrade() {return "grade/add";}
	@PostMapping("/add")
	public String addGrade(Student student, String lecture, int score) {
		gradeService.enterGrade(student, lecture, score);
		return "grade/add";
	}

	@GetMapping("/list")
	public List<ScoreResponse> showScoreList(Model model) {
		ScoreResponse scoreList = ScoreResponse
		model.addAttribute("scoreList", );
	}
}

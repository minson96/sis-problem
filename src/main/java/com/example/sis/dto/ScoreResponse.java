package com.example.sis.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class ScoreResponse {
	private String name;
	private int studentId;
	private String requiredSubject;
	private int score;
	private char grade;

	@Builder
	public ScoreResponse(String name, int studentId, String requiredSubject, int score, char grade) {
		this.name = name;
		this.studentId = studentId;
		this.requiredSubject = requiredSubject;
		this.score = score;
		this.grade = grade;
	}
}

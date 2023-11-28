package com.example.sis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "student")
@Getter
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private int studentId;
	private String major;
	private String requiredSubject;

	@Builder
	protected Student(String name, int studentId, String major, String requiredSubject) {
		this.name = name;
		this.studentId = studentId;
		this.major = major;
		this.requiredSubject = requiredSubject;
	}
}

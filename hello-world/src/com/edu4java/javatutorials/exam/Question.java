package com.edu4java.javatutorials.exam;

public class Question {
	String text;
	String[] options;
	int selectedOption;
	int correctOption;

	public Question(String text, String[] options, int correctOption) {
		this.text = text;
		this.options = options;
		this.correctOption = correctOption;
	}

}

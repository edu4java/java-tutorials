package com.edu4java.javatutorials.exam3;

import java.util.List;

import javax.swing.JOptionPane;

public class Exam {
	List<Question> questions;
	

	public Exam(List<Question> question) {
		super();
		this.questions = question;
	}

	/**
	 * hacer examen al usuario
	 */
	public void take() {
		for (Question question : questions) {
			question.make();
		}

	}

	public void correct() {
		
		int answersOk=0;
		for (Question question : questions) {
			if (question.isCorrect()) {
				answersOk = answersOk+1;
			}
			
		}
		String message = "You have answered correctly to: "
				+ answersOk + " questions!";
		JOptionPane.showMessageDialog(null, message);

	}

}

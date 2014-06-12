package com.edu4java.javatutorials.exam2;

import java.util.List;

import javax.swing.JOptionPane;

public class Exam {
	List<QuestionMultipleChoice> questions;
	

	public Exam(List<QuestionMultipleChoice> question) {
		super();
		this.questions = question;
	}

	/**
	 * hacer examen al usuario
	 */
	public void take() {
		for (QuestionMultipleChoice question : questions) {
			question.make();
		}

	}

	public void correct() {
		
		int answersOk=0;
		for (QuestionMultipleChoice question : questions) {
			if (question.isCorrect()) {
				answersOk = answersOk+1;
			}
			
		}
		String message = "You have answered correctly to: "
				+ answersOk + " questions!";
		JOptionPane.showMessageDialog(null, message);

	}

}

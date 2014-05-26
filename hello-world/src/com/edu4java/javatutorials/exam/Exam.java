package com.edu4java.javatutorials.exam;

import java.util.List;

import javax.swing.JOptionPane;

public class Exam {
	List<Question> questions;
	

	public Exam(List<Question> question) {
		super();
		this.questions = question;
	}

	public void take() {
		for (Question question : questions) {
			String message = question.text + "\n";
			for (int i = 0; i < question.options.length; i++) {
				message = message + (i + 1) + " " + question.options[i] + "\n";
			}

			question.selectedOption = Integer.parseInt(JOptionPane
					.showInputDialog(message));
		}

	}

	public void correct() {
		int answersOk=0;
		for (Question question : questions) {

			if (question.selectedOption == question.correctOption) {
				answersOk = answersOk+1;
			}
			
		}
		String message = "You have answered correctly to: "
				+ answersOk + " questions!";
		JOptionPane.showMessageDialog(null, message);

	}

}

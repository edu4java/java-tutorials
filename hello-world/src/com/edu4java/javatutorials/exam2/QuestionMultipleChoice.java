package com.edu4java.javatutorials.exam2;

import javax.swing.JOptionPane;

public class QuestionMultipleChoice {
	String text;
	String[] options;
	int selectedOption;
	int correctOption;

	public QuestionMultipleChoice(String text, String[] options,
			int correctOption) {
		this.text = text;
		this.options = options;
		this.correctOption = correctOption;
	}

	/**
	 * tomar la pregunta al usuario
	 */
	public void make() {
		String message = text + "\n";
		for (int i = 0; i < options.length; i++) {
			message = message + (i + 1) + " " + options[i] + "\n";
		}

		selectedOption = Integer.parseInt(JOptionPane.showInputDialog(message));

	}

	/**
	 * corrige la respuesta
	 */
	public boolean isCorrect() {
		
		return selectedOption == correctOption;
		
	}

}

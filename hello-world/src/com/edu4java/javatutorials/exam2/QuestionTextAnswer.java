package com.edu4java.javatutorials.exam2;

import javax.swing.JOptionPane;

public class QuestionTextAnswer extends QuestionMultipleChoice {
	String text;
	String answer;

	public QuestionTextAnswer(String text) {
		super(text, null, 0);
		this.text = text;
	}

	@Override
	public void make() {
		String message = text;
		answer = JOptionPane.showInputDialog(message);
	}
	@Override
	public boolean isCorrect() {
		String message = "Question: "+text+ ":\n "+ "Answer: "+answer+":\n "+"Is this answer correct? (yes/no)";
		String correction=JOptionPane.showInputDialog(message);
		
		return correction.equals("yes");
	}

}

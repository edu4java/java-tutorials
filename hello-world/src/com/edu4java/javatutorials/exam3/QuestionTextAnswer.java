package com.edu4java.javatutorials.exam3;

import javax.swing.JOptionPane;

public class QuestionTextAnswer extends Question{
	
	String answer;

	public QuestionTextAnswer(String text) {
		this.text = text;
	}

	
	public void make() {
		String message = text;
		answer = JOptionPane.showInputDialog(message);
	}

	public boolean isCorrect() {
		String message = "Question: "+text+ ":\n "+ "Answer: "+answer+":\n "+"Is this answer correct? (yes/no)";
		String correction=JOptionPane.showInputDialog(message);
		
		return correction.equals("yes");
	}

}

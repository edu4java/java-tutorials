package com.edu4java.javatutorials.exam2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<QuestionMultipleChoice> questions = new ArrayList<QuestionMultipleChoice>();

		String text1 = "Which one of the following will declare an array and initialize it with four numbers?";
		String[] options1 = { 
				"Array a = new Array(4);",
				"int [] a = {23,22,21,20};", 
				"int a [] = new int[4];",
				"int [4] array;" };
		QuestionMultipleChoice question1 = new QuestionMultipleChoice(text1, options1, 2);
		questions.add(question1);

		String text2 = "Choose best option that describes Constructor:";
		String[] options2 = { 
				"Have no return type",
				"Use name of the class and have no return type",
				"Use name of the class", 
				"None of the above" };
		QuestionMultipleChoice question2 = new QuestionMultipleChoice(text2, options2, 2);
		questions.add(question2);

		String text3 = "What is the correct signature of the main method?";
		String[] options3 = { 
				"public static void main(String[] args)",
				"static public void main(String[] args)",
				"public void main(String[] args)", 
				"1 and 2 Both" };
		QuestionMultipleChoice question3 = new QuestionMultipleChoice(text3, options3, 4);
		questions.add(question3);
		
		String text4="texto pregunta 4";
		QuestionTextAnswer question4= new QuestionTextAnswer(text4);
		questions.add(question4);

		Exam exam = new Exam(questions);
		exam.take();
		exam.correct();
		
	
	}
}

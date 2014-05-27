package com.edu4java.javatutorials.exam;

import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.parser.JSONParser;

public class Main {

	public static void main(String[] args) {
		List<Question> questions = new ArrayList<Question>();

		String text1 = "Which one of the following will declare an array and initialize it with four numbers?";
		String[] options1 = { 
				"Array a = new Array(4);",
				"int [] a = {23,22,21,20};", 
				"int a [] = new int[4];",
				"int [4] array;" };
		Question question1 = new Question(text1, options1, 2);
		questions.add(question1);

		String text2 = "Choose best option that describes Constructor:";
		String[] options2 = { 
				"Have no return type",
				"Use name of the class and have no return type",
				"Use name of the class", 
				"None of the above" };
		Question question2 = new Question(text2, options2, 2);
		questions.add(question2);

		String text3 = "What is the correct signature of the main method?";
		String[] options3 = { 
				"public static void main(String[] args)",
				"static public void main(String[] args)",
				"public void main(String[] args)", 
				"1 and 2 Both" };
		Question question3 = new Question(text3, options3, 4);
		questions.add(question3);

		Exam exam = new Exam(questions);
		exam.take();
		exam.correct();
		
	
	}
}

package com.edu4java.javatutorials;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleInput {
	public static void main(String[] args) {
		InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
		System.out.println("Name:");
		String input = scanner.next();
		System.out.println("Hello " + input);
		scanner.close();
	}
}

package com.edu4java.javatutorials;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random r = new Random(1);
		int i = 0;
		while (i < 20) {
			i++; // i = i + 1;
			System.out.print(r.nextInt(100) + ","); 
		}
	}
}
//85,88,47,13,54,4,34,6,78,48,69,73,17,63,62,34,92,62,96,89,
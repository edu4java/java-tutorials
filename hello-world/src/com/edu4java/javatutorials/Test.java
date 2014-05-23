package com.edu4java.javatutorials;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		int[] numbers = { 34, 65, 23, 97, 23, 78, 33 };
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		//aa
		for (int item : numbers) {
			System.out.print(item + " ");
			Thread.sleep(10000);
		}
		
	}
}

package com.edu4java.javatutorials;

import java.util.Random;

public class ForArray2 {
	public static void main(String[] args) {

		int[] numbers = generateNumbers();
		print4console("N�meros sorteados: ", numbers);
		numbers = sort(numbers);
		print4console("N�meros ordenados: ", numbers);
	}

	/**
	 * Ordena un array de n�meros de menor a mayor
	 * 
	 * @param numbers Los n�meros a ordenar
	 * @return Los n�meros ordenados
	 */
	private static int[] sort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int auxiliar = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = auxiliar;
				}
			}
		}
		return numbers;
	}

	/**
	 * Genera aleatoriamente diez n�meros
	 * 
	 * @return Un array de diez enteros
	 */
	private static int[] generateNumbers() {
		Random random = new Random();
		int[] numbers = new int[10];
		// sortea 10 n�meros del 0 al 99
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		return numbers;
	}

	/**
	 * Imprime por la consola el texto message seguido de los n�meros del array
	 * numbers separados por espacios
	 * 
	 * @param message El mensaje a ser mostrado
	 * @param numbers Los n�meros a ser impresos
	 */
	private static void print4console(String message, int[] numbers) {
		System.out.print(message);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}

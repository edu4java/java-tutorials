package com.edu4java.javatutorials;

import java.util.Random;

/**
 * @author edu4java
 * 
 *         Ejemplo de uso de sentencia for para la manipulación de arrays
 */
public class ForArray {
	public static void main(String[] args) {

		int[] numbers = generateNumbers();
		// imprime los números sorteados
		print4console("Números sorteados: ", numbers);
		// imprime el promedio
		System.out.println("promedio:" + average(numbers));
		// imprime el máximo
		System.out.println("Máximo:" + max(numbers));
		// imprime el mínimo
		System.out.println("Mínimo=" + min(numbers));
	}

	/**
	 * Genera aleatoriamente diez números
	 * 
	 * @return Los números generados
	 */
	private static int[] generateNumbers() {
		Random random = new Random();
		int[] numbers = new int[10];
		// sortea 10 números del 0 al 99
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		return numbers;
	}

	/**
	 * Imprime por la consola el texto message seguido de los números del array
	 * numbers separados por espacios
	 * 
	 * @param message El mensaje a ser mostrado
	 * @param numbers Los números a ser impresos 
	 */
	private static void print4console(String message, int[] numbers) {
		System.out.print(message);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	/**
	 * retorna el máximo de los números
	 * 
	 * @param numbers Los números donde buscar el máximo
	 * @return El número máximo
	 */
	private static int max(int[] numbers) {
		int max = 0;
		for (int number : numbers) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}

	/**
	 * retorna el mínimo de los números
	 * 
	 * @param numbers Los números dónde buscar el mínimo
	 * @return El número mínimo
	 */
	private static int min(int[] numbers) {
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (min > number) {
				min = number;
			}
		}
		return min;
	}

	/**
	 * calcula el promedio de los números
	 * 
	 * @param numbers Los números a promediar
	 * @return El promedio
	 */
	private static int average(int[] numbers) {
		int acumulador = 0;
		for (int number : numbers) {
			acumulador = acumulador + number;
		}
		int promedio = acumulador / 10;
		return promedio;
	}
}
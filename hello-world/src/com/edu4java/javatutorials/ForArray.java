package com.edu4java.javatutorials;

import java.util.Random;

/**
 * @author edu4java
 * 
 *         Ejemplo de uso de sentencia for para la manipulaci�n de arrays
 */
public class ForArray {
	public static void main(String[] args) {

		int[] numbers = generateNumbers();
		// imprime los n�meros sorteados
		print4console("N�meros sorteados: ", numbers);
		// imprime el promedio
		System.out.println("promedio:" + average(numbers));
		// imprime el m�ximo
		System.out.println("M�ximo:" + max(numbers));
		// imprime el m�nimo
		System.out.println("M�nimo=" + min(numbers));
	}

	/**
	 * Genera aleatoriamente diez n�meros
	 * 
	 * @return Los n�meros generados
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

	/**
	 * retorna el m�ximo de los n�meros
	 * 
	 * @param numbers Los n�meros donde buscar el m�ximo
	 * @return El n�mero m�ximo
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
	 * retorna el m�nimo de los n�meros
	 * 
	 * @param numbers Los n�meros d�nde buscar el m�nimo
	 * @return El n�mero m�nimo
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
	 * calcula el promedio de los n�meros
	 * 
	 * @param numbers Los n�meros a promediar
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
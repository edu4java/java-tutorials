package com.edu4java.javatutorials;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author edu4java
 * 
 *         El programa sortea un número entre 0 y 99 y pide al usuario repetidamente 
 *         que adivine el número. Cada vez que se equivoca le indica si el número es 
 *         mayor o menor. Cuando acierta le indica cuantos intentos fallidos realizó.
 */
public class GameGuess {
	public static void main(String[] args) {
		Random r = new Random();
		int adivinar = r.nextInt(100); // genera un número entre 0 y 99
		int i = 0; // crea variable contador que es usada para contar los intentos fallidos
		int apuesta = input("Adivina el número secreto entre 0 y 99. ¿Que número es?");
		while (adivinar != apuesta) { // si el número dado es distinto al sorteado repite
			i++; // incrementa variable contador
			if (adivinar > apuesta) {
				apuesta = input("El número a adivinar es más grande. \n Intentelo otra vez");
			} else {
				apuesta = input("El número a adivinar es más chico. \n Intentelo otra vez");
			}
		}
		JOptionPane.showMessageDialog(null,
				"Felicitaciones a dado con el número con " + i + " intentos fallidos");
	}

	/**
	 * Muestra una ventana con el mensaje text y solicita una respuesta
	 * 
	 * @param text
	 * @return devuelve un número int
	 */
	private static int input(String text) {
		return Integer.parseInt(JOptionPane.showInputDialog(text));
	}
}
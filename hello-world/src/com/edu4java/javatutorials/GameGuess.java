package com.edu4java.javatutorials;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author edu4java
 * 
 *         El programa sortea un n�mero entre 0 y 99 y pide al usuario repetidamente 
 *         que adivine el n�mero. Cada vez que se equivoca le indica si el n�mero es 
 *         mayor o menor. Cuando acierta le indica cuantos intentos fallidos realiz�.
 */
public class GameGuess {
	public static void main(String[] args) {
		Random r = new Random();
		int adivinar = r.nextInt(100); // genera un n�mero entre 0 y 99
		int i = 0; // crea variable contador que es usada para contar los intentos fallidos
		int apuesta = input("Adivina el n�mero secreto entre 0 y 99. �Que n�mero es?");
		while (adivinar != apuesta) { // si el n�mero dado es distinto al sorteado repite
			i++; // incrementa variable contador
			if (adivinar > apuesta) {
				apuesta = input("El n�mero a adivinar es m�s grande. \n Intentelo otra vez");
			} else {
				apuesta = input("El n�mero a adivinar es m�s chico. \n Intentelo otra vez");
			}
		}
		JOptionPane.showMessageDialog(null,
				"Felicitaciones a dado con el n�mero con " + i + " intentos fallidos");
	}

	/**
	 * Muestra una ventana con el mensaje text y solicita una respuesta
	 * 
	 * @param text
	 * @return devuelve un n�mero int
	 */
	private static int input(String text) {
		return Integer.parseInt(JOptionPane.showInputDialog(text));
	}
}
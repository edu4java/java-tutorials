package com.edu4java.javatutorials;

import javax.swing.JOptionPane;

public class WhileCounterAcumulator {
	public static void main(String[] args) {
		int counter = 0;
		int acumulator = 0;
		while (counter < 5) {
			counter = counter + 1;
			acumulator = acumulator	+ Integer.parseInt(JOptionPane
				.showInputDialog("Ingresar el " + counter + "º número"));
		}
		JOptionPane.showMessageDialog(null, "La suma de los 5 números es "
				+ acumulator);
	}
}

package com.edu4java.javatutorials;

import javax.swing.JOptionPane;

public class IfSentence {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Ingrese su edad");
		int edad = Integer.parseInt(input);
		if (edad >= 18) {
			JOptionPane.showMessageDialog(null, "Usted es mayor de edad");
		}else {
			JOptionPane.showMessageDialog(null, "Usted es menor de edad");
		}
	}
}

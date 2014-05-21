package com.edu4java.javatutorials;

import javax.swing.JOptionPane;

public class Triangle {

	public static void main(String[] args) {
		int lado1 = Integer.parseInt(JOptionPane
				.showInputDialog("Ingrese el primer lado"));
		int lado2 = Integer.parseInt(JOptionPane
				.showInputDialog("Ingrese el segundo lado"));
		int lado3 = Integer.parseInt(JOptionPane
				.showInputDialog("Ingrese el tercer lado"));
		if (lado1 == lado2 & lado2 == lado3) {
			JOptionPane.showMessageDialog(null, "El triángulo es equilátero");
		} else {
			if (lado1 == lado2 | lado2 == lado3 | lado1 == lado3) {
				JOptionPane.showMessageDialog(null, "El triángulo es isósceles");
			} else {
				JOptionPane.showMessageDialog(null, "El triángulo es escaleno");
			}
		}
	}
	
}

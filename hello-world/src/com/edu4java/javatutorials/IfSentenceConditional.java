package com.edu4java.javatutorials;

import java.util.Date;

import javax.swing.JOptionPane;

public class IfSentenceConditional {
	public static void main(String[] args) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

		String respuesta = 
			(edad >= 18) ? "Usted es mayor de edad"	: "Usted es menor de edad";
		
		JOptionPane.showMessageDialog(null, respuesta);
		
		int i = (5>4) ? 10 : 0; // i valdrá 10
		char c = (false) ? 'a' : 'b'; // c valdrá 'b'
		

	}
}

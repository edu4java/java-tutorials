package com.edu4java.javatutorials;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList words = new ArrayList();
		String word = "";
		while (word != null) {
			word = JOptionPane.showInputDialog("Ingresar palabra a la lista. Cancelar para terminar.");
			if (word!=null) {
				words.add(word);
			}
		}
		words.sort(null);
		for (Object nombre : words) {
			System.out.println(nombre + " ");
		}
	}

}

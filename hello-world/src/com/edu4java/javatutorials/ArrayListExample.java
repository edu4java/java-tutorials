package com.edu4java.javatutorials;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		String palaras = "";
		while (palaras != null) {
			palaras = JOptionPane.showInputDialog("Ingresar palabra a la lista. Cancelar para terminar.");
			if (palaras!=null) {
				nombres.add(palaras);
			}
		}
		nombres.sort(null);
		for (String nombre : nombres) {
			System.out.println(nombre + " ");
		}
	}

}

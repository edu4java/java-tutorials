package com.edu4java.javatutorials;
import javax.swing.JOptionPane;

public class SwitchExample2 {
	public static void main(String[] args) {
		
		String menu = new String("Elija una opci�n: 1, 2, 3 o 4 \n");
		for (int i = 1; i <= 4; i++) {
			menu = menu + " opci�n " + i + "\n";
		}
		String option = JOptionPane.showInputDialog(menu.toString());
		switch (option) {
		case "1":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opci�n 1");
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opci�n 2");
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opci�n 3");
			break;
		case "4":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opci�n 4");
			break;
		default:
			JOptionPane.showMessageDialog(null, option + " no es una opci�n v�lida");
			break;
		}
	}
}


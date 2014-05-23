package com.edu4java.javatutorials;
import javax.swing.JOptionPane;

public class SwitchExample {
	public static void main(String[] args) {

		StringBuilder menu = new StringBuilder("Elija una opción: 1, 2, 3 o 4 \n");
		for (int i = 1; i <= 4; i++) {
			menu.append(i).append(" opción ").append(i).append("\n");
		}

		String option = JOptionPane.showInputDialog(menu.toString());
		switch (option+"") {
		case "1":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elejido la opcion 1");
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elejido la opcion 2");
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elejido la opcion 3");
			break;
		case "4":
			JOptionPane.showMessageDialog(null, "Felicitaciones, ha elejido la opcion 4");
			break;
		default:
			JOptionPane.showMessageDialog(null, option + " no es una opcion valida");
			break;

		}
	}

}

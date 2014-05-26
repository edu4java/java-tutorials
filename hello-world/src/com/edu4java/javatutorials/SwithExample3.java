package com.edu4java.javatutorials;

import javax.swing.JOptionPane;

public class SwithExample3 {
	public static void main(String[] args) {
		String menu = new String("Choose one option: 1, 2, 3 o 4 \n");
		for (int i = 1; i <= 4; i++) {
			menu = menu + " option " + i + "\n";
		}
		String option = JOptionPane.showInputDialog(menu.toString());
		switch (option) {
		case "1":
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 1");
			break;
		case "2":
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 2");
			break;
		case "3":
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 3");
			break;
		case "4":
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 4");
			break;
		default:
			JOptionPane.showMessageDialog(null, option
					+ " is not a valid option");
			break;
		}
	}

}

package com.edu4java.javatutorials;
import javax.swing.JOptionPane;

public class SwitchExample {
	public static void main(String[] args) {
		String daysLeft = "";
		String weekDay = JOptionPane.showInputDialog("Ingresar el día de la semana (en ingles)");

		switch (weekDay.toUpperCase()) {
		case "SUNDAY":
			daysLeft = daysLeft + "Sunday ";
		case "MONDAY":
			daysLeft = daysLeft + "Monday ";
		case "TUESDAY":
			daysLeft = daysLeft + "Tuesday ";
		case "WEDNESDAY":
			daysLeft = daysLeft + "Wednesday ";
		case "THURSDAY":
			daysLeft = daysLeft + "Thursday ";
		case "FRIDAY":
			daysLeft = daysLeft + "Friday ";
		case "SATERDAY":
			daysLeft = daysLeft + "Saturday ";
		}
		JOptionPane.showMessageDialog(null, "Quedan \"" + daysLeft + "\" para terminar la semana");
	}
}

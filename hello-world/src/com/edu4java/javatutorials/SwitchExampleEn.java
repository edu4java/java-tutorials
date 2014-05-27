package com.edu4java.javatutorials;
import javax.swing.JOptionPane;

public class SwitchExampleEn {
	public static void main(String[] args) {
		String daysLeft = "";
		String weekDay = JOptionPane.showInputDialog("Enter the day of the week");

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
		case "SATURDAY":
			daysLeft = daysLeft + "Saturday ";
		}
		JOptionPane.showMessageDialog(null, "We have \"" + daysLeft + "\" to end the week");
	}
}

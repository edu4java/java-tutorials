package com.edu4java.javatutorials;

import javax.swing.JOptionPane;

public class ShowInputDialogExample {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Type your name please");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}
}

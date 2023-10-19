package joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane2 {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre", "Datos personales",
				JOptionPane.QUESTION_MESSAGE);
		if (nombre != null) {
			System.out.println("No puedes ser más pesado " + nombre);
		} else {
			System.out.println("Cancelado en twitter");
		}
	}
}
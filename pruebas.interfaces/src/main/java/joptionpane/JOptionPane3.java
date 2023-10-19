package joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane3 {
	public static void main(String[] args) {
		int codigo = JOptionPane.showConfirmDialog(null, "¿Quieres un euro para una buena causa?", "Donacion",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if (codigo == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Que buena persona eres jodio", "Respuesta",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (codigo == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Ahí te parta un rayo por malage", "Respuesta",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "¿Tu eres tonto o te lo haces?", "Respuesta",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

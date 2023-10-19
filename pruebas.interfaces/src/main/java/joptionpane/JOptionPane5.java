package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane5 {
	public static void main(String[] args) {
		UIManager.put("OptionPane.yesButtonText", "Si");
		UIManager.put("OptionPane.noButtonText", "No");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar en twitter");
		UIManager.put("OptionPane.okButtonText", "Ajam");

		JOptionPane.showMessageDialog(null, "Bienvenido a una perdida de tiempo más", "Bienvenida",
				JOptionPane.INFORMATION_MESSAGE);
		
		int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres Entrar?", "Confirmar",
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(opcion==JOptionPane.YES_OPTION) {
			String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre", "Datos personales",
					JOptionPane.QUESTION_MESSAGE);
			if(nombre!=null) {
				JOptionPane.showMessageDialog(null, "Esperate a q me de la gana de guardarlo "+nombre);
			} else {
				JOptionPane.showMessageDialog(null, "Cuando naciste de caiste de la cuna por lo que veo");
			}
		} else if(opcion==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "mejor pa mi");
		} else {
			JOptionPane.showMessageDialog(null, "Cuando naciste de caiste de la cuna por lo que veo");
		}
	}

}
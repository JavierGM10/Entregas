package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane4 {
	public static void main(String[] args) {
		UIManager.put("OptionPane.yesButtonText", "Si");
		UIManager.put("OptionPane.noButtonText", "No");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar en twitter");

		int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Confirmar",
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(opcion==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Pues te jodes");
		} else if(opcion==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "mejor pa mi");
		} else {
			JOptionPane.showMessageDialog(null, "Cuando naciste de caiste de la cuna por lo que veo");
		}
	}

}

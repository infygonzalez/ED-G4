package Vista;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Modelo.Agencias;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoEvento extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public NuevoEvento(Agencias agencia, JFrame frame) {
		setLayout(null);
		
		JButton btnNewButton = new JButton("cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new ViajesYEventos(agencia, frame));
                frame.revalidate();
                frame.repaint();
			}
		});
		btnNewButton.setBounds(243, 199, 89, 23);
		add(btnNewButton);

	}

}

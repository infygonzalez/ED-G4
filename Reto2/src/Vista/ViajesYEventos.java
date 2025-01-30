package Vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Vista.*;

public class ViajesYEventos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;
	private JFrame frame;

	/**
	 * Create the panel.
	 */
	public ViajesYEventos(JFrame frame) {
		
		this.frame=frame;
		
		setLayout(null);
		
		table = new JTable();
		table.setBounds(484, 145, 450, 110);
		add(table);
		
		table_1 = new JTable();
		table_1.setBounds(484, 346, 450, 110);
		add(table_1);
		
		JButton btnNuevoViaje = new JButton("Nuevo viaje");
		btnNuevoViaje.setBounds(994, 141, 104, 23);
		add(btnNuevoViaje);
		
		JButton btnNuevoEvento = new JButton("Nuevo evento");
		btnNuevoEvento.setBounds(994, 342, 104, 23);
		add(btnNuevoEvento);
		
		JButton btnGenerarOferta = new JButton("Generar oferta cliente");
		btnGenerarOferta.setBounds(636, 467, 139, 23);
		add(btnGenerarOferta);
		
		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDesconectar.setBounds(981, 491, 104, 23);
		add(btnDesconectar);
		
		JButton btnEliminar1 = new JButton("");
		btnEliminar1.setBounds(941, 141, 30, 23);
		add(btnEliminar1);
		
		JButton btnEliminar2 = new JButton("");
		btnEliminar2.setBounds(944, 342, 30, 23);
		add(btnEliminar2);

	}
}

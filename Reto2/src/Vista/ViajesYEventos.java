package Vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Vista.*;

public class ViajesYEventos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public ViajesYEventos() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(34, 52, 450, 110);
		add(table);
		
		table_1 = new JTable();
		table_1.setBounds(34, 253, 450, 110);
		add(table_1);
		
		JButton btnNuevoViaje = new JButton("Nuevo viaje");
		btnNuevoViaje.setBounds(544, 48, 104, 23);
		add(btnNuevoViaje);
		
		JButton btnNuevoEvento = new JButton("Nuevo evento");
		btnNuevoEvento.setBounds(544, 249, 104, 23);
		add(btnNuevoEvento);
		
		JButton btnGenerarOferta = new JButton("Generar oferta cliente");
		btnGenerarOferta.setBounds(186, 374, 139, 23);
		add(btnGenerarOferta);
		
		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDesconectar.setBounds(531, 398, 104, 23);
		add(btnDesconectar);
		
		JButton btnEliminar1 = new JButton("");
		btnEliminar1.setBounds(491, 48, 30, 23);
		add(btnEliminar1);
		
		JButton btnEliminar2 = new JButton("");
		btnEliminar2.setBounds(494, 249, 30, 23);
		add(btnEliminar2);

	}
}

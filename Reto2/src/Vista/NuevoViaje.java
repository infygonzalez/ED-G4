package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Modelo.Agencias;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoViaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public NuevoViaje(Agencias agencia) {
		setLayout(null);
		
		JLabel lblNombreViaje = new JLabel("Nombre viaje");
		lblNombreViaje.setBounds(44, 34, 98, 14);
		add(lblNombreViaje);
		
		JLabel lblTipoViaje = new JLabel("Tipo de viaje");
		lblTipoViaje.setBounds(44, 75, 86, 14);
		add(lblTipoViaje);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(44, 120, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblDias = new JLabel("Dias");
		lblDias.setBounds(44, 188, 46, 14);
		add(lblDias);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(44, 233, 46, 14);
		add(lblPais);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(44, 272, 98, 14);
		add(lblDescripcion);
		
		JLabel lblServNoIncluidos = new JLabel("Servicios no incluidos");
		lblServNoIncluidos.setBounds(44, 336, 115, 14);
		add(lblServNoIncluidos);
		
		textField = new JTextField();
		textField.setBounds(169, 31, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(169, 71, 86, 18);
		add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 185, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(169, 231, 86, 18);
		add(comboBox_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(169, 269, 259, 53);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(169, 336, 259, 53);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(82, 416, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(NuevoViaje.this);
                frame.setContentPane(new ViajesYEventos(agencia));
                frame.revalidate();
                frame.repaint();
			}
		});
		btnCancelar.setBounds(273, 416, 89, 23);
		add(btnCancelar);

	}

}

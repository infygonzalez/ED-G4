package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Alojamiento extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Alojamiento() {
		setLayout(null);
		
		JLabel lblNombreEvento = new JLabel("Nombre evento");
		lblNombreEvento.setBounds(35, 32, 95, 14);
		add(lblNombreEvento);
		
		JLabel lblTipoEvento = new JLabel("Tipo de evento");
		lblTipoEvento.setBounds(35, 77, 95, 14);
		add(lblTipoEvento);
		
		JLabel lblTipoHabitacion = new JLabel("Tipo de habitacion");
		lblTipoHabitacion.setBounds(35, 128, 95, 14);
		add(lblTipoHabitacion);
		
		JLabel lblNewLabel_3 = new JLabel("Ciudad");
		lblNewLabel_3.setBounds(35, 174, 95, 14);
		add(lblNewLabel_3);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(35, 218, 95, 14);
		add(lblPrecio);
		
		JLabel lblFechaEntrada = new JLabel("Fecha entrada");
		lblFechaEntrada.setBounds(35, 262, 95, 14);
		add(lblFechaEntrada);
		
		textField = new JTextField();
		textField.setBounds(162, 29, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 171, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 215, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(162, 124, 105, 18);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(162, 73, 105, 20);
		add(comboBox_1);
		
		JLabel lblFechaSalida = new JLabel("Fehcha salida");
		lblFechaSalida.setBounds(351, 262, 95, 14);
		add(lblFechaSalida);
		
		JButton btnBuscarAlojamiento = new JButton("Buscar alojamiento");
		btnBuscarAlojamiento.setBounds(366, 190, 156, 23);
		add(btnBuscarAlojamiento);

	}

}

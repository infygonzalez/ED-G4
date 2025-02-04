package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Actividad extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Actividad() {
		setLayout(null);
		
		JLabel lblNombreEvento = new JLabel("Nombre evento");
		lblNombreEvento.setBounds(26, 24, 101, 14);
		add(lblNombreEvento);
		
		JLabel lblTipoEvento = new JLabel("Tipo de evento");
		lblTipoEvento.setBounds(26, 65, 101, 14);
		add(lblTipoEvento);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(26, 146, 89, 14);
		add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(26, 186, 46, 14);
		add(lblPrecio);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(26, 227, 46, 14);
		add(lblFecha);
		
		textField = new JTextField();
		textField.setBounds(137, 21, 131, 20);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(137, 61, 131, 18);
		add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 90, 252, 70);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 183, 89, 20);
		add(textField_2);
		textField_2.setColumns(10);

	}

}

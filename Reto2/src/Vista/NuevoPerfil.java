package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class NuevoPerfil extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public NuevoPerfil() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre agencia");
		lblNombre.setBounds(45, 33, 104, 14);
		add(lblNombre);
		
		JLabel lblColor = new JLabel("Color marca");
		lblColor.setBounds(45, 72, 104, 14);
		add(lblColor);
		
		JLabel lblNumeroEmpleados = new JLabel("Numero de empleados");
		lblNumeroEmpleados.setBounds(45, 110, 117, 14);
		add(lblNumeroEmpleados);
		
		JLabel lblTipoAgencia = new JLabel("Tipo de agencia");
		lblTipoAgencia.setBounds(45, 148, 104, 14);
		add(lblTipoAgencia);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setBounds(45, 192, 46, 14);
		add(lblLogo);
		
		textField = new JTextField();
		textField.setBounds(172, 30, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 69, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(172, 106, 86, 22);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(172, 144, 86, 22);
		add(comboBox_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 189, 200, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(71, 239, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(253, 239, 89, 23);
		add(btnCancelar);

	}
}

package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JButton;

public class Vuelo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public Vuelo() {
		setLayout(null);
		
		JLabel lblNombre_evento = new JLabel("Nombre de evento:");
		lblNombre_evento.setBounds(10, 29, 119, 14);
		add(lblNombre_evento);
		
		JLabel lblTipo_evento = new JLabel("Tipo de evento:");
		lblTipo_evento.setBounds(10, 65, 100, 14);
		add(lblTipo_evento);
		
		JLabel lblTrayecto = new JLabel("Trayecto:");
		lblTrayecto.setBounds(10, 102, 100, 14);
		add(lblTrayecto);
		
		JLabel lblAero_origen = new JLabel("Aeropuerto de origen:");
		lblAero_origen.setBounds(10, 144, 119, 14);
		add(lblAero_origen);
		
		JLabel lblAero_destino = new JLabel("Aeropuerto de destino:");
		lblAero_destino.setBounds(10, 194, 119, 14);
		add(lblAero_destino);
		
		JLabel lblFch_ida = new JLabel("Fecha de ida:");
		lblFch_ida.setBounds(10, 242, 119, 14);
		add(lblFch_ida);
		
		JLabel lblAero_destino_1 = new JLabel("Codigo de vuelo:");
		lblAero_destino_1.setBounds(10, 281, 119, 14);
		add(lblAero_destino_1);
		
		JLabel lblAerolinea = new JLabel("Aerolinea:");
		lblAerolinea.setBounds(10, 317, 119, 14);
		add(lblAerolinea);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 353, 119, 14);
		add(lblPrecio);
		
		JLabel lblHora_salida = new JLabel("Horario de salida:");
		lblHora_salida.setBounds(10, 388, 119, 14);
		add(lblHora_salida);
		
		JLabel lblDuracion = new JLabel("Duración:");
		lblDuracion.setBounds(10, 416, 119, 14);
		add(lblDuracion);
		
		textField = new JTextField();
		textField.setBounds(143, 26, 131, 20);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(143, 61, 131, 22);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(143, 98, 131, 22);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(143, 140, 131, 22);
		add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(143, 190, 131, 22);
		add(comboBox_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 278, 131, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 314, 131, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 350, 131, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 382, 131, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 413, 131, 20);
		add(textField_5);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(53, 455, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(422, 455, 89, 23);
		add(btnCancelar);
		
		JPanel panel = new JPanel();
		panel.setBounds(291, 228, 299, 216);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblFechaVuelta = new JLabel("FechaVuelta");
		lblFechaVuelta.setBounds(10, 11, 80, 14);
		panel.add(lblFechaVuelta);
		
		JLabel lblCodigoVueloVuelta = new JLabel("Codigo de vuelo vuelta");
		lblCodigoVueloVuelta.setBounds(10, 49, 132, 14);
		panel.add(lblCodigoVueloVuelta);
		
		JLabel lblAerolineaVuelta = new JLabel("Aerolinea");
		lblAerolineaVuelta.setBounds(10, 89, 46, 14);
		panel.add(lblAerolineaVuelta);
		
		JLabel lblPrecioVuelta = new JLabel("Precio");
		lblPrecioVuelta.setBounds(10, 125, 46, 14);
		panel.add(lblPrecioVuelta);
		
		JLabel lblHorarioVuelta = new JLabel("Horario de vuelta");
		lblHorarioVuelta.setBounds(10, 155, 114, 14);
		panel.add(lblHorarioVuelta);
		
		JLabel lblDuracionVuelta = new JLabel("Duracion");
		lblDuracionVuelta.setBounds(10, 191, 46, 14);
		panel.add(lblDuracionVuelta);
		
		textField_6 = new JTextField();
		textField_6.setBounds(152, 46, 137, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(152, 86, 137, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(152, 122, 137, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(152, 152, 137, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(152, 188, 137, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);

	}
}

package Vista;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Modelo.Agencias;
import Modelo.Viaje;
import Modelo.Alojamiento;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Controlador.controlador;
import javax.swing.DefaultComboBoxModel;

public class NuevoEvento extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textNombre;
	private JTextField textCiudad;
	private JTextField textPrecio;
	private JTextField textNombreVuelo;
	private JTextField textCodigoVuelo;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_13;
	private JTextField textField_16;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JDateChooser dateChooser_1;
	private JComboBox comboBox_1;
	private JDateChooser dateChooser_4;
	private JTextField textNMBHotel;

	/**
	 * Create the panel.
	 */
	public NuevoEvento(Agencias agencia, Viaje viaje, JFrame frame) {
		setLayout(null);
		
		JButton btnNewButton = new JButton("cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new ViajesYEventos(agencia, viaje, frame));
                frame.revalidate();
                frame.repaint();
			}
		});
		
		
		
		
		JPanel panelAlojamiento = new JPanel();
		panelAlojamiento.setBackground(new Color(255, 128, 0));
		panelAlojamiento.setBounds(10, 166, 673, 460);
		add(panelAlojamiento);
		panelAlojamiento.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre evento");
		lblNewLabel_1.setBounds(10, 48, 91, 14);
		panelAlojamiento.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(111, 45, 132, 20);
		panelAlojamiento.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo evento");
		lblNewLabel_1_2.setBounds(10, 90, 91, 14);
		panelAlojamiento.add(lblNewLabel_1_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Doble", "Individual", "Triple"}));
		comboBox_1.setBounds(111, 86, 132, 22);
		panelAlojamiento.add(comboBox_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ciudad");
		lblNewLabel_1_3.setBounds(10, 139, 91, 14);
		panelAlojamiento.add(lblNewLabel_1_3);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(111, 136, 132, 20);
		panelAlojamiento.add(textCiudad);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(111, 182, 132, 20);
		panelAlojamiento.add(textPrecio);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Precio");
		lblNewLabel_1_3_1.setBounds(10, 185, 91, 14);
		panelAlojamiento.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Fecha entrada");
		lblNewLabel_1_3_1_1.setBounds(10, 238, 91, 14);
		panelAlojamiento.add(lblNewLabel_1_3_1_1);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(111, 238, 70, 20);
		panelAlojamiento.add(dateChooser_1);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Fecha salida");
		lblNewLabel_1_3_1_1_1.setBounds(349, 238, 91, 14);
		panelAlojamiento.add(lblNewLabel_1_3_1_1_1);
		
		dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(429, 238, 70, 20);
		panelAlojamiento.add(dateChooser_4);
		
		textNMBHotel = new JTextField();
		textNMBHotel.setBounds(433, 48, 122, 20);
		panelAlojamiento.add(textNMBHotel);
		textNMBHotel.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre Hotel");
		lblNewLabel_5.setBounds(323, 48, 100, 14);
		panelAlojamiento.add(lblNewLabel_5);
		panelAlojamiento.setVisible(false);
		
		btnNewButton.setBounds(958, 574, 89, 23);
		add(btnNewButton);
		
		JPanel panelVuelos = new JPanel();
		panelVuelos.setBackground(new Color(128, 255, 0));
		panelVuelos.setBounds(87, 149, 885, 450);
		add(panelVuelos);
		panelVuelos.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre evento");
		lblNewLabel_2.setBounds(10, 11, 81, 14);
		panelVuelos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tipo evento");
		lblNewLabel_2_1.setBounds(10, 51, 81, 14);
		panelVuelos.add(lblNewLabel_2_1);
		
		textNombreVuelo = new JTextField();
		textNombreVuelo.setBounds(111, 11, 130, 20);
		panelVuelos.add(textNombreVuelo);
		textNombreVuelo.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(111, 50, 130, 22);
		panelVuelos.add(comboBox_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Trayecto");
		lblNewLabel_2_1_1.setBounds(10, 87, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(111, 86, 130, 22);
		panelVuelos.add(comboBox_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Aeropuerto origen");
		lblNewLabel_2_1_1_1.setBounds(10, 123, 99, 14);
		panelVuelos.add(lblNewLabel_2_1_1_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setBounds(111, 119, 130, 22);
		panelVuelos.add(comboBox_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha ida");
		lblNewLabel_3.setBounds(10, 167, 55, 14);
		panelVuelos.add(lblNewLabel_3);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(111, 167, 70, 20);
		panelVuelos.add(dateChooser_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Codigo vuelo");
		lblNewLabel_2_1_1_2.setBounds(10, 202, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2);
		
		textCodigoVuelo = new JTextField();
		textCodigoVuelo.setColumns(10);
		textCodigoVuelo.setBounds(111, 202, 130, 20);
		panelVuelos.add(textCodigoVuelo);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(111, 233, 130, 20);
		panelVuelos.add(textField_8);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Aerolinea");
		lblNewLabel_2_1_1_2_1.setBounds(10, 233, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("Precio");
		lblNewLabel_2_1_1_2_1_1.setBounds(10, 264, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(111, 264, 130, 20);
		panelVuelos.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(111, 295, 130, 20);
		panelVuelos.add(textField_10);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("Horario de salida");
		lblNewLabel_2_1_1_2_1_1_1.setBounds(10, 295, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 0));
		panel_3.setBounds(435, 178, 391, 228);
		panelVuelos.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("FechaVuelta");
		lblNewLabel_4.setBounds(10, 11, 66, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Codigo de vuelo vuelta");
		lblNewLabel_4_1.setBounds(10, 46, 115, 14);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_1_1_2_1_2 = new JLabel("Aerolinea");
		lblNewLabel_2_1_1_2_1_2.setBounds(10, 74, 81, 14);
		panel_3.add(lblNewLabel_2_1_1_2_1_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(131, 74, 130, 20);
		panel_3.add(textField_12);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1 = new JLabel("Horario de vuelta");
		lblNewLabel_2_1_1_2_1_1_1_1.setBounds(10, 105, 115, 14);
		panel_3.add(lblNewLabel_2_1_1_2_1_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(131, 105, 130, 20);
		panel_3.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(131, 136, 130, 20);
		panel_3.add(textField_15);
		
		JLabel lblNewLabel_2_1_1_2_1_1_2_1 = new JLabel("Duracion");
		lblNewLabel_2_1_1_2_1_1_2_1.setBounds(10, 136, 81, 14);
		panel_3.add(lblNewLabel_2_1_1_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_3 = new JLabel("Precio total");
		lblNewLabel_2_1_1_2_1_1_3.setBounds(10, 167, 81, 14);
		panel_3.add(lblNewLabel_2_1_1_2_1_1_3);
		
		textField_13 = new JTextField();
		textField_13.setBounds(131, 167, 130, 20);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(131, 43, 130, 20);
		panel_3.add(textField_16);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(131, 11, 70, 20);
		panel_3.add(dateChooser_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(111, 331, 130, 20);
		panelVuelos.add(textField_11);
		
		JLabel lblNewLabel_2_1_1_2_1_1_2 = new JLabel("Duracion");
		lblNewLabel_2_1_1_2_1_1_2.setBounds(10, 331, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1_2);
		
		JPanel panelOtros = new JPanel();
		panelOtros.setBackground(new Color(255, 128, 192));
		panelOtros.setBounds(77, 208, 455, 331);
		add(panelOtros);
		panelOtros.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre evento");
		lblNewLabel.setBounds(10, 41, 85, 21);
		panelOtros.add(lblNewLabel);
		
		JLabel lblTipoEvent = new JLabel("Tipo evento");
		lblTipoEvent.setBounds(10, 96, 85, 21);
		panelOtros.add(lblTipoEvent);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descripción");
		lblNewLabel_1_1.setBounds(10, 149, 85, 21);
		panelOtros.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio");
		lblNewLabel_1_1_1.setBounds(10, 234, 85, 21);
		panelOtros.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1_1_1.setBounds(10, 283, 85, 21);
		panelOtros.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(105, 41, 130, 20);
		panelOtros.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(107, 95, 128, 22);
		panelOtros.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 149, 204, 65);
		panelOtros.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 234, 130, 20);
		panelOtros.add(textField_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(105, 283, 70, 20);
		panelOtros.add(dateChooser);
		
		ButtonGroup group = new ButtonGroup();

		rdbtnNewRadioButton = new JRadioButton("Alojamiento");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelVuelos.setVisible(false);
				panelOtros.setVisible(false);
				panelAlojamiento.setVisible(true);
			}
		});
		rdbtnNewRadioButton.setBounds(38, 56, 109, 23);
		add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("Vuelos");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelVuelos.setVisible(true);
				panelOtros.setVisible(false);
				panelAlojamiento.setVisible(false);
			}
		});
		rdbtnNewRadioButton_1.setBounds(255, 56, 109, 23);
		add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("Otros");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelVuelos.setVisible(false);
				panelOtros.setVisible(true);
				panelAlojamiento.setVisible(false);
			}
		});
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				java.util.Date fechaInicio = dateChooser_1.getDate();
				java.util.Date fechaFin = dateChooser_4.getDate();
				
				insertarAlojamiento(
						viaje,
						textCiudad.getText(),
						textNombre.getText(),
						String.valueOf(comboBox_1.getSelectedItem()),
						fechaInicio,
						fechaFin,
						textNMBHotel.getText(),
						textPrecio.getText()
						);
			}
		});
		btnGuardar.setBounds(1009, 56, 89, 23);
		add(btnGuardar);
		
		rdbtnNewRadioButton_2.setBounds(477, 56, 109, 23);
		add(rdbtnNewRadioButton_2);

		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		panelOtros.setVisible(false);
		panelVuelos.setVisible(false);

	}
	private String convertirFechaADatabaseFormat(java.util.Date date) {
	    if (date != null) {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        return sdf.format(date);
	    }
	    return null; 
	}
	
	private void insertarAlojamiento(Viaje viaje,String ciudad, String nombre, String tipo, java.util.Date fechaInicio, java.util.Date fechaFin, String NMBHotel, String precio) {
	    String fechaInicioFormatted = convertirFechaADatabaseFormat(fechaInicio);
	    String fechaFinFormatted = convertirFechaADatabaseFormat(fechaFin);
	    System.out.println(fechaInicioFormatted);
	    Alojamiento alojamiento = new Alojamiento();
	    alojamiento.setViajeId(Integer.parseInt(viaje.getViajesId()));
	    alojamiento.setCiudad(ciudad);
	    alojamiento.setNombre(nombre);
		alojamiento.setFecEntrada(fechaInicioFormatted);
	    alojamiento.setTipoHab(tipo);
	    alojamiento.setFecSalida(fechaFinFormatted);
	    alojamiento.setNMBHotel(NMBHotel);
	    alojamiento.setPrecio(precio);
	    controlador.insertarAlojamiento(alojamiento);
	}
}

package Vista;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Modelo.Aerolinea;
import Modelo.Aeropuerto;
import Modelo.Agencias;
import Modelo.Viaje;
import Modelo.Vuelo;
import Modelo.Alojamiento;
import Modelo.Gestor;
import Modelo.Otros;
import Modelo.Pais;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	private JTextField textNombreOtros;
	private JTextField textDescripcionOtros;
	private JTextField textPrecioOtros;
	private JTextField textNombre;
	private JTextField textCiudad;
	private JTextField textPrecio;
	private JTextField textNombreVuelo;
	private JTextField textCodigoVuelo;
	private JTextField textPrecioVuelo;
	private JTextField textHoraSal;
	private JTextField textDuracion;
	private JTextField textHoraVuelta;
	private JTextField textDuracionVuelta;
	private JTextField textPrecioTotal;
	private JTextField textCodigoVuelta;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JDateChooser dateChooser_1;
	private JComboBox comboBox_1;
	private JComboBox comboAerolinea_1;
	private JComboBox comboAeroDes_1;
	private JComboBox comboAero_1;
	private JComboBox comboVuelo;
	private JDateChooser dateChooser_4;
	private JTextField textNMBHotel;
	private JPanel panelAlojamiento;
	private JPanel panelVuelos;
	private JPanel panelOtros;

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
		
		btnNewButton.setBounds(942, 603, 89, 23);
		add(btnNewButton);
		
		panelVuelos = new JPanel();
		panelVuelos.setBackground(new Color(128, 255, 0));
		panelVuelos.setBounds(87, 149, 885, 450);
		add(panelVuelos);
		panelVuelos.setLayout(null);
		
		panelVueloVuelta = new JPanel();
		panelVueloVuelta.setBackground(new Color(0, 128, 0));
		panelVueloVuelta.setBounds(435, 178, 391, 228);
		panelVuelos.add(panelVueloVuelta);
		panelVueloVuelta.setLayout(null);
		panelVueloVuelta.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("FechaVuelta");
		lblNewLabel_4.setBounds(10, 11, 66, 14);
		panelVueloVuelta.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Codigo de vuelo vuelta");
		lblNewLabel_4_1.setBounds(10, 46, 115, 14);
		panelVueloVuelta.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_1_1_2_1_2 = new JLabel("Aerolinea");
		lblNewLabel_2_1_1_2_1_2.setBounds(10, 74, 81, 14);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_2);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1 = new JLabel("Horario de vuelta");
		lblNewLabel_2_1_1_2_1_1_1_1.setBounds(10, 105, 115, 14);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_1_1_1);
		
		textHoraVuelta = new JTextField();
		textHoraVuelta.setColumns(10);
		textHoraVuelta.setBounds(131, 105, 130, 20);
		panelVueloVuelta.add(textHoraVuelta);
		
		textDuracionVuelta = new JTextField();
		textDuracionVuelta.setColumns(10);
		textDuracionVuelta.setBounds(131, 136, 130, 20);
		panelVueloVuelta.add(textDuracionVuelta);
		
		JLabel lblNewLabel_2_1_1_2_1_1_2_1 = new JLabel("Duracion");
		lblNewLabel_2_1_1_2_1_1_2_1.setBounds(10, 136, 81, 14);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_3 = new JLabel("Precio total");
		lblNewLabel_2_1_1_2_1_1_3.setBounds(10, 167, 81, 14);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_1_3);
		
		textPrecioTotal = new JTextField();
		textPrecioTotal.setBounds(131, 167, 130, 20);
		panelVueloVuelta.add(textPrecioTotal);
		textPrecioTotal.setColumns(10);
		
		textCodigoVuelta = new JTextField();
		textCodigoVuelta.setColumns(10);
		textCodigoVuelta.setBounds(131, 43, 130, 20);
		panelVueloVuelta.add(textCodigoVuelta);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(131, 11, 70, 20);
		panelVueloVuelta.add(dateChooser_3);
		
		JComboBox comboAerolineaVuelta = new JComboBox();
		comboAerolineaVuelta.setBounds(131, 70, 130, 22);
		panelVueloVuelta.add(comboAerolineaVuelta);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre evento");
		lblNewLabel_2.setBounds(10, 11, 81, 14);
		panelVuelos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tipo de vuelo");
		lblNewLabel_2_1.setBounds(10, 51, 81, 14);
		panelVuelos.add(lblNewLabel_2_1);
		
		textNombreVuelo = new JTextField();
		textNombreVuelo.setBounds(111, 11, 130, 20);
		panelVuelos.add(textNombreVuelo);
		textNombreVuelo.setColumns(10);
		
		comboVuelo = new JComboBox();
		comboVuelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

                String seleccion = (String) comboVuelo.getSelectedItem();

				if ("Ida y vuelta".equals(seleccion)) {
					panelVueloVuelta.setVisible(true);
					btnGuardarVueloIda.setVisible(false);
					btnGuardarVueloIdaVuelta.setVisible(true);
				}else {
					panelVueloVuelta.setVisible(false);
					btnGuardarVueloIdaVuelta.setVisible(false);
					btnGuardarVueloIda.setVisible(true);
				}
			}
		});
		comboVuelo.setModel(new DefaultComboBoxModel(new String[] {"Ida", "Ida y vuelta"}));
		comboVuelo.setBounds(111, 50, 130, 22);
		panelVuelos.add(comboVuelo);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Aeropuerto origen");
		lblNewLabel_2_1_1_1.setBounds(10, 96, 99, 14);
		panelVuelos.add(lblNewLabel_2_1_1_1);
		
		comboAero_1 = new JComboBox();
		comboAero_1.setBounds(111, 92, 130, 22);
		panelVuelos.add(comboAero_1);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha ida");
		lblNewLabel_3.setBounds(10, 171, 55, 14);
		panelVuelos.add(lblNewLabel_3);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(111, 171, 70, 20);
		panelVuelos.add(dateChooser_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Codigo vuelo");
		lblNewLabel_2_1_1_2.setBounds(10, 202, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2);
		
		textCodigoVuelo = new JTextField();
		textCodigoVuelo.setColumns(10);
		textCodigoVuelo.setBounds(111, 202, 130, 20);
		panelVuelos.add(textCodigoVuelo);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Aerolinea");
		lblNewLabel_2_1_1_2_1.setBounds(10, 233, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("Precio");
		lblNewLabel_2_1_1_2_1_1.setBounds(10, 264, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1);
		
		textPrecioVuelo = new JTextField();
		textPrecioVuelo.setColumns(10);
		textPrecioVuelo.setBounds(111, 264, 130, 20);
		panelVuelos.add(textPrecioVuelo);
		
		textHoraSal = new JTextField();
		textHoraSal.setColumns(10);
		textHoraSal.setBounds(111, 295, 130, 20);
		panelVuelos.add(textHoraSal);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("Horario de salida");
		lblNewLabel_2_1_1_2_1_1_1.setBounds(10, 295, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1_1);
		
		textDuracion = new JTextField();
		textDuracion.setColumns(10);
		textDuracion.setBounds(111, 331, 130, 20);
		panelVuelos.add(textDuracion);
		
		JLabel lblNewLabel_2_1_1_2_1_1_2 = new JLabel("Duracion");
		lblNewLabel_2_1_1_2_1_1_2.setBounds(10, 331, 81, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1_2);
		
		JLabel lblNewLabel_a = new JLabel("Aeropuerto destino");
		lblNewLabel_a.setBounds(10, 144, 99, 14);
		panelVuelos.add(lblNewLabel_a);
		
		comboAeroDes_1 = new JComboBox();
		comboAeroDes_1.setBounds(111, 140, 130, 22);
		panelVuelos.add(comboAeroDes_1);
		
		comboAerolinea_1 = new JComboBox();
		comboAerolinea_1.setBounds(111, 229, 130, 22);
		panelVuelos.add(comboAerolinea_1);
		
		ButtonGroup group = new ButtonGroup();

		rdbtnNewRadioButton = new JRadioButton("Alojamiento");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelVuelos.setVisible(false);
				panelOtros.setVisible(false);
				panelAlojamiento.setVisible(true);
			}
		});
		
		panelOtros = new JPanel();
		panelOtros.setBackground(new Color(255, 128, 192));
		panelOtros.setBounds(77, 208, 455, 331);
		add(panelOtros);
		panelOtros.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre evento");
		lblNewLabel.setBounds(10, 41, 85, 21);
		panelOtros.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descripción");
		lblNewLabel_1_1.setBounds(10, 149, 85, 21);
		panelOtros.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio");
		lblNewLabel_1_1_1.setBounds(10, 234, 85, 21);
		panelOtros.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1_1_1.setBounds(10, 96, 85, 21);
		panelOtros.add(lblNewLabel_1_1_1_1);
		
		textNombreOtros = new JTextField();
		textNombreOtros.setBounds(105, 41, 130, 20);
		panelOtros.add(textNombreOtros);
		textNombreOtros.setColumns(10);
		
		textDescripcionOtros = new JTextField();
		textDescripcionOtros.setColumns(10);
		textDescripcionOtros.setBounds(105, 149, 204, 65);
		panelOtros.add(textDescripcionOtros);
		
		textPrecioOtros = new JTextField();
		textPrecioOtros.setColumns(10);
		textPrecioOtros.setBounds(105, 234, 130, 20);
		panelOtros.add(textPrecioOtros);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(105, 97, 70, 20);
		panelOtros.add(dateChooser);
		
		JButton btnGuardarOtros = new JButton("Guardar otros");
		btnGuardarOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				java.util.Date fecha = dateChooser.getDate();
				
				insertarOtros(
						viaje,
						fecha,
						textDescripcionOtros.getText(),
						textPrecioOtros.getText(),
						textNombreOtros.getText()
						);
			}
		});
		btnGuardarOtros.setBounds(263, 282, 145, 23);
		panelOtros.add(btnGuardarOtros);
		
		panelOtros.setVisible(false);
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
		
		rdbtnNewRadioButton_2.setBounds(477, 56, 109, 23);
		add(rdbtnNewRadioButton_2);

		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		
		
		
		panelAlojamiento = new JPanel();
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
		JButton btnGuardarAlojamiento = new JButton("Guardar Alojamiento");
		btnGuardarAlojamiento.setBounds(24, 322, 157, 23);
		panelAlojamiento.add(btnGuardarAlojamiento);
		btnGuardarAlojamiento.addActionListener(new ActionListener() {
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
		panelAlojamiento.setVisible(false);
		panelVuelos.setVisible(false);
		llenarComboBoxAeropuertosOrigen(comboAero_1);
		llenarComboBoxAeropuertosDestino(comboAeroDes_1);
		llenarComboBoxAerolinea(comboAerolinea_1);
		
		btnGuardarVueloIda = new JButton("Guardar Vuelo ?");
		btnGuardarVueloIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.util.Date fechaSalida = dateChooser_2.getDate();
				
				String CodAeroli = getCodAerolineaSeleccionado();
				
				insertarVueloIda(
						viaje,
						textNombre.getText(),
						String.valueOf(comboAero_1.getSelectedItem()),
						String.valueOf(comboAeroDes_1.getSelectedItem()),
						textCodigoVuelo.getText(),
						CodAeroli,
						fechaSalida,
						textHoraSal.getText(),
						textDuracion.getText(),
						textPrecioVuelo.getText()
						);
			}
		});
		btnGuardarVueloIda.setBounds(33, 396, 148, 23);
		panelVuelos.add(btnGuardarVueloIda);
		
		btnGuardarVueloIdaVuelta = new JButton("Guardar Vuelo !");
		btnGuardarVueloIdaVuelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.util.Date fechaSalida = dateChooser_2.getDate();
				java.util.Date FechaRegreso = dateChooser_3.getDate();
				
				String CodAeroli = getCodAerolineaSeleccionado();
				
				insertarVueloIda(
						viaje,
						textNombre.getText(),
						String.valueOf(comboAero_1.getSelectedItem()),
						String.valueOf(comboAeroDes_1.getSelectedItem()),
						textCodigoVuelo.getText(),
						CodAeroli,
						fechaSalida,
						textHoraSal.getText(),
						textDuracion.getText(),
						textPrecioVuelo.getText()
						);
			}
		});
		btnGuardarVueloIdaVuelta.setBounds(33, 396, 148, 23);
		panelVuelos.add(btnGuardarVueloIdaVuelta);
	}
	
	
	private ArrayList<Aerolinea> listaAerolinea;
	private JPanel panelVueloVuelta;
	private JButton btnGuardarVueloIdaVuelta;
	private JButton btnGuardarVueloIda;

	
	private String getCodAerolineaSeleccionado() {
	    int selectedIndex = comboAerolinea_1.getSelectedIndex();
	    if (selectedIndex >= 0 && selectedIndex < listaAerolinea.size()) {
	        return listaAerolinea.get(selectedIndex).getCodAeroli(); 
	    }
	    return null; 
	}
	private String convertirFechaADatabaseFormat(java.util.Date date) {
	    if (date != null) {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        return sdf.format(date);
	    }
	    return null; 
	}
	public void llenarComboBoxAeropuertosOrigen(JComboBox<String> comboAero) {
	    Gestor gestor = new Gestor();
	    ArrayList<Aeropuerto> listaAeropuertos = gestor.buscarTodosAeropuertos();
	    
	    comboAero.removeAllItems(); 

	    for (Aeropuerto aeropuerto : listaAeropuertos) {
	        comboAero.addItem(aeropuerto.getLugarAero()); 
	    }
	}
	public void llenarComboBoxAeropuertosDestino(JComboBox<String> comboAeroDes) {
	    Gestor gestor = new Gestor();
	    ArrayList<Aeropuerto> listaAeropuertos = gestor.buscarTodosAeropuertos();
	    
	    comboAeroDes.removeAllItems(); 

	    for (Aeropuerto aeropuerto : listaAeropuertos) {
	        comboAeroDes.addItem(aeropuerto.getLugarAero()); 
	    }
	}
	public void llenarComboBoxAerolinea(JComboBox<String> comboAerolinea) {
	    Gestor gestor = new Gestor();
	    listaAerolinea = gestor.buscarTodosAerolineas();
	    
	    comboAerolinea.removeAllItems(); 

	    for (Aerolinea aerolinea : listaAerolinea) {
	        comboAerolinea.addItem(aerolinea.getLugarAeroli());
	    }
	}
	
	private void insertarAlojamiento(Viaje viaje,String ciudad, String nombre, String tipo, java.util.Date fechaInicio, java.util.Date fechaFin, String NMBHotel, String precio) {
	    String fechaInicioFormatted = convertirFechaADatabaseFormat(fechaInicio);
	    String fechaFinFormatted = convertirFechaADatabaseFormat(fechaFin);
	    
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
	private void insertarOtros(Viaje viaje, java.util.Date fecha, String descripcion, String precio, String nombre) {
		String fechaFormatted = convertirFechaADatabaseFormat(fecha);
		
	    Otros otros = new Otros();
	    otros.setViajeId(Integer.parseInt(viaje.getViajesId()));
	    otros.setDescripcion(descripcion);
	    otros.setNombre(nombre);
		otros.setFecha(fechaFormatted);
	    otros.setPrecio(precio);
	    controlador.insertarOtros(otros);
	}
	private void insertarVueloIda(Viaje viaje,String nombre, String AeropuertoOrigen, String AeropuertoDestino, String CodVuelo, String CodAeroli, java.util.Date FecSal, String HoraSal, String DurViaje, String precio) {
	    String fechaSalidaFormatted = convertirFechaADatabaseFormat(FecSal);
	    
	    Vuelo vuelo = new Vuelo();
	    vuelo.setViajeId(Integer.parseInt(viaje.getViajesId()));
	    vuelo.setNombre(nombre);
	    vuelo.setAeropuertoOrigen(AeropuertoOrigen);
	    vuelo.setAeropuertoDestino(AeropuertoDestino);
	    vuelo.setCodVuelo(CodVuelo);
	    vuelo.setCodAeroli(CodAeroli);
	    vuelo.setFecSal(fechaSalidaFormatted);
	    vuelo.setHoraSal(HoraSal);
	    vuelo.setDurViaje(DurViaje);
	    vuelo.setPrecio(precio);
	    controlador.insertarVueloIda(vuelo);
	}
	private void insertarVueloIdaVuelta(Viaje viaje,String nombre, String AeropuertoOrigen, String AeropuertoDestino, String CodVuelo, 
			String CodAeroli, java.util.Date FecSal, String HoraSal, String DurViaje, String precio, 
			String FechaRegreso, String HoraRegreso, String DuracionRegreso, String PrecioTotal, String CodigoVueloVuelta) {
		
	    String fechaSalidaFormatted = convertirFechaADatabaseFormat(FecSal);
	    Vuelo vuelo = new Vuelo();
	    vuelo.setViajeId(Integer.parseInt(viaje.getViajesId()));
	    vuelo.setNombre(nombre);
	    vuelo.setAeropuertoOrigen(AeropuertoOrigen);
	    vuelo.setAeropuertoDestino(AeropuertoDestino);
	    vuelo.setCodVuelo(CodVuelo);
	    vuelo.setCodAeroli(CodAeroli);
	    vuelo.setFecSal(fechaSalidaFormatted);
	    vuelo.setHoraSal(HoraSal);
	    vuelo.setDurViaje(DurViaje);
	    vuelo.setPrecio(precio);
	    vuelo.setFechaRegreso(FechaRegreso);
	    vuelo.setHoraRegreso(HoraRegreso);
	    vuelo.setDuracionRegreso(DuracionRegreso);
	    vuelo.setPrecioTotal(PrecioTotal);
	    vuelo.setCodigoVueloVuelta(CodigoVueloVuelta);
	    controlador.insertarVueloIdaVuelta(vuelo);
	}
}

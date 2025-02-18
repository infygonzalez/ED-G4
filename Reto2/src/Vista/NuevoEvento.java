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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Controlador.controlador;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

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
	private ArrayList<Aerolinea> listaAerolinea;
	private JPanel panelVueloVuelta;
	private JButton btnGuardarVueloIdaVuelta;
	private JButton btnGuardarVueloIda;
	private JComboBox comboAerolineaVuelta_1;
	private JComboBox<String> comboAeroDestinoV;
	private JComboBox<String> comboAeroOrigenV;
	private JPanel panelcolor;

	/**
	 * Create the panel.
	 */
	public NuevoEvento(Agencias agencia, Viaje viaje, JFrame frame) {	
		setLayout(null);
		
				rdbtnNewRadioButton = new JRadioButton("Alojamiento");
				rdbtnNewRadioButton.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
				rdbtnNewRadioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panelVuelos.setVisible(false);
						panelOtros.setVisible(false);
						panelAlojamiento.setVisible(true);
					}
				});
				
						rdbtnNewRadioButton_1 = new JRadioButton("Vuelos");
						rdbtnNewRadioButton_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
						rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								panelVuelos.setVisible(true);
								panelOtros.setVisible(false);
								panelAlojamiento.setVisible(false);
							}
						});
						
								rdbtnNewRadioButton_2 = new JRadioButton("Otros");
								rdbtnNewRadioButton_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
								rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										panelVuelos.setVisible(false);
										panelOtros.setVisible(true);
										panelAlojamiento.setVisible(false);
									}
								});
								
								JLabel lblNewLabel_6 = new JLabel("Elija el tipo de evento");
								lblNewLabel_6.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
								lblNewLabel_6.setBounds(10, 53, 548, 36);
								add(lblNewLabel_6);
								
								JButton btnNewButton = new JButton("cancelar");
								btnNewButton.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
								btnNewButton.setBounds(837, 614, 237, 48);
								add(btnNewButton);
								btnNewButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new ViajesYEventos(agencia, viaje, frame));
                frame.revalidate();
                frame.repaint();
									}
								});
								ButtonGroup group = new ButtonGroup();
								panelcolor = new JPanel();
								panelcolor.setBounds(0, 30, 1282, 23);
								add(panelcolor);
								panelcolor.setBackground(Color.decode(agencia.getAgenciaColorMarca()));
								
								rdbtnNewRadioButton_2.setBounds(449, 109, 109, 23);
								add(rdbtnNewRadioButton_2);
								group.add(rdbtnNewRadioButton_2);
						rdbtnNewRadioButton_1.setBounds(227, 109, 109, 23);
						add(rdbtnNewRadioButton_1);
						group.add(rdbtnNewRadioButton_1);
				rdbtnNewRadioButton.setBounds(10, 109, 192, 23);
				add(rdbtnNewRadioButton);
				
						group.add(rdbtnNewRadioButton);
		
		panelVuelos = new JPanel();
		panelVuelos.setBackground(new Color(240, 240, 240));
		panelVuelos.setBounds(10, 139, 1076, 502);
		add(panelVuelos);
		panelVuelos.setLayout(null);
		
		panelVueloVuelta = new JPanel();
		panelVueloVuelta.setBackground(new Color(0, 0, 0, 0));
		panelVueloVuelta.setBounds(0, 243, 1076, 211);
		panelVuelos.add(panelVueloVuelta);
		panelVueloVuelta.setLayout(null);
		panelVueloVuelta.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("FechaVuelta");
		lblNewLabel_4.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(559, 11, 264, 49);
		panelVueloVuelta.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Codigo de vuelo vuelta");
		lblNewLabel_4_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_4_1.setBounds(10, 11, 264, 49);
		panelVueloVuelta.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_1_1_2_1_2 = new JLabel("Aerolinea");
		lblNewLabel_2_1_1_2_1_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1_2.setBounds(10, 107, 264, 49);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_2);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1 = new JLabel("Horario de vuelta");
		lblNewLabel_2_1_1_2_1_1_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1_1_1_1.setBounds(559, 107, 264, 49);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_1_1_1);
		
		textHoraVuelta = new JTextField();
		textHoraVuelta.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textHoraVuelta.setColumns(10);
		textHoraVuelta.setBounds(851, 113, 196, 36);
		panelVueloVuelta.add(textHoraVuelta);
		
		textDuracionVuelta = new JTextField();
		textDuracionVuelta.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textDuracionVuelta.setColumns(10);
		textDuracionVuelta.setBounds(336, 164, 196, 36);
		panelVueloVuelta.add(textDuracionVuelta);
		
		JLabel lblNewLabel_2_1_1_2_1_1_2_1 = new JLabel("Duracion");
		lblNewLabel_2_1_1_2_1_1_2_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1_1_2_1.setBounds(10, 156, 264, 49);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_3 = new JLabel("Precio total");
		lblNewLabel_2_1_1_2_1_1_3.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1_1_3.setBounds(559, 156, 264, 49);
		panelVueloVuelta.add(lblNewLabel_2_1_1_2_1_1_3);
		
		textPrecioTotal = new JTextField();
		textPrecioTotal.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textPrecioTotal.setBounds(851, 163, 196, 34);
		panelVueloVuelta.add(textPrecioTotal);
		textPrecioTotal.setColumns(10);
		
		textCodigoVuelta = new JTextField();
		textCodigoVuelta.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textCodigoVuelta.setColumns(10);
		textCodigoVuelta.setBounds(336, 17, 196, 36);
		panelVueloVuelta.add(textCodigoVuelta);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.getCalendarButton().setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		dateChooser_3.setBounds(851, 11, 196, 45);
		panelVueloVuelta.add(dateChooser_3);
		
		comboAerolineaVuelta_1 = new JComboBox();
		comboAerolineaVuelta_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		comboAerolineaVuelta_1.setBounds(336, 113, 196, 36);
		panelVueloVuelta.add(comboAerolineaVuelta_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre evento");
		lblNewLabel_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(10, 11, 187, 32);
		panelVuelos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tipo de vuelo");
		lblNewLabel_2_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(569, 11, 187, 32);
		panelVuelos.add(lblNewLabel_2_1);
		
		comboVuelo = new JComboBox();
		comboVuelo.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
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
		comboVuelo.setBounds(859, 11, 196, 32);
		panelVuelos.add(comboVuelo);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Aeropuerto origen");
		lblNewLabel_2_1_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_1.setBounds(10, 64, 203, 32);
		panelVuelos.add(lblNewLabel_2_1_1_1);
		
		comboAero_1 = new JComboBox();
		comboAero_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		comboAero_1.setBounds(335, 62, 196, 36);
		panelVuelos.add(comboAero_1);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha ida");
		lblNewLabel_3.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(10, 115, 187, 14);
		panelVuelos.add(lblNewLabel_3);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.getCalendarButton().setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		dateChooser_2.setBounds(335, 109, 196, 36);
		panelVuelos.add(dateChooser_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Codigo vuelo");
		lblNewLabel_2_1_1_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2.setBounds(569, 106, 232, 33);
		panelVuelos.add(lblNewLabel_2_1_1_2);
		
		textCodigoVuelo = new JTextField();
		textCodigoVuelo.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textCodigoVuelo.setColumns(10);
		textCodigoVuelo.setBounds(859, 104, 196, 37);
		panelVuelos.add(textCodigoVuelo);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Aerolinea");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1.setBounds(10, 171, 187, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("Precio");
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1_1.setBounds(569, 160, 148, 37);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1);
		
		textPrecioVuelo = new JTextField();
		textPrecioVuelo.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textPrecioVuelo.setColumns(10);
		textPrecioVuelo.setBounds(859, 153, 196, 37);
		panelVuelos.add(textPrecioVuelo);
		
		textHoraSal = new JTextField();
		textHoraSal.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textHoraSal.setColumns(10);
		textHoraSal.setBounds(335, 219, 196, 36);
		panelVuelos.add(textHoraSal);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("Horario de salida");
		lblNewLabel_2_1_1_2_1_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1_1_1.setBounds(10, 222, 203, 14);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1_1);
		
		textDuracion = new JTextField();
		textDuracion.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		textDuracion.setColumns(10);
		textDuracion.setBounds(859, 203, 196, 36);
		panelVuelos.add(textDuracion);
		
		JLabel lblNewLabel_2_1_1_2_1_1_2 = new JLabel("Duracion");
		lblNewLabel_2_1_1_2_1_1_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_2_1_1_2_1_1_2.setBounds(569, 219, 208, 24);
		panelVuelos.add(lblNewLabel_2_1_1_2_1_1_2);
		
		JLabel lblNewLabel_a = new JLabel("Aeropuerto destino");
		lblNewLabel_a.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_a.setBounds(569, 54, 246, 26);
		panelVuelos.add(lblNewLabel_a);
		
		comboAeroDes_1 = new JComboBox();
		comboAeroDes_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		comboAeroDes_1.setBounds(859, 64, 196, 32);
		panelVuelos.add(comboAeroDes_1);
		
		comboAerolinea_1 = new JComboBox();
		comboAerolinea_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		comboAerolinea_1.setBounds(335, 167, 196, 36);
		panelVuelos.add(comboAerolinea_1);
		
	
		panelVuelos.setVisible(false);
		llenarComboBoxAeropuertosOrigen(comboAero_1);
		llenarComboBoxAeropuertosDestino(comboAeroDes_1);
		llenarComboBoxAerolinea(comboAerolinea_1);
		llenarComboBoxAerolineaVuelta(comboAerolineaVuelta_1);
		
		JLabel lblAeropuertoOrigenVuelta = new JLabel("Aeropuerto origen");
		lblAeropuertoOrigenVuelta.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblAeropuertoOrigenVuelta.setBounds(10, 58, 264, 49);
		panelVueloVuelta.add(lblAeropuertoOrigenVuelta);
		
		JLabel lblAeropuertoDestino = new JLabel("Aeropuerto destino");
		lblAeropuertoDestino.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblAeropuertoDestino.setBounds(559, 58, 264, 49);
		panelVueloVuelta.add(lblAeropuertoDestino);
		
		comboAeroOrigenV = new JComboBox();
		comboAeroOrigenV.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		comboAeroOrigenV.setBounds(336, 67, 196, 34);
		panelVueloVuelta.add(comboAeroOrigenV);
		llenarComboBoxAeropuertosOrigenV(comboAeroOrigenV);
		
				comboAeroDestinoV = new JComboBox<String>();
				comboAeroDestinoV.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
				comboAeroDestinoV.setBounds(851, 71, 196, 34);
				panelVueloVuelta.add(comboAeroDestinoV);
				llenarComboBoxAeropuertosDestinoV(comboAeroDestinoV);
				
						btnGuardarVueloIda = new JButton("Guardar Vuelo ");
						btnGuardarVueloIda.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
						btnGuardarVueloIda.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								java.util.Date fechaSalida = dateChooser_2.getDate();
								
								String CodAeroli = getCodAerolineaSeleccionado();
								
								insertarVueloIda(
										viaje,
										textNombreVuelo.getText(),
										String.valueOf(comboAero_1.getSelectedItem()),
										String.valueOf(comboAeroDes_1.getSelectedItem()),
										textCodigoVuelo.getText(),
										CodAeroli,
										fechaSalida,
										textHoraSal.getText(),
										textDuracion.getText(),
										textPrecioVuelo.getText()
										);
								System.out.println(textPrecioVuelo.getText());
								if (textNombreVuelo.getText().equals("")|| textCodigoVuelo.getText().equals("")) {
						        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
						        }else if(fechaSalida == null){
						        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
						        }else {
						        JOptionPane.showMessageDialog(null, "Operación realizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
						        }
							}
						});
						btnGuardarVueloIda.setBounds(10, 454, 237, 48);
						panelVuelos.add(btnGuardarVueloIda);
						
						btnGuardarVueloIdaVuelta = new JButton("Guardar Vuelo ");
						btnGuardarVueloIdaVuelta.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
						btnGuardarVueloIdaVuelta.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								java.util.Date fechaSalida = dateChooser_2.getDate();
								java.util.Date FechaRegreso = dateChooser_3.getDate();
								
								String CodAeroli = getCodAerolineaSeleccionado();
								String CodAeroliVuelta = getCodAerolineaVueltaSeleccionado();
								
								insertarVueloIdaVuelta(
										viaje,
										textNombreVuelo.getText(),
										String.valueOf(comboAero_1.getSelectedItem()),
										String.valueOf(comboAeroDes_1.getSelectedItem()),
										textCodigoVuelo.getText(),
										CodAeroli,
										fechaSalida,
										textHoraSal.getText(),
										textDuracion.getText(),
										textPrecioVuelo.getText(),
										FechaRegreso,
										textHoraVuelta.getText(),
										textDuracionVuelta.getText(),
										textPrecioTotal.getText(),
										textCodigoVuelta.getText(),
										CodAeroliVuelta,
										String.valueOf(comboAeroOrigenV.getSelectedItem()),
										String.valueOf(comboAeroDestinoV.getSelectedItem())
										);
								if (textNombreVuelo.getText().equals("")|| textCodigoVuelo.getText().equals("")) {
						        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
						        }else if(fechaSalida == null || FechaRegreso == null){
						        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
						        }else {
						        JOptionPane.showMessageDialog(null, "Operación realizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
						        }
							}
						});
						
						btnGuardarVueloIdaVuelta.setBounds(10, 454, 237, 48);
						panelVuelos.add(btnGuardarVueloIdaVuelta);
						
						textNombreVuelo = new JTextField();
						textNombreVuelo.setBounds(335, 11, 196, 36);
						panelVuelos.add(textNombreVuelo);
						textNombreVuelo.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
						textNombreVuelo.setColumns(10);
		
		panelOtros = new JPanel();
		panelOtros.setBackground(new Color(240, 240, 240));
		panelOtros.setBounds(10, 139, 798, 502);
		add(panelOtros);
		panelOtros.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre evento");
		lblNewLabel.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 47, 183, 21);
		panelOtros.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descripción");
		lblNewLabel_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(10, 157, 168, 21);
		panelOtros.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio");
		lblNewLabel_1_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(10, 240, 85, 21);
		panelOtros.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha");
		lblNewLabel_1_1_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1.setBounds(10, 96, 85, 21);
		panelOtros.add(lblNewLabel_1_1_1_1);
		
		textNombreOtros = new JTextField();
		textNombreOtros.setBounds(243, 44, 204, 33);
		panelOtros.add(textNombreOtros);
		textNombreOtros.setColumns(10);
		
		textDescripcionOtros = new JTextField();
		textDescripcionOtros.setColumns(10);
		textDescripcionOtros.setBounds(243, 149, 204, 65);
		panelOtros.add(textDescripcionOtros);
		
		textPrecioOtros = new JTextField();
		textPrecioOtros.setColumns(10);
		textPrecioOtros.setBounds(243, 237, 204, 33);
		panelOtros.add(textPrecioOtros);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(243, 97, 204, 33);
		panelOtros.add(dateChooser);
		
		JButton btnGuardarOtros = new JButton("Guardar otros");
		btnGuardarOtros.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
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
				if (textNombreOtros.getText().equals("")|| textDescripcionOtros.getText().equals("")) {
		        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
		        }else if(fecha == null ){
		        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
		        }else {
		        JOptionPane.showMessageDialog(null, "Operación realizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
		        }
			}
		});
		btnGuardarOtros.setBounds(48, 397, 249, 52);
		panelOtros.add(btnGuardarOtros);
		
		panelOtros.setVisible(false);
		
		
		panelAlojamiento = new JPanel();
		panelAlojamiento.setBackground(new Color(240, 240, 240));
		panelAlojamiento.setBounds(10, 139, 1076, 502);
		add(panelAlojamiento);
		panelAlojamiento.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre evento");
		lblNewLabel_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 31, 182, 31);
		panelAlojamiento.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(348, 31, 203, 37);
		panelAlojamiento.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo evento");
		lblNewLabel_1_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(10, 89, 203, 31);
		panelAlojamiento.add(lblNewLabel_1_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Doble", "Individual", "Triple"}));
		comboBox_1.setBounds(348, 89, 203, 37);
		panelAlojamiento.add(comboBox_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ciudad");
		lblNewLabel_1_3.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(613, 93, 162, 23);
		panelAlojamiento.add(lblNewLabel_1_3);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(805, 89, 203, 37);
		panelAlojamiento.add(textCiudad);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(348, 206, 203, 36);
		panelAlojamiento.add(textPrecio);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Precio");
		lblNewLabel_1_3_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_3_1.setBounds(10, 220, 91, 22);
		panelAlojamiento.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Fecha entrada");
		lblNewLabel_1_3_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_3_1_1.setBounds(10, 153, 182, 26);
		panelAlojamiento.add(lblNewLabel_1_3_1_1);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(348, 142, 203, 37);
		panelAlojamiento.add(dateChooser_1);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Fecha salida");
		lblNewLabel_1_3_1_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_1_3_1_1_1.setBounds(613, 153, 182, 26);
		panelAlojamiento.add(lblNewLabel_1_3_1_1_1);
		
		dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(805, 148, 203, 31);
		panelAlojamiento.add(dateChooser_4);
		
		textNMBHotel = new JTextField();
		textNMBHotel.setBounds(805, 31, 203, 37);
		panelAlojamiento.add(textNMBHotel);
		textNMBHotel.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre Hotel");
		lblNewLabel_5.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(613, 35, 157, 22);
		panelAlojamiento.add(lblNewLabel_5);
		JButton btnGuardarAlojamiento = new JButton("Guardar Alojamiento");
		btnGuardarAlojamiento.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		btnGuardarAlojamiento.setBounds(35, 441, 307, 50);
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
				if (textNMBHotel.getText().equals("")|| textNombre.getText().equals("")) {
		        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
		        }else if(fechaInicio == null || fechaFin == null ){
		        	JOptionPane.showMessageDialog(frame, "Campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
		        }else {
		        JOptionPane.showMessageDialog(null, "Operación realizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
		        }
				
			}
		});
		panelAlojamiento.setVisible(false);
	}
	
	
	

	
	private String getCodAerolineaSeleccionado() {
	    int selectedIndex = comboAerolinea_1.getSelectedIndex();
	    if (selectedIndex >= 0 && selectedIndex < listaAerolinea.size()) {
	        return listaAerolinea.get(selectedIndex).getCodAeroli(); 
	    }
	    return null; 
	}
	private String getCodAerolineaVueltaSeleccionado() {
	    int selectedIndex = comboAerolineaVuelta_1.getSelectedIndex();
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
	public void llenarComboBoxAeropuertosOrigenV(JComboBox<String> comboAeroOrigenV) {
	    Gestor gestor = new Gestor();
	    ArrayList<Aeropuerto> listaAeropuertos = gestor.buscarTodosAeropuertos();
	    
	    comboAeroOrigenV.removeAllItems(); 

	    for (Aeropuerto aeropuerto : listaAeropuertos) {
	    	comboAeroOrigenV.addItem(aeropuerto.getLugarAero()); 
	    }
	}
	public void llenarComboBoxAeropuertosDestinoV(JComboBox<String> comboAeroDestinoV) {
	    Gestor gestor = new Gestor();
	    ArrayList<Aeropuerto> listaAeropuertos = gestor.buscarTodosAeropuertos();
	    
	    comboAeroDestinoV.removeAllItems(); 

	    for (Aeropuerto aeropuerto : listaAeropuertos) {
	    	comboAeroDestinoV.addItem(aeropuerto.getLugarAero()); 
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
	public void llenarComboBoxAerolineaVuelta(JComboBox<String> comboAerolineaVuelta) {
	    Gestor gestor = new Gestor();
	    listaAerolinea = gestor.buscarTodosAerolineas();
	    
	    comboAerolineaVuelta.removeAllItems(); 

	    for (Aerolinea aerolinea : listaAerolinea) {
	        comboAerolineaVuelta.addItem(aerolinea.getLugarAeroli());
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
			java.util.Date FechaRegreso, String HoraRegreso, String DuracionRegreso, String PrecioTotal, String CodigoVueloVuelta, String codAeroliRegreso, String aeropuertoOrigenVuelta, String aeropuertoDestinoVuelta) {
		
	    String fechaSalidaFormatted = convertirFechaADatabaseFormat(FecSal);
	    String fechaVueltaFormatted = convertirFechaADatabaseFormat(FechaRegreso);
	    
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
	    vuelo.setFechaRegreso(fechaVueltaFormatted);
	    vuelo.setHoraRegreso(HoraRegreso);
	    vuelo.setDuracionRegreso(DuracionRegreso);
	    vuelo.setPrecioTotal(PrecioTotal);
	    vuelo.setCodigoVueloVuelta(CodigoVueloVuelta);
	    vuelo.setCodAeroliRegreso(codAeroliRegreso);
	    vuelo.setAeropuertoOrigenVuelta(aeropuertoOrigenVuelta);
	    vuelo.setAeropuertoDestinoVuelta(aeropuertoDestinoVuelta);
	    controlador.insertarVueloIdaVuelta(vuelo);
	}
}

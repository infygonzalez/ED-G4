package Vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;


import javax.swing.JScrollPane;
import javax.swing.table.TableModel;

import Controlador.controlador;
import Modelo.Pais;
import Modelo.Viaje;
import Modelo.Agencias;
import Modelo.Alojamiento;
import Modelo.Evento;
import Modelo.Otros;
import Modelo.Vuelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;


public class ViajesYEventos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table_1;
	private JFrame frame;
	private DefaultTableModel model;
	private DefaultTableModel model1;
	private controlador Controlador = new controlador();
	private JTable table;
	/**
	 * Create the panel.
	 */

	        
	  public ViajesYEventos(Agencias agencia, Viaje viaje, JFrame frame) {
	        
	        setLayout(null);

	        model = new DefaultTableModel();
	        model.addColumn("ID");
	        model.addColumn("nombre");
	        model.addColumn("tipo");
	        model.addColumn("dias");
	        model.addColumn("fecha inicio");
	        model.addColumn("fecha fin");
	        model.addColumn("pais");

	        model1 = new DefaultTableModel();
	        model1.addColumn("ID");
	        model1.addColumn("nombre");
	        model1.addColumn("tipo");
	        model1.addColumn("fecha");
	        model1.addColumn("precio");

	        JButton btnNuevoViaje = new JButton("Nuevo viaje");
	        btnNuevoViaje.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	                frame.setContentPane(new NuevoViaje(agencia, viaje, frame));
	                frame.repaint();
	                frame.revalidate();
	        		
	        	}
	        });
	        
	        JPanel panelLogo = new JPanel();
	        panelLogo.setBounds(15, 15, 168, 109);
	        add(panelLogo);
	        panelLogo.setOpaque(false);
	        panelLogo.setBorder(null);
	        panelLogo.setBackground(Color.decode(agencia.getAgenciaColorMarca()));
	        
	        panelLogo.setLayout(new BorderLayout(0, 0));

	        URL imgUrl = null;
	        try {
	            imgUrl = new URL(agencia.getAgenciaLogo());
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	        ImageIcon image = new ImageIcon(imgUrl);
	        JLabel lblLogo = new JLabel(new ImageIcon(image.getImage().getScaledInstance(168, 109, Image.SCALE_SMOOTH)));
	        panelLogo.add(lblLogo);
	        
	        JPanel panelColor = new JPanel();
	        panelColor.setBounds(0, 32, 1280, 23);
	        add(panelColor);
	        panelColor.setBackground(Color.decode(agencia.getAgenciaColorMarca()));
	        btnNuevoViaje.setFont(new Font("Eras Bold ITC", Font.PLAIN, 22));
	        btnNuevoViaje.setBackground(new Color(144, 238, 144));
	        btnNuevoViaje.setBounds(840, 87, 249, 77);
	        add(btnNuevoViaje);

	        JButton btnNuevoEvento = new JButton("Nuevo evento");
	        btnNuevoEvento.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Viaje viajeSeleccionado = viajeSeleccionado(agencia);
	        		int rowIndex = table.getSelectedRow();
	        		if (viajeSeleccionado!=null && rowIndex != -1) {
	                frame.setContentPane(new NuevoEvento(agencia,viajeSeleccionado, frame));
	                frame.repaint();
	                frame.revalidate();
	        		}else {
	        			JOptionPane.showMessageDialog(frame, "Tienes que seleccionar un viaje para añadir un evento", "Error", JOptionPane.WARNING_MESSAGE);
	        		}
	        	}
	        });
	        btnNuevoEvento.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnNuevoEvento.setBackground(new Color(144, 238, 144));
	        btnNuevoEvento.setBounds(840, 355, 249, 77);
	        add(btnNuevoEvento);

	        JButton btnGenerarOferta = new JButton("Generar oferta cliente");
	        btnGenerarOferta.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		exportarViajesYEventosATexto(agencia);

	        	}
	        });
	        btnGenerarOferta.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnGenerarOferta.setBackground(new Color(255, 160, 122));
	        btnGenerarOferta.setBounds(407, 600, 294, 58);
	        add(btnGenerarOferta);

	        JButton btnDesconectar = new JButton("Desconectar");
	        btnDesconectar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Ventana ventana = new Ventana();
					ventana.setVisible(true);
					frame.dispose();
					
	                
	        	}
	        });
	        btnDesconectar.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnDesconectar.setBackground(new Color(255, 160, 122));
	        btnDesconectar.setBounds(919, 600, 282, 58);
	        add(btnDesconectar);

	        JButton btnEliminar1 = new JButton("Eliminar viaje");
	        btnEliminar1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnEliminar1.setBackground(new Color(248, 54, 60));
	        btnEliminar1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {

	        		Viaje viajeSeleccionado = viajeSeleccionado(agencia);
	        		int rowIndex = table.getSelectedRow();
	                if (viajeSeleccionado != null && rowIndex != -1) {
	        		    Controlador.borrarViaje(viajeSeleccionado);
	        		    model.removeRow(rowIndex);
	        		    model1.setRowCount(0);
	        		}
	                
	        	}
	        });
	        btnEliminar1.setBounds(840, 196, 249, 77);
	        add(btnEliminar1);

	        JButton btnEliminar2 = new JButton("Eliminar evento");
	        btnEliminar2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnEliminar2.setBackground(new Color(248, 54, 60));
	        btnEliminar2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		boolean valido = false;
	            	Viaje viajeSeleccionado = viajeSeleccionado(agencia);
	        		if (table_1.getSelectedRow() != -1 ) {
	        			
	                    String EventoIDSeleccionado = table_1.getValueAt(table_1.getSelectedRow(),0).toString();
	                    String TipoEventoSeleccionado = table_1.getValueAt(table_1.getSelectedRow(),2).toString();
	                    int rowIndex = table.getSelectedRow();		           
	                    
	                    if (TipoEventoSeleccionado.equals("Vuelo")) {
	                    	 ArrayList<Vuelo> vuelo = viajeSeleccionado(agencia).getVuelo();
	     	                for (int i = 0; i < vuelo.size(); i++) {
	     	                    if (vuelo.get(i).getEventoId().equals(EventoIDSeleccionado)) {
	     	                    	 valido = Controlador.eliminarVuelo(vuelo.get(i));
	     	                    }
	     	                }
	                       
	                    } 
	                    
	                    else if (TipoEventoSeleccionado.equals("Alojamiento")) {
	                    	ArrayList<Alojamiento> alojamiento = viajeSeleccionado(agencia).getAlojamiento();
	     	                for (int i = 0; i < alojamiento.size(); i++) {
	     	                    if (alojamiento.get(i).getEventoId().equals(EventoIDSeleccionado)) {
	     	                    	 valido = Controlador.eliminarAlojamiento(alojamiento.get(i));
	     	                    }
	     	                }
	                    } 
	                    
	                    else if (TipoEventoSeleccionado.equals("Actividades")) {
	                    	ArrayList<Otros> actividades = viajeSeleccionado(agencia).getOtros();
	     	                for (int i = 0; i < actividades.size(); i++) {
	     	                    if (actividades.get(i).getEventoId().equals(EventoIDSeleccionado)) {
	     	                    	 valido = Controlador.eliminarOtros(actividades.get(i));
	     	                    
	     	                    }
	     	                }
	                    }

		                actualizarEventos(viajeSeleccionado);
	                   
	        		}else {
	        			System.out.println("errorrrrr");
	        		}
	        	}
	        });
	        btnEliminar2.setBounds(840, 444, 249, 77);
	        add(btnEliminar2);

	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(230, 66, 590, 236);
	        add(scrollPane);

	        table = new JTable(model);
	        scrollPane.setViewportView(table);
	        table.setDefaultEditor(Object.class, null);

	        JScrollPane scrollPane_1 = new JScrollPane();
	        scrollPane_1.setBounds(230, 338, 590, 236);
	        add(scrollPane_1);

	        table_1 = new JTable(model1);
	        scrollPane_1.setViewportView(table_1);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon("img/fondo blur.jpg"));
	        lblNewLabel.setBounds(0, 0, 1280, 720);
	        add(lblNewLabel);

	        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent event) {
	            	Viaje viajeSeleccionado = viajeSeleccionado(agencia);
	                if (viajeSeleccionado != null) {
	                actualizarEventos(viajeSeleccionado);
	                }
	            }
	        });
	   
	  
	  

	        rellenarTablaViajes(agencia);
	        
	    }
	  
	  
	 
	     public Viaje viajeSeleccionado(Agencias agencia) {
	            if (table.getSelectedRow() != -1) {
	                String ViajeIDSeleccionado = table.getValueAt(table.getSelectedRow(),0).toString();
	                ArrayList<Viaje> viajes = agencia.getViajes();
	                for (int i = 0; i < viajes.size(); i++) {
	                    if (viajes.get(i).getViajesId().equals(ViajeIDSeleccionado)) {
	                        return viajes.get(i);
	                    }
	                }
	            }
	            return null;
	        }
	     
	
	 private void rellenarTablaViajes(Agencias agencia) {
	        model.setRowCount(0);
	        ArrayList<Pais> pais = Controlador.buscarTodosPaises();
	        ArrayList<Viaje> viajes = Controlador.buscarTodosViajes(pais, agencia);
	        
	        
	        agencia.setViajes(viajes);
	        for (Viaje viaje:viajes) {
	            String[] fila = new String[100];
	            viaje.setAlojamiento(Controlador.buscarTodosAlojamientos(viaje));
	            viaje.setVuelo(Controlador.buscarTodosVuelos(viaje));
	            viaje.setOtros(Controlador.buscarTodosOtros(viaje));
	            fila[0] = viaje.getViajesId();
	            fila[1] = viaje.getViajesNombre();
	            fila[2] = viaje.getViajesTipo();
	            fila[3] = viaje.getViajesDuracion();
	            fila[4] = viaje.getViajesFechaInicio();
	            fila[5] = viaje.getViajesFechaFin();
	            fila[6] = viaje.getPais().getDescripcion();
	            model.addRow(fila);
	        }
	    }
	 
	 private void actualizarEventos(Viaje viaje) {
	        model1.setRowCount(0);

	        ArrayList<Alojamiento> alojamientos = viaje.getAlojamiento();
	        for (Alojamiento alojamiento : alojamientos) {
	            model1.addRow(new Object[]{alojamiento.getEventoId(),alojamiento.getNombre(), "Alojamiento", alojamiento.getFecEntrada(), alojamiento.getPrecio()});
	        }

	        ArrayList<Otros> otros = Controlador.buscarTodosOtros(viaje);
	        for (Otros otro : otros) {
	            model1.addRow(new Object[]{otro.getEventoId(),otro.getNombre(), "Actividades", otro.getFecha(), otro.getPrecio()});
	        }

	        ArrayList<Vuelo> vuelos = Controlador.buscarTodosVuelos(viaje);
	        for (Vuelo vuelo : vuelos) {
	            model1.addRow(new Object[]{vuelo.getEventoId(),vuelo.getNombre(), "Vuelo", vuelo.getFecSal(), vuelo.getPrecio()});
	        }
	 }
	 private void exportarViajesYEventosATexto(Agencias agencia) {
		    // Verificar si la agencia es nula
		    if (agencia == null) {
		        JOptionPane.showMessageDialog(this, "Agencia no disponible. Selecciona una agencia antes de exportar.", "Error", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    // Obtener los viajes de la agencia seleccionada
		    List<Viaje> viajes = agencia.getViajes();
		    if (viajes.isEmpty()) {
		        JOptionPane.showMessageDialog(this, "No hay viajes disponibles para la agencia seleccionada.", "Información", JOptionPane.INFORMATION_MESSAGE);
		        return;
		    }

		    // Crear el archivo de texto
		    String nombreArchivo = "ViajesYEventos_" + agencia.getAgenciaNombre() + ".txt";
		    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
		        writer.write("Viajes y Eventos de la Agencia: " + agencia.getAgenciaNombre() + "\n\n");
		        
		        // Iterar sobre los viajes
		        for (Viaje viaje : viajes) {
		            writer.write("Viaje ID: " + viaje.getViajesId() + "\n");
		            writer.write("Nombre: " + viaje.getViajesNombre() + "\n");
		            writer.write("Tipo: " + viaje.getViajesTipo() + "\n");
		            writer.write("Duración: " + viaje.getViajesDuracion() + "\n");
		            writer.write("Fecha de inicio: " + viaje.getViajesFechaInicio() + "\n");
		            writer.write("Fecha de fin: " + viaje.getViajesFechaFin() + "\n");
		            writer.write("Destino: " + viaje.getPais().getDescripcion() + "\n");
		            writer.write("Eventos:\n");

		            // Escribir los eventos de cada viaje
		            ArrayList<Alojamiento> alojamientos = viaje.getAlojamiento();
		            for (Alojamiento alojamiento : alojamientos) {
		                writer.write("  - " + alojamiento.getNombre() + " (Alojamiento) en " + alojamiento.getNMBHotel() + " desde " + alojamiento.getFecEntrada() + " hasta " + alojamiento.getFecSalida() + " por " + alojamiento.getPrecio() + "\n");
		            }

		            ArrayList<Otros> otros = viaje.getOtros();
		            for (Otros otro : otros) {
		                writer.write("  - " + otro.getNombre() + " (Actividad) el " + otro.getFecha() + " por " + otro.getPrecio() + "\n");
		            }

		            ArrayList<Vuelo> vuelos = viaje.getVuelo();
		            for (Vuelo vuelo : vuelos) {
		            	if (vuelo.getCodigoVueloVuelta()==null) {
		                   writer.write("  - " + vuelo.getNombre()+ " con el codigo " + vuelo.getCodVuelo() + " (Vuelo) el " + vuelo.getFecSal() + " en el aeropuerto " + vuelo.getAeropuertoOrigen() + " con salida a " + vuelo.getHoraSal() + " con llegada en " + vuelo.getAeropuertoDestino() + " con una duracion de " + vuelo.getDurViaje() + " por " + vuelo.getPrecio() + "\n");
		            	}else {
		            		writer.write("  - " + vuelo.getNombre()+ " con el codigo " + vuelo.getCodVuelo() + " (Vuelo) el " + vuelo.getFecSal() + " en el aeropuerto " + vuelo.getAeropuertoOrigen() + " con salida a " + vuelo.getHoraSal() + " con llegada en " + vuelo.getAeropuertoDestino() + " con una duracion de " + vuelo.getDurViaje()  + " \n con el codigo " + vuelo.getCodigoVueloVuelta() + " (Vuelo) el " + vuelo.getFechaRegreso() + " en el aeropuerto " + vuelo.getAeropuertoOrigenVuelta() + " con salida a " + vuelo.getHoraRegreso() + " con llegada en " + vuelo.getAeropuertoDestinoVuelta() + " hasta " + vuelo.getFechaRegreso() + " con una duracion de " + vuelo.getDuracionRegreso() +" por " + vuelo.getPrecioTotal() + "\n");
		            	}
		            }
		            writer.write("\n");
		        }

		        JOptionPane.showMessageDialog(this, "Archivo exportado correctamente: " + nombreArchivo, "Éxito", JOptionPane.INFORMATION_MESSAGE);
		    } catch (IOException e) {
		        JOptionPane.showMessageDialog(this, "Error al exportar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		        e.printStackTrace();
		    }
		}
	
}

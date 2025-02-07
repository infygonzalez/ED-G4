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
import java.util.ArrayList;
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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


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

	        
	  public ViajesYEventos(Agencias agencia, JFrame frame) {
	        
	        setLayout(null);

	        model = new DefaultTableModel();
	        model.addColumn("nombre");
	        model.addColumn("tipo");
	        model.addColumn("dias");
	        model.addColumn("fecha inicio");
	        model.addColumn("fecha fin");
	        model.addColumn("pais");

	        model1 = new DefaultTableModel();
	        model1.addColumn("nombre");
	        model1.addColumn("tipo");
	        model1.addColumn("fecha");
	        model1.addColumn("precio");

	        JButton btnNuevoViaje = new JButton("Nuevo viaje");
	        btnNuevoViaje.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	                frame.setContentPane(new NuevoViaje(agencia, frame));
	                frame.repaint();
	                frame.revalidate();
	        	}
	        });
	        btnNuevoViaje.setFont(new Font("Eras Bold ITC", Font.PLAIN, 22));
	        btnNuevoViaje.setBackground(new Color(144, 238, 144));
	        btnNuevoViaje.setBounds(851, 68, 249, 77);
	        add(btnNuevoViaje);

	        JButton btnNuevoEvento = new JButton("Nuevo evento");
	        btnNuevoEvento.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	                frame.setContentPane(new NuevoEvento(agencia, frame));
	                frame.repaint();
	                frame.revalidate();

	        	}
	        });
	        btnNuevoEvento.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnNuevoEvento.setBackground(new Color(144, 238, 144));
	        btnNuevoEvento.setBounds(851, 343, 249, 77);
	        add(btnNuevoEvento);

	        JButton btnGenerarOferta = new JButton("Generar oferta cliente");
	        btnGenerarOferta.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnGenerarOferta.setBackground(new Color(255, 160, 122));
	        btnGenerarOferta.setBounds(346, 577, 332, 86);
	        add(btnGenerarOferta);

	        JButton btnDesconectar = new JButton("Desconectar");
	        btnDesconectar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Ventana ventana = new Ventana();
					ventana.setVisible(true);
					
	                
	        	}
	        });
	        btnDesconectar.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnDesconectar.setBackground(new Color(255, 160, 122));
	        btnDesconectar.setBounds(910, 577, 332, 86);
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
	        btnEliminar1.setBounds(851, 179, 249, 77);
	        add(btnEliminar1);

	        JButton btnEliminar2 = new JButton("Eliminar evento");
	        btnEliminar2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
	        btnEliminar2.setBackground(new Color(248, 54, 60));
	        btnEliminar2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		boolean valido = false;
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
	     	                }model1.removeRow(rowIndex);
	                       
	                    } 
	                    
	                    else if (TipoEventoSeleccionado.equals("Alojamiento")) {
	                    	ArrayList<Alojamiento> alojamiento = viajeSeleccionado(agencia).getAlojamiento();
	     	                for (int i = 0; i < alojamiento.size(); i++) {
	     	                    if (alojamiento.get(i).getEventoId().equals(EventoIDSeleccionado)) {
	     	                    	 valido = Controlador.eliminarAlojamiento(alojamiento.get(i));
	     	                    }
	     	                }model1.removeRow(rowIndex);
	                    } 
	                    
	                    else if (TipoEventoSeleccionado.equals("Actividades")) {
	                    	ArrayList<Otros> actividades = viajeSeleccionado(agencia).getOtros();
	     	                for (int i = 0; i < actividades.size(); i++) {
	     	                    if (actividades.get(i).getEventoId().equals(EventoIDSeleccionado)) {
	     	                    	 valido = Controlador.eliminarOtros(actividades.get(i));
	     	                    }
	     	                }model1.removeRow(rowIndex);
	                    }

	                    
	                   
	        		}else {
	        			System.out.println("errorrrrr");
	        		}
	        	}
	        });
	        btnEliminar2.setBounds(851, 444, 249, 77);
	        add(btnEliminar2);

	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(221, 37, 590, 236);
	        add(scrollPane);

	        table = new JTable(model);
	        scrollPane.setViewportView(table);
	        table.setDefaultEditor(Object.class, null);

	        JScrollPane scrollPane_1 = new JScrollPane();
	        scrollPane_1.setBounds(221, 317, 590, 236);
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
	 
	
}

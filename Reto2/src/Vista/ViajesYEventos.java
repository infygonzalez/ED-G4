package Vista;

import javax.swing.JPanel;
import javax.swing.JTable;
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
import Modelo.Otros;
import Modelo.Vuelo;


public class ViajesYEventos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table_1;
	private JFrame frame;
	private DefaultTableModel model;
	private DefaultTableModel model1;
	private controlador Controlador = new controlador();
	private JTable table;
	private int idAgencia;
	private String nombreID;
	/**
	 * Create the panel.
	 */

	        
	  public ViajesYEventos(Agencias agencia, Viaje viaje) {
	        this.idAgencia = idAgencia;
	        this.nombreID = nombreID;

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
	        btnNuevoViaje.setBounds(914, 141, 104, 23);
	        add(btnNuevoViaje);

	        JButton btnNuevoEvento = new JButton("Nuevo evento");
	        btnNuevoEvento.setBounds(914, 342, 104, 23);
	        add(btnNuevoEvento);

	        JButton btnGenerarOferta = new JButton("Generar oferta cliente");
	        btnGenerarOferta.setBounds(554, 467, 170, 23);
	        add(btnGenerarOferta);

	        JButton btnDesconectar = new JButton("Desconectar");
	        btnDesconectar.setBounds(874, 467, 117, 23);
	        add(btnDesconectar);

	        JButton btnEliminar1 = new JButton("");
	        btnEliminar1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		int rowIndex = table.getSelectedRow();
	        		if (rowIndex != -1) {
	        		    Controlador.eliminarViajeDeAgencia(agencia); 
	        		    //model.removeRow(rowIndex);
	        		}
	        	}
	        });
	        btnEliminar1.setBounds(874, 141, 30, 23);
	        add(btnEliminar1);

	        JButton btnEliminar2 = new JButton("");
	        btnEliminar2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		int rowIndex = table_1.getSelectedRow();
	        		if (rowIndex != -1) {
	        		    Controlador.eliminarEventoDeViajes(viaje); 
	        		    //model1.removeRow(rowIndex);
	        		}
	        	}
	        });
	        btnEliminar2.setBounds(874, 346, 30, 23);
	        add(btnEliminar2);

	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(414, 141, 450, 110);
	        add(scrollPane);

	        table = new JTable(model);
	        scrollPane.setViewportView(table);
	        table.setDefaultEditor(Object.class, null);

	        JScrollPane scrollPane_1 = new JScrollPane();
	        scrollPane_1.setBounds(414, 346, 450, 110);
	        add(scrollPane_1);

	        table_1 = new JTable(model1);
	        scrollPane_1.setViewportView(table_1);

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
	            model1.addRow(new Object[]{alojamiento.getNombre(), "Alojamiento", alojamiento.getFecEntrada(), alojamiento.getPrecio()});
	        }

	        ArrayList<Otros> otros = Controlador.buscarTodosOtros(viaje);
	        for (Otros otro : otros) {
	            model1.addRow(new Object[]{otro.getNombre(), "Actividades", otro.getFecha(), otro.getPrecio()});
	        }

	        ArrayList<Vuelo> vuelos = Controlador.buscarTodosVuelos(viaje);
	        for (Vuelo vuelo : vuelos) {
	            model1.addRow(new Object[]{vuelo.getNombre(), "Vuelo", vuelo.getFecSal(), vuelo.getPrecio()});
	        }
	 }
	 
	
}

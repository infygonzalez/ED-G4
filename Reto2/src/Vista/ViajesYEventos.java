package Vista;

import javax.swing.JPanel;
import javax.swing.JTable;
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

	        
	public ViajesYEventos(int idAgencia, String nombreID) {
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
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDesconectar.setBounds(874, 467, 117, 23);
		add(btnDesconectar);
		
		JButton btnEliminar1 = new JButton("");
		btnEliminar1.setBounds(874, 141, 30, 23);
		add(btnEliminar1);
		
		JButton btnEliminar2 = new JButton("");
		btnEliminar2.setBounds(874, 346, 30, 23);
		add(btnEliminar2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(414, 141, 450, 110);
		add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(414, 346, 450, 110);
		add(scrollPane_1);
		

		
		table_1 = new JTable(model1);
		scrollPane_1.setViewportView(table_1);
		table.setDefaultEditor(Object.class,null);
		rellenarTablaViajes();
		rellenarTablaEventos();

	}
	
	 private void rellenarTablaViajes() {
	        model.setRowCount(0);
	        ArrayList<Pais> pais = Controlador.buscarTodosPaises();

	        ArrayList<Viaje> viajes = Controlador.buscarTodosViajes(pais);

	        for (Viaje viaje:viajes) {
	            String[] fila = new String[100];
	            fila[0] = viaje.getViajesNombre();
	            fila[1] = viaje.getViajesTipo();
	            fila[2] = viaje.getViajesDuracion();
	            fila[3] = viaje.getViajesFechaInicio();
	            fila[4] = viaje.getViajesFechaFin();
	            fila[5] = viaje.getPais().getDescripcion();
	            model.addRow(fila);
	        }
	    }
	 
	 private void rellenarTablaEventos() {
	        model1.setRowCount(0);
	        ArrayList<Alojamiento> alojamientos = Controlador.buscarTodosAlojamientos();
	        for (Alojamiento alojamiento:alojamientos) {
	            String[] fila = new String[100];
	            fila[0] = alojamiento.getNombre();
	            fila[1] = "Alojamiento";
	            fila[2] = alojamiento.getFecEntrada();
	            fila[3] = alojamiento.getPrecio();
	            model1.addRow(fila);
	        }
	        ArrayList<Otros> otros = Controlador.buscarTodosOtros();
	        for (Otros otro:otros) {
	            String[] fila = new String[100];
	            fila[0] = otro.getNombre();
	            fila[1] = "Actividades";
	            fila[2] = otro.getFecha();
	            fila[3] = otro.getPrecio();
	            model1.addRow(fila);
	    }
	        ArrayList<Vuelo> vuelos = Controlador.buscarTodosVuelos();
	        for (Vuelo vuelo:vuelos) {
	            String[] fila = new String[100];
	            fila[0] = vuelo.getNombre();
	            fila[1] = "Alojamiento";
	            fila[2] = vuelo.getFecSal();
	            fila[3] = vuelo.getPrecio();
	            model1.addRow(fila);
	        }
	 }
	
}

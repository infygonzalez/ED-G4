package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.toedter.calendar.JCalendar;

import Modelo.Aeropuerto;
import Modelo.Agencias;
import Modelo.Gestor;
import Modelo.Pais;
import Modelo.Sesion;
import Modelo.Viaje;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import Controlador.controlador;
import javax.swing.DefaultComboBoxModel;

public class NuevoViaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textNombre;
	private JTextField textDuracion;
	private JTextField textDesc;
	private JTextField textServNo;
	private JDateChooser dateChooser_1;
	private JDateChooser dateChooser;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;

	/**
	 * Create the panel.
	 */
	public NuevoViaje(Agencias agencia, Viaje viaje, JFrame frame) {
		setLayout(null);
		
		JLabel lblNombreViaje = new JLabel("Nombre viaje");
		lblNombreViaje.setBounds(44, 34, 98, 14);
		add(lblNombreViaje);
		
		JLabel lblTipoViaje = new JLabel("Tipo de viaje");
		lblTipoViaje.setBounds(44, 75, 86, 14);
		add(lblTipoViaje);
		
		JCalendar calendar = new JCalendar();
        int año = calendar.getCalendar().get(Calendar.YEAR);
        int mes = calendar.getCalendar().get(Calendar.MONTH);
        int dia = calendar.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fecha = dia+"-"+mes+"-"+año;
        System.out.print(fecha);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Inicio");
		lblNewLabel_2.setBounds(44, 114, 86, 14);
		add(lblNewLabel_2);
		
		JLabel lblDias = new JLabel("Dias");
		lblDias.setBounds(44, 188, 46, 14);
		add(lblDias);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(44, 233, 46, 14);
		add(lblPais);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(44, 272, 98, 14);
		add(lblDescripcion);
		
		JLabel lblServNoIncluidos = new JLabel("Servicios no incluidos");
		lblServNoIncluidos.setBounds(44, 336, 115, 14);
		add(lblServNoIncluidos);
		
		textNombre = new JTextField();
		textNombre.setBounds(169, 31, 86, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Novios", "Senior", "Grupos", "Grandes viajes(destinos exoticos)", "Combinado(vuelo+hotel)", "Escapadas", "Familias con niños menores"}));
		comboBox_2.setBounds(169, 71, 86, 18);
		add(comboBox_2);
		
		textDuracion = new JTextField();
		textDuracion.setBounds(169, 185, 86, 20);
		add(textDuracion);
		textDuracion.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(169, 231, 86, 18);
		add(comboBox_1);
		
		textDesc = new JTextField();
		textDesc.setBounds(169, 269, 259, 53);
		add(textDesc);
		textDesc.setColumns(10);
		
		textServNo = new JTextField();
		textServNo.setBounds(169, 336, 259, 53);
		add(textServNo);
		textServNo.setColumns(10);
		
		llenarComboBoxPaises(comboBox_1);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(171, 114, 86, 20);
		add(dateChooser);
		
		JLabel lblNewLabel = new JLabel("Fecha de fin");
		lblNewLabel.setBounds(44, 151, 86, 14);
		add(lblNewLabel);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(169, 145, 86, 20);
		add(dateChooser_1);
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        java.util.Date fechaInicio = dateChooser.getDate();
		        java.util.Date fechaFin = dateChooser_1.getDate();

		        
		        String paisId = getPaisIdSeleccionado();
		        
		        insertarViaje(
		        	agencia,
		        	paisId,
		            textNombre.getText(),
		            textDesc.getText(),
		            String.valueOf(comboBox_2.getSelectedItem()), 
		            fechaInicio,  
		            fechaFin,    
		            "", 
		            textServNo.getText()
		            
		        );
		        JOptionPane.showMessageDialog(null, "Operación realizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
		        frame.setContentPane(new ViajesYEventos(agencia, viaje, frame));
                frame.revalidate();
                frame.repaint();
		    }
		    
		});
		btnGuardar.setBounds(82, 416, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                frame.setContentPane(new ViajesYEventos(agencia, viaje, frame));
                frame.revalidate();
                frame.repaint();
			}
		});
		btnCancelar.setBounds(273, 416, 89, 23);
		add(btnCancelar);

	
		
		
        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                calcularDiferenciaDias();
            }
        };

        dateChooser.addPropertyChangeListener("date", listener);
        dateChooser_1.addPropertyChangeListener("date", listener);
    
	}
	private ArrayList<Pais> listaPaises;
	
	private String getPaisIdSeleccionado() {
	    int selectedIndex = comboBox_1.getSelectedIndex();
	    if (selectedIndex >= 0 && selectedIndex < listaPaises.size()) {
	        return listaPaises.get(selectedIndex).getCodPais(); 
	    }
	    return null; 
	}
	
	public void llenarComboBoxPaises(JComboBox<String> comboBox) {
	    Gestor gestor = new Gestor();
	    listaPaises = gestor.buscarTodosPaises();
	    
	    comboBox.removeAllItems(); // Limpiar el comboBox antes de llenarlo

	    for (Pais pais : listaPaises) {
	        comboBox.addItem(pais.getDescripcion()); // Suponiendo que quieres mostrar el nombre del país
	    }
	}
	
	
	private int calcularDiferenciaDias() {
	    if (dateChooser.getDate() != null && dateChooser_1.getDate() != null) {
	        LocalDate inicio = dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        LocalDate fin = dateChooser_1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        
	        if (inicio.isAfter(fin)) {
	            JOptionPane.showMessageDialog(this, "La fecha de inicio no puede ser posterior a la fecha de fin.", "Error", JOptionPane.WARNING_MESSAGE);
	            textDuracion.setText("");  // Limpiar el campo
	            dateChooser_1.setDate(null); 
	            return 0;  
	        }

	        long diasDiferencia = ChronoUnit.DAYS.between(inicio, fin);
	        textDuracion.setText(String.valueOf(diasDiferencia));  // Solo se muestra en el textDuracion
	        return (int) diasDiferencia;
	    } else {
	        textDuracion.setText("");  // Si falta alguna fecha, limpiar el campo
	        return 0;
	    }
	}
	
	
	private String convertirFechaADatabaseFormat(java.util.Date date) {
	    if (date != null) {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        return sdf.format(date);
	    }
	    return null; 
	}
	
	
	private void insertarViaje(Agencias agencia,String paisId, String nombre, String descripcion, String tipo, java.util.Date fechaInicio, java.util.Date fechaFin, String duracion, String servNo) {
	    String fechaInicioFormatted = convertirFechaADatabaseFormat(fechaInicio);
	    String fechaFinFormatted = convertirFechaADatabaseFormat(fechaFin);
	    
	    Viaje viaje = new Viaje();
	    viaje.setAgenciaId(Integer.parseInt(agencia.getAgenciaId()));
	    viaje.setPaisId(paisId);
	    viaje.setViajesNombre(nombre);
	    viaje.setViajesDescripcion(descripcion);
	    viaje.setViajesTipo(tipo);
	    viaje.setViajesFechaInicio(fechaInicioFormatted); 
	    viaje.setViajesFechaFin(fechaFinFormatted);  
	    viaje.setViajesDuracion(duracion);
	    viaje.setViajesDescServNo(servNo);
	    controlador.insertarViaje(viaje);
	}
}

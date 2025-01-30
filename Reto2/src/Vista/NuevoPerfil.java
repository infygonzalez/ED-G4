package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Modelo.*;
import Controlador.*;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;

public class NuevoPerfil extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textNombre;
	private JTextField textColor;
	private JTextField textLogo;
	private JFrame frame;
	private JLabel lblNombre;
	private JLabel lblColor;
	private JLabel lblNumeroEmpleados;
	private JLabel lblTipoAgencia;
	private JLabel lblLogo;
	private JComboBox comboEmple;
	private JComboBox comboTipo;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JLabel lblContraseña;
	private JTextField textContraseña;

	/**
	 * Create the panel.
	 */
	public NuevoPerfil(JFrame frame) {	
		
		this.frame=frame;
		
		setLayout(null);
		
		lblNombre = new JLabel("Nombre agencia");
		lblNombre.setBounds(45, 33, 104, 14);
		add(lblNombre);
		
		lblColor = new JLabel("Color marca");
		lblColor.setBounds(45, 72, 104, 14);
		add(lblColor);
		
		lblNumeroEmpleados = new JLabel("Numero de empleados");
		lblNumeroEmpleados.setBounds(45, 110, 117, 14);
		add(lblNumeroEmpleados);
		
		lblTipoAgencia = new JLabel("Tipo de agencia");
		lblTipoAgencia.setBounds(45, 148, 104, 14);
		add(lblTipoAgencia);
		
		lblLogo = new JLabel("Logo");
		lblLogo.setBounds(45, 192, 46, 14);
		add(lblLogo);
		
		textNombre = new JTextField();
		textNombre.setBounds(172, 30, 86, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		textColor = new JTextField();
		textColor.setBounds(172, 69, 86, 20);
		add(textColor);
		textColor.setColumns(10);
		
		comboEmple = new JComboBox();
		comboEmple.setModel(new DefaultComboBoxModel(new String[] {"2-10", "10-100", "100-1000"}));
		comboEmple.setBounds(172, 106, 86, 22);
		add(comboEmple);
		
		comboTipo = new JComboBox();
		comboTipo.setModel(new DefaultComboBoxModel(new String[] {"minorista", "mayorista", "mayorista-minorista"}));
		comboTipo.setBounds(172, 144, 86, 22);
		add(comboTipo);
		
		textLogo = new JTextField();
		textLogo.setBounds(172, 189, 200, 20);
		add(textLogo);
		textLogo.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarAgencia(textNombre.getText(), textColor.getText(), String.valueOf(comboEmple.getSelectedItem()), String.valueOf(comboTipo.getSelectedItem()), textLogo.getText(), textContraseña.getText());

			}
		});
		
		
		
		
		btnGuardar.setBounds(73, 266, 89, 23);
		add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(253, 266, 89, 23);
		add(btnCancelar);
		
		lblContraseña = new JLabel("Contraseña");
		lblContraseña.setBounds(45, 226, 104, 14);
		add(lblContraseña);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(172, 220, 86, 20);
		add(textContraseña);
		textContraseña.setColumns(10);

	}
	private void insertarAgencia(String nombre, String color, String comboEmple, String comboTipo, String logo, String contraseña) {
		
		Agencias agencia = new Agencias();
    	agencia.setAgenciaNombre(nombre);
    	agencia.setAgenciaColorMarca(color);
    	agencia.setAgenciaNumEmple(comboEmple);
    	agencia.setAgenciaTipo(comboTipo);
    	agencia.setAgenciaLogo(logo);
    	agencia.setContraseña(contraseña);
    	controlador.insertarAgencia(agencia);
		
	}
}

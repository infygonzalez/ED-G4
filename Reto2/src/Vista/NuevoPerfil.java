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
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

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
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblNombre.setBounds(62, 94, 267, 71);
		add(lblNombre);
		
		lblColor = new JLabel("Color marca");
		lblColor.setForeground(Color.BLACK);
		lblColor.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblColor.setBounds(62, 368, 267, 71);
		add(lblColor);
		
		lblNumeroEmpleados = new JLabel("Numero de empleados");
		lblNumeroEmpleados.setForeground(Color.BLACK);
		lblNumeroEmpleados.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblNumeroEmpleados.setBounds(681, 94, 292, 71);
		add(lblNumeroEmpleados);
		
		lblTipoAgencia = new JLabel("Tipo de agencia");
		lblTipoAgencia.setForeground(Color.BLACK);
		lblTipoAgencia.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblTipoAgencia.setBounds(681, 220, 267, 71);
		add(lblTipoAgencia);
		
		lblLogo = new JLabel("Logo");
		lblLogo.setForeground(Color.BLACK);
		lblLogo.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblLogo.setBounds(681, 368, 267, 71);
		add(lblLogo);
		
		textNombre = new JTextField();
		textNombre.setBounds(339, 111, 258, 45);
		add(textNombre);
		textNombre.setColumns(10);
		
		textColor = new JTextField();
		textColor.setBounds(339, 385, 258, 45);
		add(textColor);
		textColor.setColumns(10);
		
		comboEmple = new JComboBox();
		comboEmple.setModel(new DefaultComboBoxModel(new String[] {"2-10", "10-100", "100-1000"}));
		comboEmple.setBounds(958, 102, 259, 62);
		add(comboEmple);
		
		comboTipo = new JComboBox();
		comboTipo.setModel(new DefaultComboBoxModel(new String[] {"minorista", "mayorista", "mayorista-minorista"}));
		comboTipo.setBounds(958, 228, 258, 62);
		add(comboTipo);
		
		textLogo = new JTextField();
		textLogo.setBounds(958, 385, 258, 45);
		add(textLogo);
		textLogo.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(255, 160, 122));
		btnGuardar.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarAgencia(textNombre.getText(), textColor.getText(), String.valueOf(comboEmple.getSelectedItem()), 
						String.valueOf(comboTipo.getSelectedItem()), textLogo.getText(), textContraseña.getText());
				
				
				login login = new login(frame);
				frame.setContentPane(login);
                frame.revalidate(); 
                repaint();
				
			}
		});
		
		
		
		
		btnGuardar.setBounds(225, 533, 292, 120);
		add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(255, 160, 122));
		btnCancelar.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login(frame);
				frame.setContentPane(login);
                frame.revalidate(); 
                repaint();
			}
		});
		btnCancelar.setBounds(732, 533, 292, 120);
		add(btnCancelar);
		
		lblContraseña = new JLabel("Contraseña");
		lblContraseña.setForeground(Color.BLACK);
		lblContraseña.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblContraseña.setBounds(62, 220, 272, 71);
		add(lblContraseña);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(339, 237, 258, 45);
		add(textContraseña);
		textContraseña.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/fondo blur.jpg"));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		add(lblNewLabel);

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

package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.controlador;
import Modelo.Agencias;
import Modelo.Gestor;
import Modelo.Sesion;
import Modelo.Viaje;

import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Vista.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;



public class login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textUsuario;
	private JButton btnInicioSesion;
	private JButton btnNuevaAgencia;
	private JLabel lblContraseña;
	private JLabel lblUsuario;
	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField textContraseña;

	/**
	 * Create the panel.
	 */
	public login(JFrame frame) {
		
		 this.frame = frame;
		
		setBackground(new Color(153, 204, 255));
		setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.BLACK);
		lblUsuario.setBounds(354, 289, 210, 64);
		add(lblUsuario);
		lblUsuario.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblUsuario.setBackground(Color.GREEN);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(594, 306, 258, 31);
		add(textUsuario);
		textUsuario.setColumns(10);
		
		lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(354, 345, 210, 64);
		add(lblContraseña);
		lblContraseña.setFont(new Font("Eras Demi ITC", Font.PLAIN, 24));
		lblContraseña.setBackground(Color.GREEN);
		lblContraseña.setForeground(Color.BLACK);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(594, 363, 258, 31);
		add(textContraseña);
		textContraseña.setColumns(10);
		
		btnInicioSesion = new JButton("Iniciar sesion");
		btnInicioSesion.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		btnInicioSesion.setBounds(308, 451, 204, 69);
		add(btnInicioSesion);
		btnInicioSesion.setBackground(new Color(255, 160, 122));
		btnInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agencias agencia= new Agencias();
				Gestor gestor = new Gestor();


				comprobarAgencia(textUsuario.getText(), textContraseña.getText(), agencia, gestor);
				
				
			 
			}

		});
		
		btnNuevaAgencia = new JButton("Nueva agencia");
		btnNuevaAgencia.setFont(new Font("Eras Demi ITC", Font.PLAIN, 22));
		btnNuevaAgencia.setBounds(688, 451, 204, 69);
		add(btnNuevaAgencia);
		btnNuevaAgencia.setBackground(new Color(255, 160, 122));
		btnNuevaAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoPerfil nuevoPerfil = new NuevoPerfil(frame);
				frame.setContentPane(nuevoPerfil);
                frame.revalidate(); 
                frame.repaint();   
			}
		});
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/fondo blur.jpg"));
		lblNewLabel.setBounds(0, 0, 1290, 717);
		add(lblNewLabel);

	}
	private void comprobarAgencia(String textUsuario, String textContraseña, Agencias agencia, Gestor gestor) {
	    agencia.setAgenciaNombre(textUsuario);
	    agencia.setContraseña(textContraseña);
	    Agencias agenciaLogin = gestor.comprobarAgencia(agencia);
	    
	    if (agenciaLogin !=null) {  
	        int id = gestor.autentificarAgencia(textUsuario, textContraseña);  
	        if (id != -1) {
	            Sesion.setIdAgencia(id);
	            System.out.println("Sesion iniciada con ID: " + Sesion.getIdAgencia());
	            
	             } else {
	            System.out.println("Credenciales incorrectas");
	        }
	    		

	            String nombreID = gestor.nombreAgencia(id);

	            
	            ViajesYEventos frame2 = new ViajesYEventos(agencia);
	            frame.setContentPane(frame2);
	            frame.revalidate();
	            frame.repaint();

	       
	    } else {
	        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.WARNING_MESSAGE);
	    }
	}
}

package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.controlador;
import Modelo.Agencias;
import Modelo.Gestor;

import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Vista.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;



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
	private JPanel panel;
	private JLabel lblMensaje;

	/**
	 * Create the panel.
	 */
	public login(JFrame frame) {
		
		 this.frame = frame;
		
		setBackground(new Color(153, 204, 255));
		setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBackground(new Color(255, 0, 0));
		lblUsuario.setBounds(105, 111, 66, 14);
		add(lblUsuario);
		
		lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBackground(Color.GREEN);
		lblContraseña.setForeground(Color.BLACK);
		lblContraseña.setBounds(105, 136, 80, 14);
		add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(195, 108, 86, 20);
		add(textUsuario);
		textUsuario.setColumns(10);
		
		btnInicioSesion = new JButton("Iniciar sesion");
		btnInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agencias agencia= new Agencias();
				Gestor gestor = new Gestor();
				
				comprobarAgencia(textUsuario.getText(), textContraseña.getText(), agencia, gestor);
				
				
			 
			}

		});
		btnInicioSesion.setBounds(59, 181, 126, 23);
		add(btnInicioSesion);
		
		btnNuevaAgencia = new JButton("Nueva agencia");
		btnNuevaAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoPerfil nuevoPerfil = new NuevoPerfil(frame);
				frame.setContentPane(nuevoPerfil);
                frame.revalidate(); 
                frame.repaint();   
			}
		});
		btnNuevaAgencia.setBounds(219, 181, 133, 23);
		add(btnNuevaAgencia);
		
		panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(0, 83, 455, 148);
		add(panel);
		panel.setLayout(null);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(195, 51, 86, 20);
		panel.add(textContraseña);
		textContraseña.setColumns(10);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(59, 242, 293, 28);
		add(lblMensaje);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/pruebass.png"));
		lblNewLabel.setBounds(0, 0, 455, 309);
		add(lblNewLabel);

	}
	private void comprobarAgencia(String textUsuario, String textContraseña, Agencias agencia, Gestor gestor) {
		
		agencia.setAgenciaNombre(textUsuario);
		agencia.setContraseña(textContraseña);
			if (gestor.comprobarAgencia(agencia)==true) {
				
				
				lblMensaje.setText("Inicio de sesion correcto");

				ViajesYEventos frame2 = new ViajesYEventos(frame);

				frame.setContentPane(new ViajesYEventos(frame));
				frame.revalidate();
				frame.repaint();

			} else {

				lblMensaje.setText("Error, Usuario o contraseña incorrectos");
			}

			
			
		
	}
}

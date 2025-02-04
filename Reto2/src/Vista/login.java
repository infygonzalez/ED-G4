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
		
		panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(0, 242, 1280, 195);
		add(panel);
		panel.setLayout(null);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(600, 75, 86, 20);
		panel.add(textContraseña);
		textContraseña.setColumns(10);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(509, 49, 66, 14);
		panel.add(lblUsuario);
		lblUsuario.setBackground(new Color(255, 0, 0));
		
		textUsuario = new JTextField();
		textUsuario.setBounds(599, 46, 86, 20);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(509, 74, 80, 14);
		panel.add(lblContraseña);
		lblContraseña.setBackground(Color.GREEN);
		lblContraseña.setForeground(Color.BLACK);
		
		btnInicioSesion = new JButton("Iniciar sesion");
		btnInicioSesion.setBounds(463, 119, 126, 23);
		panel.add(btnInicioSesion);
		
		btnNuevaAgencia = new JButton("Nueva agencia");
		btnNuevaAgencia.setBounds(623, 119, 133, 23);
		panel.add(btnNuevaAgencia);
		btnNuevaAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoPerfil nuevoPerfil = new NuevoPerfil(frame);
				frame.setContentPane(nuevoPerfil);
                frame.revalidate(); 
                frame.repaint();   
			}
		});
		btnInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agencias agencia= new Agencias();
				Gestor gestor = new Gestor();


				comprobarAgencia(textUsuario.getText(), textContraseña.getText(), agencia, gestor);
				
				
			 
			}

		});
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(59, 242, 293, 28);
		add(lblMensaje);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/fondoInicio.png"));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		add(lblNewLabel);

	}
	private void comprobarAgencia(String textUsuario, String textContraseña, Agencias agencia, Gestor gestor) {
	    agencia.setAgenciaNombre(textUsuario);
	    agencia.setContraseña(textContraseña);
	    
	    if (gestor.comprobarAgencia(agencia)) {  
	        int id = gestor.autentificarAgencia(textUsuario, textContraseña);  
	        if (id != -1) {
	            Sesion.setIdAgencia(id);
	            System.out.println("Sesion iniciada con ID: " + Sesion.getIdAgencia());
	    		agencia.setAgenciaId(Sesion.getIdAgencia()+"");

	            String nombreID = gestor.nombreAgencia(id);

	            
	            ViajesYEventos frame2 = new ViajesYEventos(agencia);
	            frame.setContentPane(frame2);
	            frame.revalidate();
	            frame.repaint();

	        } else {
	            System.out.println("Credenciales incorrectas");
	        }
	    } else {
	        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.WARNING_MESSAGE);
	    }
	}
}

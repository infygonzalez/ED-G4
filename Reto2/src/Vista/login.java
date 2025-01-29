package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Vista.*;
import javax.swing.JFrame;



public class login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnInicioSesion;
	private JButton btnNuevaAgencia;
	private JLabel lblContraseña;
	private JLabel lblUsuario;
	private JFrame frame;

	/**
	 * Create the panel.
	 */
	public login(JFrame frame) {
		
		 this.frame = frame;
		
		setBackground(new Color(153, 204, 255));
		setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(105, 111, 66, 14);
		add(lblUsuario);
		
		lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(105, 136, 80, 14);
		add(lblContraseña);
		
		textField = new JTextField();
		textField.setBounds(195, 108, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(195, 134, 86, 20);
		add(passwordField);
		
		btnInicioSesion = new JButton("Iniciar sesion");
		btnInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViajesYEventos prueba = new ViajesYEventos();
				frame.setContentPane(prueba);
                frame.revalidate(); 
                frame.repaint();   
			 
			}

		});
		btnInicioSesion.setBounds(59, 181, 126, 23);
		add(btnInicioSesion);
		
		btnNuevaAgencia = new JButton("Nueva agencia");
		btnNuevaAgencia.setBounds(219, 181, 133, 23);
		add(btnNuevaAgencia);

	}
}

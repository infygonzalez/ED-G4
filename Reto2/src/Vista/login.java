package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textUsuario;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public login() {
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(942, 496, 73, 14);
		add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(1025, 493, 86, 20);
		add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(942, 521, 73, 14);
		add(lblContraseña);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(1025, 518, 86, 20);
		add(passwordField);

	}
}

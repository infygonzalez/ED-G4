package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Vista.login;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblinicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				setContentPane(login);
                revalidate(); 
                repaint();   
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\in1dm3-a\\Downloads\\1634194794236.jpg"));
		btnNewButton.setBounds(-76, 0, 2072, 1041);
		contentPane.add(btnNewButton);
		
		lblinicio = new JLabel("Bienvenido/a \r\nClick para comenzar");
		lblinicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblinicio.setForeground(Color.BLACK);
		lblinicio.setBounds(612, 425, 449, 231);
		contentPane.add(lblinicio);
	}
}

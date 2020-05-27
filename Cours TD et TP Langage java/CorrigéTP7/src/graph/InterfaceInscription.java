package graph;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceInscription extends JFrame {
	private JPanel contentPane;
	private JTextField textlogin;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceInscription frame = new InterfaceInscription(); // Créer l'objet fenêtre pour créer un nouveau compte
					frame.setVisible(true); // afficher la fenêtre
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceInscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrer = new JButton("Créer");
		btnCrer.addActionListener(new ActionListener() { //la méthode qui fait l'écoute et envoie l'événement (clic sue le bouton Créer) moment du clic sur le bouton Créer à la méthode Actionperformed. 
			public void actionPerformed(ActionEvent e) { // la méthode qui s'exécute au moment du clic sur le bouton Créer. 
				Account X= new Account(textlogin.getText(),String.valueOf(textPassword.getPassword())); // créer un nouveau objet de la classe Account(nouveau compte) qui porte comme login et password le texte qui a été saisi dans la zone de texte login et celle du password respectivement.
				new Collectionaccount().Ajouter(X); // Appliquer la méthode ajouter un nouveau compte sur la collection d'objets comptes  
			}
		});
		btnCrer.setBounds(59, 195, 89, 23);
		contentPane.add(btnCrer);
		
		JButton btnQuitter = new JButton("quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();	//méthode pour fermer la fenêtre 
			}
		});
		btnQuitter.setBounds(268, 195, 89, 23);
		contentPane.add(btnQuitter);
		
		JLabel lblLogin = new JLabel("login");
		lblLogin.setBounds(35, 42, 70, 14);
		contentPane.add(lblLogin);
		
		textlogin = new JTextField();
		textlogin.setBounds(115, 39, 86, 20);
		contentPane.add(textlogin);
		textlogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(35, 81, 70, 14);
		contentPane.add(lblPassword);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(125, 78, 76, 20);
		contentPane.add(textPassword);
	}
}

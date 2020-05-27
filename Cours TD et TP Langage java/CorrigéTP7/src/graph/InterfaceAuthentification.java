package graph;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class InterfaceAuthentification {

	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceAuthentification window = new InterfaceAuthentification(); // Créer l'objet : fenêtre de l'authentification
					window.frame.setVisible(true); // afficher la fenêtre
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceAuthentification() { //constructeur de l'objet fenêtre
		initialize(); } 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("TextPane.selectionBackground"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Fermer");
		btnNewButton.setBounds(297, 181, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(82, 181, 89, 23);
		btnLogin.addActionListener(new ActionListener() { //la méthode qui fait l'écoute et envoie l'événement (clic sue le bouton login) moment du clic sur le bouton Login à la méthode Actionperformed. 
			public void actionPerformed(ActionEvent e) { // la méthode qui s'exécute au moment du clic sur le bouton Login. 
			Account X= new Account(textLogin.getText(),String.valueOf(textPassword.getPassword())); // instancier un objet de la classe Account qui porte comme login et password le texte qui a été saisi dans la zone de texte login et celle du password respectivement.
	        	new Collectionaccount().verifyAccount(X); // vérifier login et password qui ont été saisi par l'utilisateur pour s'authetifier.
	           }});
		frame.getContentPane().add(btnLogin);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(21, 36, 63, 14);
		lblLogin.setForeground(UIManager.getColor("TextPane.inactiveBackground"));
		frame.getContentPane().add(lblLogin);
		
		textLogin = new JTextField();
		textLogin.setBounds(106, 33, 86, 20);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(21, 97, 63, 14);
		lblPassword.setForeground(UIManager.getColor("TextPane.inactiveBackground"));
		frame.getContentPane().add(lblPassword);
		
		JButton btnSinscrire = new JButton("S'inscrire");
		btnSinscrire.setBounds(297, 51, 89, 23);
		btnSinscrire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InterfaceInscription().setVisible(true);
			}
		});
		frame.getContentPane().add(btnSinscrire);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(106, 94, 86, 20);
		frame.getContentPane().add(textPassword);
		
	}
		}

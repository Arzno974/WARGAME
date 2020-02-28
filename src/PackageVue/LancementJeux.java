package PackageVue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import packageControleur.Controleur;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LancementJeux extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Controleur controle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LancementJeux frame = new LancementJeux(controle);
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
	public LancementJeux(Controleur controle) {
		this.controle = controle;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NewServer = new JLabel("Créer un nouveau serveur :");
		NewServer.setBounds(75, 15, 193, 15);
		contentPane.add(NewServer);
		
		JButton btnDmarrer = new JButton("Démarrer");
		btnDmarrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicBtnDemarrer();
			}

			private void clicBtnDemarrer() {
				this.controle.evenementVue;
				//System.out.println("clic pour démarrer");				
			}
		});
		btnDmarrer.setBounds(273, 10, 101, 25);
		contentPane.add(btnDmarrer);
		
		JLabel SeConnecter = new JLabel("Se connecter à un serveur existant :");
		SeConnecter.setBounds(95, 65, 257, 15);
		contentPane.add(SeConnecter);
		
		JLabel IpServeur = new JLabel("IP serveur :");
		IpServeur.setBounds(12, 108, 90, 25);
		contentPane.add(IpServeur);
		
		JButton btnSeConnecter = new JButton("Se connecter");
		btnSeConnecter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicBtnConnecter();
			}

			private void clicBtnConnecter() {
				System.out.println("Clic pour te connecter");
			}
		});
		btnSeConnecter.setBounds(273, 108, 127, 25);
		contentPane.add(btnSeConnecter);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				clicBtnQuitter();
			}

			private void clicBtnQuitter() {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(151, 169, 117, 25);
		contentPane.add(btnQuitter);
		
		textField = new JTextField();
		textField.setText("127.0.0.1");
		textField.setBounds(105, 111, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

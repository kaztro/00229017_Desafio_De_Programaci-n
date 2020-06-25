import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class Interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\germa\\eclipse-workspace\\Desafio\\imgs\\app_images\\unnamed.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btn_entrar = new JButton("Entrar");
		btn_entrar.setBounds(5, 233, 424, 23);
		btn_entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btn_entrar);
		
		JLabel lbl_bienvenida = new JLabel("\u00A1Bienvenido!");
		lbl_bienvenida.setBounds(5, 5, 424, 14);
		lbl_bienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_bienvenida);
		
		JLabel lbl_desafio_progra = new JLabel("DESAFIO DE PROGRAMACI\u00D3N");
		lbl_desafio_progra.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_desafio_progra.setBounds(141, 30, 151, 14);
		contentPane.add(lbl_desafio_progra);
		
		JLabel lbl_background = new JLabel("New label");
		lbl_background.setIcon(new ImageIcon("C:\\Users\\germa\\eclipse-workspace\\Desafio\\imgs\\app_images\\logo uca.png"));
		lbl_background.setBounds(86, 75, 272, 74);
		contentPane.add(lbl_background);
	}
}

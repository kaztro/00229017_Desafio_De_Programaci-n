import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		setType(Type.UTILITY);
		setTitle("Bienvenido al Desafio de Programaci\u00F3n de SIMU");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("unnamed.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 305);
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
		
		JLabel lbl_background = new JLabel(new ImageIcon(getClass().getResource("logo uca.png")));
		lbl_background.setBounds(70, 73, 297, 93);
		contentPane.add(lbl_background);
	}
}

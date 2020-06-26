import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Interfaz() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Bienvenido al Desafio de Programaci\u00F3n de SIMU");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 455, 305);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JButton btn_entrar = new JButton("Entrar");
		btn_entrar.setBounds(5, 233, 424, 23);
		btn_entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Visor open = new Visor();
				open.setVisible(true);
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
		
		JLabel lbl_background = new JLabel(new ImageIcon(Interfaz.class.getResource("/images/logo uca.png")));
		lbl_background.setBounds(70, 55, 297, 93);
		contentPane.add(lbl_background);
		
		JButton btnNewButton = new JButton("\u00BFQu\u00E9 estoy viendo?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "En términos generales, cada estudiante construirá un software interactivo a su creatividad y originalidad\r\n" + 
						"que exponga el proceso completo de aplicación del MEF a un sistema de ecuaciones.");
			}
		});
		btnNewButton.setBounds(175, 179, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/images/2670393.jpg")));
		lblNewLabel.setBounds(0, 0, 439, 266);
		contentPane.add(lblNewLabel);
	}
}

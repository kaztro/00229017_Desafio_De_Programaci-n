import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visor extends javax.swing.JFrame {

	private JPanel contentPane;
	
	ImageIcon Imagen[] = new ImageIcon[13];
	int cont = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visor frame = new Visor();
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
	public Visor() {
		setTitle("Visor de im\u00E1genes");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 718, 429);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		for(int i = 1; i < 12; i++) {
			Imagen[i] = new ImageIcon(getClass().getResource("/images/img_" + i + ".jpg"));
		}
		lblNewLabel.setIcon(Imagen[1]);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont == 1) {
					cont = 11;
				} cont--;
				lblNewLabel.setIcon(Imagen[cont]);
			}
		});
		btnNewButton.setBounds(10, 460, 173, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Seguir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont == 11) {
					cont = 0;
				} cont++;
				lblNewLabel.setIcon(Imagen[cont]);
			}
		});
		btnNewButton_1.setBounds(544, 460, 173, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Visor.class.getResource("/images/2670393.jpg")));
		lblNewLabel_1.setBounds(0, 0, 738, 508);
		contentPane.add(lblNewLabel_1);
	}
}

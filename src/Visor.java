import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Visor extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	ImageIcon Imagen[] = new ImageIcon[21/*13*/];
	int cont = 1;

	public Visor() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Visor de im\u00E1genes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 754, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 718, 429);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		for(int i = 1; i < 21; i++) {
			Imagen[i] = new ImageIcon(getClass().getResource("/images/img_" + i + ".png"));
		}
		lblNewLabel.setIcon(Imagen[1]);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont == 1) {
					cont = 21;
				} cont--;
				lblNewLabel.setIcon(Imagen[cont]);
			}
		});
		btnNewButton.setBounds(10, 460, 173, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Seguir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont == 21) {
					cont = 0;
				} cont++;
				lblNewLabel.setIcon(Imagen[cont]);
			}
		});
		btnNewButton_1.setBounds(544, 460, 173, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Visor.class.getResource("/images/9874.png")));
		lblNewLabel_1.setBounds(0, 0, 738, 508);
		contentPane.add(lblNewLabel_1);
	}
}

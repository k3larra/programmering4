import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AnnaLindhsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnnaLindhsPl;
	private JTextField bussFem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnnaLindhsGUI frame = new AnnaLindhsGUI();
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
	public AnnaLindhsGUI() {
	setPreferredSize(new Dimension(1920, 1080));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(1920, 1080, 1920, 1080));
		contentPane.setMinimumSize(new Dimension(1920, 1080));
		contentPane.setMaximumSize(new Dimension(1920, 1080));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAnnaLindhsPl = new JTextField();
		txtAnnaLindhsPl.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnnaLindhsPl.setBorder(null);
		txtAnnaLindhsPl.setForeground(Color.WHITE);
		txtAnnaLindhsPl.setFont(new Font("Rockwell", Font.PLAIN, 40));
		txtAnnaLindhsPl.setText("Anna Lindhs Pl.");
		txtAnnaLindhsPl.setBackground(Color.RED);
		txtAnnaLindhsPl.setBounds(300, 33, 1297, 87);
		contentPane.add(txtAnnaLindhsPl);
		txtAnnaLindhsPl.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mot");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(370, 187, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Avgår");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(740, 181, 71, 28);
		contentPane.add(lblNewLabel_2);
		
		bussFem = new JTextField();
		bussFem.setCaretColor(Color.LIGHT_GRAY);
		bussFem.setBounds(318, 210, 556, 72);
		contentPane.add(bussFem);
		bussFem.setColumns(10);
		
		
		
		JTextArea AvgangRutaTva = new JTextArea();
		AvgangRutaTva.setBackground(Color.WHITE);
		AvgangRutaTva.setBounds(1000, 161, 587, 644);
		contentPane.add(AvgangRutaTva);
		
		JTextArea AvgangRutaEtt = new JTextArea();
		AvgangRutaEtt.setBackground(Color.WHITE);
		AvgangRutaEtt.setBounds(300, 161, 587, 644);
		contentPane.add(AvgangRutaEtt);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setIcon(new ImageIcon(AnnaLindhsGUI.class.getResource("/img/raps.jpg")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Label;

public class SkaneGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkaneGUI frame = new SkaneGUI();
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
	public SkaneGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1920, 1080, 1920, 1080));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(274, 117, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.RED);
		canvas.setBounds(217, 76, 1431, 100);
		contentPane.add(canvas);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SkaneGUI.class.getResource("/images/raps.jpg")));
		lblNewLabel.setMinimumSize(new Dimension(1920, 1080));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
	}
}

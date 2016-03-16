package se.mah.k3.grupp4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class Gui2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui2 frame = new Gui2();
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
	public Gui2() {
		
		setBackground(Color.GRAY);Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = 1920;//screenSize.getWidth();
		double height = 1080;//screenSize.getHeight();

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 1829, 1086);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(640, 361, 100, 51);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(767, 361, 100, 51);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(767, 479, 100, 51);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(640, 479, 100, 51);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(767, 602, 100, 51);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(640, 602, 100, 51);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(767, 722, 100, 51);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(640, 722, 100, 51);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(767, 846, 100, 51);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(640, 846, 100, 51);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(0, 151, 100, 51);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(1542, 361, 100, 51);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(1668, 361, 100, 51);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setBounds(1669, 479, 100, 51);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(1542, 479, 100, 51);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(1669, 602, 100, 51);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setBounds(1542, 602, 100, 51);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setBounds(1669, 722, 100, 51);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setBounds(1542, 722, 100, 51);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(1669, 846, 100, 51);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(1542, 846, 100, 51);
		contentPane.add(label_20);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1953, 1079);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Mock Up");
		scrollPane.setViewportView(lblNewLabel);
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setIcon(new ImageIcon(Gui2.class.getResource("img/mockUp.jpg")));
		

	}
}

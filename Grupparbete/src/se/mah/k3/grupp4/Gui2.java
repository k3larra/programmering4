package se.mah.k3.grupp4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Gui2 extends JFrame {

	private JPanel contentPane;
	private static JLabel label;
	private static JLabel label_1;
	private static JLabel label_2;
	private static JLabel label_3;
	private static JLabel label_4;
	private static JLabel label_5;
	private static JLabel label_6;
	private static JLabel label_7;
	private static JLabel label_8;
	private static JLabel label_9;
	private static JLabel label_Clock;
	private static JLabel label_11;
	private static JLabel label_12;
	private static JLabel label_13;
	private static JLabel label_14;
	private static JLabel label_15;
	private static JLabel label_16;
	private static JLabel label_17;
	private static JLabel label_18;
	private static JLabel label_19;
	private static JLabel label_20;


	private static long timer;
	private long oldTimer;
	private Calendar cal = Calendar.getInstance();

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
		
		

		setBackground(Color.GRAY);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, (int) width, (int) height);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
//		 if( timer > (oldTimer+30000) ){
//		 Thread update= new SearchThread();
//		 update.start();
//		
//		 setTimer(cal.getTimeInMillis());
//		 oldTimer=timer;
//		 }

		label = new JLabel("");
		label.setFont(new Font("Rockwell", Font.BOLD, 30));
		label.setBounds(640, 361, 117, 51);
		contentPane.add(label);

		label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_1.setBounds(767, 361, 100, 51);
		contentPane.add(label_1);

		label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_2.setBounds(767, 479, 100, 51);
		contentPane.add(label_2);

		label_3 = new JLabel("");
		label_3.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_3.setBounds(640, 479, 117, 51);
		contentPane.add(label_3);

		label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_4.setBounds(767, 602, 100, 51);
		contentPane.add(label_4);

		label_5 = new JLabel("");
		label_5.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_5.setBounds(640, 602, 117, 51);
		contentPane.add(label_5);

		label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_6.setBounds(767, 722, 100, 51);
		contentPane.add(label_6);

		label_7 = new JLabel("");
		label_7.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_7.setBounds(640, 722, 117, 51);
		contentPane.add(label_7);

		label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Gill Sans MT", Font.PLAIN, 30));
		label_8.setBounds(777, 846, 100, 51);
		contentPane.add(label_8);

		label_9 = new JLabel("");
		label_9.setFont(new Font("Gill Sans MT", Font.PLAIN, 30));
		label_9.setBounds(640, 846, 117, 51);
		contentPane.add(label_9);

		label_Clock = new JLabel("");
		label_Clock.setForeground(Color.WHITE);
		label_Clock.setFont(new Font("Gill Sans MT", Font.PLAIN, 48));
		label_Clock.setBounds(1621, 43, 165, 117);
		contentPane.add(label_Clock);

		label_11 = new JLabel("");
		label_11.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_11.setBounds(1542, 361, 100, 51);
		contentPane.add(label_11);

		label_12 = new JLabel("");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_12.setBounds(1668, 361, 100, 51);
		contentPane.add(label_12);

		label_13 = new JLabel("");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_13.setBounds(1669, 479, 100, 51);
		contentPane.add(label_13);

		label_14 = new JLabel("");
		label_14.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_14.setBounds(1542, 479, 100, 51);
		contentPane.add(label_14);

		label_15 = new JLabel("");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_15.setBounds(1669, 602, 100, 51);
		contentPane.add(label_15);

		label_16 = new JLabel("");
		label_16.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_16.setBounds(1542, 602, 100, 51);
		contentPane.add(label_16);

		label_17 = new JLabel("");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_17.setBounds(1669, 722, 100, 51);
		contentPane.add(label_17);

		label_18 = new JLabel("");
		label_18.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_18.setBounds(1542, 722, 100, 51);
		contentPane.add(label_18);

		label_19 = new JLabel("");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("Rockwell", Font.PLAIN, 30));
		label_19.setBounds(1669, 846, 100, 51);
		contentPane.add(label_19);

		label_20 = new JLabel("");
		label_20.setFont(new Font("Rockwell", Font.BOLD, 30));
		label_20.setBounds(1542, 846, 100, 51);
		contentPane.add(label_20);
		
				JLabel lblNewLabel = new JLabel("Mock Up");
				lblNewLabel.setBounds(10, 0, 1960, 1081);
				contentPane.add(lblNewLabel);
				lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
				lblNewLabel.setIcon(new ImageIcon(Gui2.class.getResource("img/mockUp.jpg")));
		
				
		Thread clock= new ClockThread();
			clock.start();
		Thread t = new SearchThread();
			t.start();

	}

	public void setTimer(long timer) {
		this.timer = timer;
	}

	public static void setTimeOnLabel(String time, String time2, int line) {

		if (line == 2) {
			label.setText(time);
			label_1.setText(time2);
			
		}

		else if (line == 3) {
			label_3.setText(time);
			label_2.setText(time2);
		}
		else if (line == 5) {
			label_5.setText(time);
			label_4.setText(time2);
		}

		else if (line == 7) {
			label_7.setText(time);
			label_6.setText(time2);
		}

		else if (line == 8) {
			label_9.setText(time);
			label_8.setText(time2);

		}

		else if (line == 22) {
			label_11.setText(time);
			label_12.setText(time2);
		}

		else if (line == 33) {
			label_14.setText(time);
			label_13.setText(time2);
		}
		else if (line == 33) {
			label_14.setText(time);
			label_13.setText(time2);
		}
		else if (line == 55) {
			label_16.setText(time);
			label_15.setText(time2);
		}
		else if (line == 77) {
			label_18.setText(time);
			label_17.setText(time2);
		}
		else if (line == 88) {
			label_20.setText(time);
			label_19.setText(time2);
		}
		
	}

	/**
	*S�tter tiden i klockf�ltet
	*/
	public static void setTimeOnLabel(String time){
		label_Clock.setText(time);			
	}
}

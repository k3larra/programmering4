

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class SkåneGUI extends JFrame {

	private JPanel contentPane;
	private JTextField två;
	private JTextField tvåmotdär;
	private JTextField tre;
	private JTextField tremotdär;
	private JTextField fem;
	private JTextField femmotdär;
	private JTextField sju;
	private JTextField sjumotdär;
	private JTextField åtta;
	private JTextField åttamotdär;
	private JTextField tvåfrån;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField tvåfråndär;
	private JTextField trefrån;
	private JTextField femfrån;
	private JTextField sjufrån;
	private JTextField åttafrån;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkåneGUI frame = new SkåneGUI();
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
	public SkåneGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(SkåneGUI.class.getResource("/images/AnnaLindhsMockUp.jpg")));
		label.setBounds(0, 0, 1920, 1080);
		contentPane.add(label);
		
		två = new JTextField();
		två.setBounds(607, 370, 130, 26);
		contentPane.add(två);
		två.setColumns(10);
		
		tvåmotdär = new JTextField();
		tvåmotdär.setBounds(739, 370, 130, 26);
		contentPane.add(tvåmotdär);
		tvåmotdär.setColumns(10);
		
		tre = new JTextField();
		tre.setText("tre");
		tre.setBounds(607, 496, 130, 26);
		contentPane.add(tre);
		tre.setColumns(10);
		
		tremotdär = new JTextField();
		tremotdär.setBounds(739, 496, 130, 26);
		contentPane.add(tremotdär);
		tremotdär.setColumns(10);
		
		fem = new JTextField();
		fem.setBounds(607, 619, 130, 26);
		contentPane.add(fem);
		fem.setColumns(10);
		
		femmotdär = new JTextField();
		femmotdär.setBounds(739, 619, 130, 26);
		contentPane.add(femmotdär);
		femmotdär.setColumns(10);
		
		sju = new JTextField();
		sju.setBounds(607, 740, 130, 26);
		contentPane.add(sju);
		sju.setColumns(10);
		
		sjumotdär = new JTextField();
		sjumotdär.setBounds(739, 740, 130, 26);
		contentPane.add(sjumotdär);
		sjumotdär.setColumns(10);
		
		åtta = new JTextField();
		åtta.setBounds(607, 863, 130, 26);
		contentPane.add(åtta);
		åtta.setColumns(10);
		
		åttamotdär = new JTextField();
		åttamotdär.setBounds(739, 863, 130, 26);
		contentPane.add(åttamotdär);
		åttamotdär.setColumns(10);
		
		tvåfrån = new JTextField();
		tvåfrån.setBounds(1528, 381, 130, 26);
		contentPane.add(tvåfrån);
		tvåfrån.setColumns(10);
		
		trefrån = new JTextField();
		trefrån.setBounds(1528, 507, 130, 26);
		contentPane.add(trefrån);
		trefrån.setColumns(10);
		
		femfrån = new JTextField();
		femfrån.setBounds(1528, 629, 130, 26);
		contentPane.add(femfrån);
		femfrån.setColumns(10);
		
		sjufrån = new JTextField();
		sjufrån.setBounds(1528, 750, 130, 26);
		contentPane.add(sjufrån);
		sjufrån.setColumns(10);
		
		åttafrån = new JTextField();
		åttafrån.setBounds(1528, 863, 130, 26);
		contentPane.add(åttafrån);
		åttafrån.setColumns(10);
		
	
		
	}
}

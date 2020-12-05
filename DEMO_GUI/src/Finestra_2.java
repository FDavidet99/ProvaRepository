import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finestra_2 extends JFrame {

	private JPanel contentPane;
	private JTextField TestodaCopiare_textField;
	private JTextField TestoCopiato_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_2 frame = new Finestra_2();
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
	public Finestra_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TestodaCopiare_textField = new JTextField();
		TestodaCopiare_textField.setToolTipText("Inserire cosa vuoi copiare\r\n");
		TestodaCopiare_textField.setBounds(167, 49, 86, 20);
		contentPane.add(TestodaCopiare_textField);
		TestodaCopiare_textField.setColumns(10);
		
		JLabel DescrizioneLabel_1 = new JLabel("Inserisci testo da copiare");
		DescrizioneLabel_1.setBounds(20, 52, 148, 14);
		contentPane.add(DescrizioneLabel_1);
		
		TestoCopiato_textField = new JTextField();
		TestoCopiato_textField.setBounds(157, 143, 137, 48);
		contentPane.add(TestoCopiato_textField);
		TestoCopiato_textField.setColumns(10);
		
		JButton Copia_Button = new JButton("Copia\r\n");
		Copia_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestoCopiato_textField.setText(TestoCopiato_textField.getText()+TestodaCopiare_textField.getText());
				TestodaCopiare_textField.setText("");
			}
		});
		Copia_Button.setBounds(167, 93, 89, 23);
		contentPane.add(Copia_Button);
	}
}

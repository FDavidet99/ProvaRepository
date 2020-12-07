<<<<<<< HEAD
<<<<<<< master
<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Finestra_1 extends JFrame {

	private JPanel contentPane;
	private JTextField Prova_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_1 frame = new Finestra_1();
					frame.setVisible(true);
				} catch (Exception banana) {
					banana.printStackTrace();
					//adjajdaudbdiuauidaiufiufuiwfhuiwefuiwfui
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Finestra_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Prova_textField = new JTextField();
		Prova_textField.setBackground(Color.RED);
		Prova_textField.setBounds(42, 68, 155, 52);
		contentPane.add(Prova_textField);
		Prova_textField.setColumns(10);
		
		JButton CancellaTesto_Button = new JButton("Cancella ");
		CancellaTesto_Button.setBounds(233, 79, 109, 34);
		contentPane.add(CancellaTesto_Button);
		CancellaTesto_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ho aggiunto un commento
			}
		});
		CancellaTesto_Button.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		JRadioButton Verde_RadioButton = new JRadioButton("Verde");
		Verde_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
				
			}
		});
		
		Verde_RadioButton.setBounds(233, 137, 109, 23);
		contentPane.add(Verde_RadioButton);
		
		
		JRadioButton Rosso_RadioButton = new JRadioButton("Rosso");
		Rosso_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		Rosso_RadioButton.setBounds(233, 165, 109, 23);
		contentPane.add(Rosso_RadioButton);
		
		JButton GoFinestra_2_NewButton = new JButton("Prossima pagina");
		GoFinestra_2_NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra_2 f2=new Finestra_2 ();
				 f2.setVisible(true);
			}
		});
		GoFinestra_2_NewButton.setBounds(321, 214, 131, 23);
		contentPane.add(GoFinestra_2_NewButton);
	}
}
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Finestra_1 extends JFrame {

	private JPanel contentPane;
	private JTextField Prova_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_1 frame = new Finestra_1();
					frame.setVisible(true);
					///dahdahdad
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Finestra_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Prova_textField = new JTextField();
		Prova_textField.setBackground(Color.RED);
		Prova_textField.setBounds(42, 68, 155, 52);
		contentPane.add(Prova_textField);
		Prova_textField.setColumns(10);
		
		JButton CancellaTesto_Button = new JButton("Cancella ");
		CancellaTesto_Button.setBounds(233, 79, 109, 34);
		contentPane.add(CancellaTesto_Button);
		CancellaTesto_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prova_textField.setText("");
			}
		});
		CancellaTesto_Button.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		JRadioButton Verde_RadioButton = new JRadioButton("Verde");
		Verde_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
				
			}
		});
		
		Verde_RadioButton.setBounds(233, 137, 109, 23);
		contentPane.add(Verde_RadioButton);
		
		
		JRadioButton Rosso_RadioButton = new JRadioButton("Rosso");
		Rosso_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		Rosso_RadioButton.setBounds(233, 165, 109, 23);
		contentPane.add(Rosso_RadioButton);
		
		JButton GoFinestra_2_NewButton = new JButton("Prossima pagina");
		GoFinestra_2_NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra_2 f2=new Finestra_2 ();
				 f2.setVisible(true);
			}
		});
		GoFinestra_2_NewButton.setBounds(321, 214, 131, 23);
		contentPane.add(GoFinestra_2_NewButton);
	}
}
>>>>>>> parent of ecd468f... Update Finestra_1.java
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Finestra_1 extends JFrame {

	private JPanel contentPane;
	private JTextField Prova_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_1 frame = new Finestra_1();
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
	public Finestra_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Prova_textField = new JTextField();
		Prova_textField.setBackground(Color.RED);
		Prova_textField.setBounds(42, 68, 155, 52);
		contentPane.add(Prova_textField);
		Prova_textField.setColumns(10);
		
		JButton CancellaTesto_Button = new JButton("Cancella ");
		CancellaTesto_Button.setBounds(233, 79, 109, 34);
		contentPane.add(CancellaTesto_Button);
		CancellaTesto_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				Prova_textField.setText("ciao ciao");
=======
				Prova_textField.setText("");
>>>>>>> parent of ecd468f... Update Finestra_1.java
			}
		});
		CancellaTesto_Button.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		JRadioButton Verde_RadioButton = new JRadioButton("Verde");
		Verde_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
				
			}
		});
		
		Verde_RadioButton.setBounds(233, 137, 109, 23);
		contentPane.add(Verde_RadioButton);
		
		
		JRadioButton Rosso_RadioButton = new JRadioButton("Rosso");
		Rosso_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		Rosso_RadioButton.setBounds(233, 165, 109, 23);
		contentPane.add(Rosso_RadioButton);
		
		JButton GoFinestra_2_NewButton = new JButton("Prossima pagina");
		GoFinestra_2_NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra_2 f2=new Finestra_2 ();
				 f2.setVisible(true);
			}
		});
		GoFinestra_2_NewButton.setBounds(321, 214, 131, 23);
		contentPane.add(GoFinestra_2_NewButton);
	}
}
>>>>>>> e77b849 Update Finestra_1.java
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Finestra_1 extends JFrame {

	private JPanel contentPane;
	private JTextField Prova_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_1 frame = new Finestra_1();
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
	public Finestra_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Prova_textField = new JTextField();
		Prova_textField.setBackground(Color.RED);
		Prova_textField.setBounds(42, 68, 155, 52);
		contentPane.add(Prova_textField);
		Prova_textField.setColumns(10);
		
		JButton CancellaTesto_Button = new JButton("Cancella ");
		CancellaTesto_Button.setBounds(233, 79, 109, 34);
		contentPane.add(CancellaTesto_Button);
		CancellaTesto_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prova_textField.setText("");
			}
		});
		CancellaTesto_Button.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		JRadioButton Verde_RadioButton = new JRadioButton("Verde");
		Verde_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
				
			}
		});
		
		Verde_RadioButton.setBounds(233, 137, 109, 23);
		contentPane.add(Verde_RadioButton);
		
		
		JRadioButton Rosso_RadioButton = new JRadioButton("Rosso");
		Rosso_RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		Rosso_RadioButton.setBounds(233, 165, 109, 23);
		contentPane.add(Rosso_RadioButton);
		
		JButton GoFinestra_2_NewButton = new JButton("Prossima pagina");
		GoFinestra_2_NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra_2 f2=new Finestra_2 ();
				 f2.setVisible(true);
			}
		});
		GoFinestra_2_NewButton.setBounds(321, 214, 131, 23);
		contentPane.add(GoFinestra_2_NewButton);
	}
}
>>>>>>> parent of ecd468f... Update Finestra_1.java

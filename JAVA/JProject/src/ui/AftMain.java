package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AftMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AftMain() {
		setForeground(SystemColor.window);
		setBackground(SystemColor.window);
		setTitle("\uC601\uD654 \uC608\uB9E4 \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 420);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.windowText);
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uC608\uB9E4");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lblNewLabel.setBounds(137, 24, 112, 69);
		contentPane.add(lblNewLabel);
		
		//----------------------------
		
		JButton btnNewButton_1 = new JButton("\uC608\uB9E4\uD558\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Reservation().setVisible(true);
			}
		});	JButton btnNewButton_2 = new JButton("\uD604\uC7AC \uC0C1\uC601\uC911\uC778 \uC601\uD654");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Profile().setVisible(true);
			}
		});	JButton btnNewButton_2_1 = new JButton("\uD6C4\uAE30 \uC791\uC131");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MovieRev().setVisible(true);
			}
		});JButton btnNewButton = new JButton("\uD68C\uC6D0 \uC815\uBCF4");
		btnNewButton.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MovieInfo().setVisible(true);
			}
		});
		
		btnNewButton.setForeground(SystemColor.textText);
		btnNewButton.setBounds(138, 177, 112, 36);
		contentPane.add(btnNewButton);
		
		//¿µÈ­ ¿¹¸ÅÇÏ±â, È¸¿øÁ¤º¸, ¸®ºä ³²±â±â, »ó¿µÁßÀÎ ¿µÈ­ (Á¤º¸)
		btnNewButton_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton_1.setBounds(137, 127, 112, 36);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton_2.setBounds(110, 279, 167, 47);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_2_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(138, 228, 112, 36);
		contentPane.add(btnNewButton_2_1);
	}
	
}

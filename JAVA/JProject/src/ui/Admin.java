package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/* 
	 * Create the frame.
	 */
	public Admin() {
		setTitle("\uAD00\uB9AC\uC790");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 325);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC601\uD654 \uC608\uB9E4");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(140, 25, 112, 69);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uAD00\uB9AC\uC790");
		lblNewLabel_1_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(349, 0, 33, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		btnNewButton_1_2.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(140, 116, 112, 36);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("\uB9AC\uBDF0\uAD00\uB9AC");
		btnNewButton_1_2_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(140, 162, 112, 36);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("\uC601\uD654\uC815\uBCF4\uC218\uC815");
		btnNewButton_1_2_1_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton_1_2_1_1.setBounds(140, 208, 112, 36);
		contentPane.add(btnNewButton_1_2_1_1);
		
	}

}

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
import java.awt.event.ActionEvent;

public class ResCheck extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/* 
	 * Create the frame.
	 */
	public ResCheck() {
		setTitle("\uC608\uB9E4 \uC870\uD68C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 448);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC608\uB9E4 \uC870\uD68C");
		lblNewLabel_1.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		lblNewLabel_1.setBounds(159, 26, 87, 46);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uC608\uB9E4 \uCDE8\uC18C");
		btnNewButton_1.setBounds(147, 340, 116, 39);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 75, 311, 242);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("\uC608\uB9E4 \uC815\uBCF4");
		panel.add(lblNewLabel_2);
		
	}
}

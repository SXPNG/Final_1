package ui;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setForeground(SystemColor.window);
		setBackground(SystemColor.window);
		setTitle("\uC601\uD654 \uC608\uB9E4 \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 280);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.windowText);
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setFont(new Font("µ¸¿ò", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MovieRev().setVisible(true);
				//win.change("LogIn");
			}
		});
		btnNewButton.setForeground(SystemColor.textText);
		btnNewButton.setBounds(136, 157, 112, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uC608\uB9E4");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lblNewLabel.setBounds(136, 27, 112, 69);
		contentPane.add(lblNewLabel);
		
	    }
	}

package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResComplete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ResComplete() {
		setTitle("\uACB0\uC81C\uC644\uB8CC!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 245);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uACB0\uC81C\uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lblNewLabel.setBounds(90, 41, 232, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uBA54\uC778\uD654\uBA74\uC73C\uB85C");
		btnNewButton.setBounds(149, 120, 110, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AftMain().setVisible(true);
				//win.change("LogIn");
			}
		});
		contentPane.add(btnNewButton);
	}
}

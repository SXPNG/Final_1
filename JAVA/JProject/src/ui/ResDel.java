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

public class ResDel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/* 
	 * Create the frame.
	 */
	public ResDel() {
		setTitle("\uC608\uB9E4 \uCDE8\uC18C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 360);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC608\uB9E4 \uCDE8\uC18C");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 20));
		lblNewLabel_1.setBounds(141, 28, 87, 46);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uC608\uB9E4 \uCDE8\uC18C\uD558\uAE30");
		btnNewButton_1.setBounds(129, 250, 116, 39);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC608\uB9E4\uD55C \uD45C : ");
		lblNewLabel_2.setBounds(80, 97, 64, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uCDE8\uC18C\uB97C \uC9C4\uD589\uD560\uAE4C\uC694?");
		lblNewLabel_2_1.setBounds(130, 153, 106, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uACB0\uC81C\uD55C \uC218\uB2E8\uC73C\uB85C \uD658\uBD88\uB429\uB2C8\uB2E4.");
		lblNewLabel_2_2.setBounds(110, 196, 156, 33);
		contentPane.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(175, 95, 35, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC88C\uC11D");
		lblNewLabel_3.setBounds(145, 106, 24, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(252, 95, 35, 35);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uB9E4\uC218");
		lblNewLabel_3_1.setBounds(222, 106, 24, 15);
		contentPane.add(lblNewLabel_3_1);
		
	}	static String driver, url;
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public static void dbConnect() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
    	}catch(ClassNotFoundException e){
    		System.err.println("error = " + e);
    	}
    	
        String url = "jdbc:mysql://localhost/beamin?useUnicode=yes&characterEncoding=UTF8\r\n";
        String sql = "Select * From user";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("데이터베이스 연결 성공!");            
         
        }
        catch(Exception e) {
            System.out.println("데이터베이스 연결 실패!");
        }
	}

	public static void query(String order, String sql) throws SQLException {
		if (order == "select") {
			rs = stmt.executeQuery(sql);
		} 
		else {
			stmt.executeUpdate(sql);
		}
	}

}

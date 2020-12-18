package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public SignIn() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);setBounds(100, 100, 409, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 20));
		lblNewLabel.setBounds(156, 25, 80, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Main().setVisible(true);
			}
		});
		btnNewButton.setBounds(142, 268, 120, 46);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(181, 201, 104, 26);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 157, 104, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 114, 104, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1_3_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3_1.setBounds(104, 201, 32, 26);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblNewLabel_1_3_2.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3_2.setBounds(104, 157, 64, 26);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1_3_3.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3_3.setBounds(104, 114, 48, 26);
		contentPane.add(lblNewLabel_1_3_3);
	}
	
	static String driver, url;
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



}

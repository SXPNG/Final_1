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

public class ChsSeat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/* 
	 * Create the frame.
	 */
	public ChsSeat() {
		setTitle("\uC88C\uC11D \uC120\uD0DD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 448);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC88C\uC11D \uC120\uD0DD");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 20));
		lblNewLabel_1.setBounds(159, 26, 87, 46);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uC120\uD0DD \uC644\uB8CC");
		btnNewButton_1.setBounds(147, 340, 116, 39);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 67, 315, 258);
		contentPane.add(panel);
		
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

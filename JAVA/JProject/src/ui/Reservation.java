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
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import java.awt.Choice;

public class Reservation extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Reservation() {
		setForeground(Color.WHITE);
		setTitle("\uC608\uB9E4\uD558\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("\uACB0\uC81C\uC815\uBCF4\uC785\uB825");
		btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Pay().setVisible(true);
			}
		});	
		JButton btnNewButton_1_3 = new JButton("\uACB0\uC81C\uD558\uAE30");
		btnNewButton_1_3.setFont(new Font("돋움", Font.PLAIN, 12));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ResComplete().setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("\uC608\uB9E4\uD558\uAE30");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 20));
		lblNewLabel.setBounds(179, 25, 80, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("\uC778\uC6D0 \uC120\uD0DD");
		lblNewLabel_1_3_2.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3_2.setBounds(110, 136, 76, 26);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1_3_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3_1.setBounds(110, 172, 32, 26);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3.setBounds(110, 208, 64, 26);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("\uC601\uD654 \uC120\uD0DD");
		lblNewLabel_1_3_2_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3_2_1.setBounds(110, 102, 80, 26);
		contentPane.add(lblNewLabel_1_3_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 172, 116, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 208, 116, 26);
		contentPane.add(textField_3);
		
		btnNewButton_1.setForeground(SystemColor.textText);
		btnNewButton_1.setBounds(91, 315, 248, 26);
		contentPane.add(btnNewButton_1);

		btnNewButton_1_3.setForeground(SystemColor.textText);
		btnNewButton_1_3.setBounds(91, 354, 248, 26);
		contentPane.add(btnNewButton_1_3);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(208, 102, 116, 26);
		contentPane.add(formattedTextField);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("\uC88C\uC11D \uC120\uD0DD : ");
		lblNewLabel_1_3_3.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_3_3.setBounds(110, 244, 96, 26);
		contentPane.add(lblNewLabel_1_3_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(208, 138, 116, 26);
		contentPane.add(spinner);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Cambria", Font.PLAIN, 12));
		choice.setBounds(208, 249, 116, 21);
		contentPane.add(choice);
		
		choice.add("좌석 선택하기");
		choice.add("A");
		choice.add("B");
		choice.add("C");
		choice.add("D");
		choice.add("E");
		choice.add("F");
		choice.add("G");
		choice.add("H");
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

	public static void query(String order, String sql) throws SQLException {
		if (order == "select") {
			rs = stmt.executeQuery(sql);
		} 
		else {
			stmt.executeUpdate(sql);
		}
	}
}

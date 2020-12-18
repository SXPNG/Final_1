package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 355);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 20));
		lblNewLabel_1.setBounds(161, 21, 60, 46);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(167, 116, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 147, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(97, 119, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setBounds(97, 150, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SignIn().setVisible(true);
			}
		});
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC778");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AftMain().setVisible(true);
			}
		});
		
		JButton btnNewButton_2 = new JButton("\uBA54\uC778\uD654\uBA74\uC73C\uB85C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Main().setVisible(true);
			}
		});
		
		btnNewButton.setFont(new Font("돋움", Font.PLAIN, 11));
		btnNewButton.setBounds(73, 238, 112, 28);
		btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 11));
		btnNewButton_1.setBounds(74, 197, 233, 28);
		btnNewButton_2.setFont(new Font("돋움", Font.PLAIN, 11));
		btnNewButton_2.setBounds(194, 238, 112, 28);
		contentPane.add(btnNewButton);		
		contentPane.add(btnNewButton_1);		
		contentPane.add(btnNewButton_2);		
		
		
		
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
	}}
/**
btn_Login.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btn_Login)) {
		              try {
		            	BasePstmt = conn.prepareStatement("select * from user where id = ?");
		                BasePstmt.setString(1, tf_ID.getText());
		        		ResultSet BaseRs = BasePstmt.executeQuery();
						if (BaseRs.next() == false || (tf_ID.getText().isEmpty()) == true) { // id가 없거나, 공란일때 실행안됨
							  Login_result.setText("ID와 PASSWORD를 확인하여 주세요.");
						} else {
							BasePstmt = conn.prepareStatement("select * from user where id = ?");
			                BasePstmt.setString(1, tf_ID.getText());
			        		BaseRs = BasePstmt.executeQuery();
				               while (BaseRs.next() == true) {
				                	char[] secret_pw = tf_PASSWORD.getPassword();
				                	String pw = "";
				                	for(char cha : secret_pw){
				                		Character.toString(cha);
				                		pw += (pw.equals("")) ? ""+cha+"" : ""+cha+"";
				                	}
				                    if (BaseRs.getString("PASSWORD").equals(pw)) { // pw와 같은지 비교
				                        id = tf_ID.getText();
				                        User user = new User();
				                        dispose();
				                    } else {                // 아이디는같고 pw가 다른경우
				                    	Login_result.setText("PASSWORD를 확인하여 주세요.");
				                    }
				                }
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
			}
		});
}
 **/

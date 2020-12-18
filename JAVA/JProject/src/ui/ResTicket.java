package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ResTicket extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel Dtmstorage;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ResTicket() {
		setForeground(Color.BLACK);
		setTitle("\uD2F0\uCF13 \uD655\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 530);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("예매한 영화 표");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblNewLabel.setBounds(12, 10, 112, 54);
		contentPane.add(lblNewLabel);
		
		String[] column= {"","",""};
		Dtmstorage=new DefaultTableModel(column, 0) {
			public boolean isCellEditable(int row, int column) {
				return true;
			}
		};
		
		Dtmstorage.setColumnIdentifiers(new String[] {"tr","tr","tr"});
		Dtmstorage.addRow(new String[] {(String) "1","2","3"});
		Dtmstorage.addRow(new String[] {(String) "1","2","3"});
		Dtmstorage.addRow(new String[] {(String) "1","2","3"});
		
		
		
	}
	
	public void run() {
		try {
			JTable frame = new JTable();
			frame.setVisible(true);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
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

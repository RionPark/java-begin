package java17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static Connection con = null;
	
	public static Connection getCon() {
		
		if(con==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3308/test?useSSL=false&serverTimezone=UTC";
				con = DriverManager.getConnection(url, "test1", "test1");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch(SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		return con;
	}
	
	public static void closeCon() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			con = null;
		}
	}
}

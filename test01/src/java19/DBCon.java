package java19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static Connection con = null;
	
	public static Connection getCon() {
		if(con==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url ="jdbc:mysql://localhost:3308/test?useSSL=false&serverTimezone=UTC";
				con = DriverManager.getConnection(url, "test1", "test1");
				System.out.println("My-SQL 연결 성공!");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	
	public static void closeCon() {
		if(con!=null) {
			try {
				con.close();
				System.out.println("My-SQL 연결 끊기 성공!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		con = null;
	}
}

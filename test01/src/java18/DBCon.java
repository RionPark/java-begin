package java18;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBCon {
	private static Connection con = null;
	private static String driver;
	private static String url;
	private static String id;
	private static String pwd;
	
	public static void init() {
		ClassLoader cl = DBCon.class.getClassLoader();
		InputStream is = cl.getResourceAsStream("dbcon.properties");
		Properties prop = new Properties();
		try {
			prop.load(is);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			id = prop.getProperty("id");
			pwd = prop.getProperty("pwd");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		if(con==null) {
			try {
				init();
				Class.forName(driver);
				con = DriverManager.getConnection(url, id, pwd);
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

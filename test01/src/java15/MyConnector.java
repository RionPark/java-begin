package java15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnector {
	public static void main(String[] args) {

		Connection conn= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3308/test?useSSL=false&serverTimezone=UTC";
			conn = DriverManager.getConnection(url, "test1", "test1");
			
			Statement stmt = conn.createStatement();
			String sql = "select num,name,etc from test";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String etc = rs.getString("etc");
				System.out.println("num : " + num + ", name : " + name + ", etc : " + etc);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		}
	}
}

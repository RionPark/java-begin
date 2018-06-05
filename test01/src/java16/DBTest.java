package java16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	Connection con = null;
	
	public DBTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3308/test?useSSL=false&serverTimezone=UTC";
			con = DriverManager.getConnection(url, "test1", "test1");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void selelct(String name) {
		String sql = "select * from test where name = '" + name + "'";
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int num = rs.getInt("num");
				name = rs.getString("name");
				String etc = rs.getString("etc");
				System.out.println("num : " + num + ",name:"+name+",etc:"+etc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(int num, String name, String etc) {
		String sql = "insert into test(num, name, etc)";
		sql += "values(" + num +",'" + name +"','"+etc+"')";
		Statement stmt;
		try {
			stmt = con.createStatement();
			int rCnt = stmt.executeUpdate(sql);
			if(rCnt==1) {
				System.out.println("입력 성공!");
				System.out.println("num : " + num + ",name:"+name+",etc:"+etc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			con = null;
		}
	}
	
	public static void main(String[] args) {
		DBTest dbt = new DBTest();
		dbt.selelct("한길동");
		dbt.insert(6, "인서트 테스트", "인서트 테스트");
		dbt.close();
	}
}

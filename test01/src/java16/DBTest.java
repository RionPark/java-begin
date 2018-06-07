package java16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class DBTest {
	Connection con = null;
	
	public DBTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3308/test?useSSL=false&serverTimezone=UTC";
			con = DriverManager.getConnection(url, "test1", "test1");
			con.setAutoCommit(false);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<HashMap<String,String>> selelct(String name) {
		ArrayList<HashMap<String,String>> testList = new ArrayList<HashMap<String,String>>();
		String sql = "select * from test";
		if(name!=null && !"".equals(name)) {
			sql += " where name='" + name + "'";
		}
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String num = rs.getString("num");
				name = rs.getString("name");
				String etc = rs.getString("etc");
				HashMap<String,String> hm = new HashMap<String,String>();
				hm.put("num", num);
				hm.put("name", name);
				hm.put("etc", etc);
				testList.add(hm);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return testList;
	}
	
	public void insert(int num, String name, String etc) {
		String sql = "insert into test(num, name, etc)";
		sql += "values(?,?,?)";
		PreparedStatement ps;
		try {
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for(int i=1;i<=10000;i++) {
				ps.setInt(1, i);
				ps.setString(2, name+i);
				ps.setString(3, etc+i);
				ps.addBatch();
				ps.clearParameters();
			}
			ps.executeBatch();
			ps.clearBatch();
			con.commit();
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
		dbt.insert(3, "name", "etc");
		dbt.selelct("");
		dbt.close();
	}
}

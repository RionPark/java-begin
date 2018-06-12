package java18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {
	Connection con = null;
	
	public DBTest(Connection con) {
		this.con = con;
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
				testList.add(new HashMap<String,String>());
				testList.get(testList.size()-1).put("name", name);
				testList.get(testList.size()-1).put("num", num);
				testList.get(testList.size()-1).put("etc", etc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return testList;
	}
	
	public void insert(ArrayList<HashMap<String,String>> testList) {
		String sql = "insert into test(num, name, etc)";
		sql += "values(?,?,?)";
		PreparedStatement ps;
		try {
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);

			System.out.println("배치 시작");
			for(HashMap<String,String> hm : testList) {
				int num = Integer.parseInt(hm.get("num"));
				String name = hm.get("name");
				String etc = hm.get("etc");
				ps.setInt(1, num);
				ps.setString(2, name);
				ps.setString(3, etc);
				ps.addBatch();
				ps.clearParameters();
			}
			ps.executeBatch();
			ps.clearBatch();
			con.commit();
			System.out.println("배치 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void printList(ArrayList<HashMap<String,String>> list) {
		for(int i=0;i<list.size();i++) {
			HashMap<String,String> hm = list.get(i);
			String str = "번호 : " + hm.get("num");
			str += ", 이름 : " + hm.get("name");
			str += ", 비고 : " + hm.get("etc");
			System.out.println(str);
		}
	}
	
	public void delete(String num) {
		String sql = "delete from test where num=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, num);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(String num, String name, String etc) {
		String sql = "update test set name=?,etc=? where num=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, etc);
			ps.setString(3, num);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBTest dbt = new DBTest(DBCon.getCon());
		ArrayList<HashMap<String,String>> list = dbt.selelct("");
		dbt.printList(list);
		System.out.println("총인원수 : " + list.size());
		DBCon.closeCon();
	}
}

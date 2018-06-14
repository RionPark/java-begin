package java19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java18.DBCon;

public class UserList {
	private Connection con;
	
	public UserList(Connection con) {
		this.con = con;
	}
	
	public List<UserVO> getUserList(){
		List<UserVO> userList = new ArrayList<UserVO>();
		String sql = "select * from user";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				UserVO user = new UserVO();
				user.setuNo(rs.getInt("uNo"));
				user.setuId(rs.getString("uId"));
				user.setuName(rs.getString("uName"));
				user.setuPwd(rs.getString("uPwd"));
				user.setuAge(rs.getInt("uAge"));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	public static void main(String[] args) {
		Connection con = DBCon.getCon();
		UserList ul = new UserList(con);
		List<UserVO> userList = ul.getUserList();
		for(UserVO user:userList) {
			System.out.println(user);
		}
	}
}

package java19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	
	private Connection con;
	private String id;
	private String pwd;
	
	public Login() {
		this.con = DBCon.getCon();
	}
	
	public void insertLoginInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요 : ");
		id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		pwd = scan.nextLine();
	}
	
	public String login() {
		String sql = "select * from user where uId=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String pwd = rs.getString("uPwd");
				if(this.pwd.equals(pwd)) {
					return id + "님 로그인 성공하셨습니다.!";
				}
				return id+"님 비밀번호가 틀렸습니다.";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id + "와 일치하는 ID가 존재하지 않습니다.";
	}
	
	public static void main(String[] args) {
		Login l = new Login();
		l.insertLoginInfo();
		String result = l.login(); 
		System.out.println(result);
	}
}

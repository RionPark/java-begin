package java19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Join {

	private Connection con;
	private UserVO user;
	public Join(Connection con) {
		this.con = con;
		user = new UserVO();
	}
	
	public void insertInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String uName = scan.nextLine();
		System.out.println("아이디를 입력해주세요");
		String uId = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String uPwd = scan.nextLine();
		System.out.println("나이를 입력해주세요");
		int uAge = Integer.parseInt(scan.nextLine());
		user.setuName(uName);
		user.setuId(uId);
		user.setuPwd(uPwd);
		user.setuAge(uAge);
	}
	
	public int insertUser() {
		String sql = "insert into user(uId, uPwd, uName, uAge)";
		sql += " values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getuId());
			ps.setString(2, user.getuPwd());
			ps.setString(3, user.getuName());
			ps.setInt(4, user.getuAge());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Connection con = DBCon.getCon();
		Join j = new Join(con);
		j.insertInfo();
		int result = j.insertUser();
		if(result==1) {
			System.out.println("정상적으로 회원가입 되셨습니다.");
		}else {
			System.out.println("회원가입에 실패하였습니다.");
		}
	}
}

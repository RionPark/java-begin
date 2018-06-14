package java19;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Excutor {

	public static void main(String[] args) {
		String order ="";
		Scanner scan = new Scanner(System.in);
		Connection con = DBCon.getCon();
		while(order!=null) {
			System.out.println("== MY-SQL 서비스 ==");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 리스트 보기");
			System.out.println("4. 종료");
			System.out.println("원하시는 서비스 번호를 입력해주세요 : ");
			int orderNum = Integer.parseInt(scan.nextLine());
			if(orderNum==4) {
				order = null;
			}else if(orderNum ==1) {
				Join j = new Join(con);
				j.insertInfo();
				j.insertUser();
			}else if(orderNum ==2) {
				Login l = new Login();
				l.insertLoginInfo();
				System.out.println(l.login());
			}else if(orderNum ==3) {
				UserList ul = new UserList(con);
				List<UserVO> userList = ul.getUserList();
				for(UserVO user:userList) {
					System.out.println(user);
				}
			}else {
				System.out.println("서비스 번호는 1 ~ 4 까지 입니다.");
			}
		}
		DBCon.closeCon();
		System.out.println("시스템이 종료되었습니다.");
	}
}

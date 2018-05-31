package java12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Test {
	public String toString() {
		return "나 테스트야!!";
	}
	public static void main(String[] args) {
		ArrayList<Test> al = new ArrayList<Test>();
		al.add(new Test());
		System.out.println(al.get(0));
		
//		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		String[] userData = new String[5];
		userData[0] = "1";
		userData[1] = "redfila";
		userData[2] = "r1r2r3";
		userData[3] = "Rion";
		userData[4] = "33";

		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("아이디", "redfila");
		hm.put("순번", "redfila");
		hm.put("비밀번호", "r1r2r3");
		hm.put("이름", "Rion");
		hm.put("나이", "33");
		System.out.println(hm.get("아이디")==hm.get("순번"));
		

		String[][] userDatas = new String[4][5];
		
		ArrayList<HashMap<String,String>> userList = 
				new ArrayList<HashMap<String,String>>();
		userList.add(hm);
	}
}

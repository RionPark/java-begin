package java17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static ArrayList<HashMap<String,String>> getList(){
		ArrayList<HashMap<String,String>> list;
		list = new ArrayList<HashMap<String,String>>();
		HashMap<String,String> hm;
		for(int i=1;i<=10;i++) {
			hm = new HashMap<String,String>();
			hm.put("num",i+"");
			hm.put("name", "name" + i);
			hm.put("etc", "etc" + i);
			list.add(hm);
		}
		return list;
	}
	public static void printList(ArrayList<HashMap<String,String>> list) {
		for(HashMap<String,String> hm : list) {
			Iterator<String> it = hm.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.print(key +":" + hm.get(key) + ",");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = s.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = s.nextLine();
		
		if(id.equals("test")) {
			if(pwd.equals("test")) {
				System.out.println("로그인 성공!");
				return;
			}
			System.out.println("비밀번호가 잘못되었습니다.");
			return;
		}
		System.out.println("없는 아이디입니다.");
	}
}

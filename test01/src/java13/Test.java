package java13;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<String,String> hm = 
				new HashMap<String,String>();
		ArrayList<HashMap<String,String>> hmList = 
				new ArrayList<HashMap<String,String>>();
		
		//hm = new HashMap<String,String>();
		for(int i=1;i<=3;i++) {
			hm = new HashMap<String,String>();
			hm.put("name", "이름" + i);
			hm.put("아이디", "아이디" + i);
			hmList.add(hm);
		}
		for(HashMap<String,String> hm1 : hmList) {
			System.out.println(hm1);
		}
	}
}

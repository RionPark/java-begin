package java14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetTest {
	
	public static void printSet(Set<String> ss) {
		Iterator<String> it = ss.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Set<String> ss = new HashSet<String>();
		for(int i=1;i<=20;i++) {
			ss.add(i+"");
		}
		printSet(ss);
		
		HashMap<String, String> hm;
		hm = new HashMap<String,String>();
		hm.put("name", "Rion");
		List<HashMap<String, String>> hmList;
		hmList = new ArrayList<HashMap<String, String>>();
		hmList.add(hm);
		hm = new HashMap<String,String>();
		hm.put("name1","Ruby");
		hmList.add(hm);
		
		for(HashMap<String, String> hm1 : hmList) {
			System.out.println("유저 이름 : " + hm1.get("name"));
		}
	}
}

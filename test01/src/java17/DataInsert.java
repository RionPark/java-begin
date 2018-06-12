package java17;

import java.util.ArrayList;
import java.util.HashMap;

public class DataInsert {
	ArrayList<HashMap<String,String>> testList;
	
	public DataInsert() {
		testList = new ArrayList<HashMap<String,String>>();
	}
	
	public void makeData() {
		HashMap<String, String> hm;
		for(int i=1;i<=10;i++) {
			hm = new HashMap<String, String>();
			hm.put("num", i+"");
			hm.put("name", "name" + i);
			hm.put("etc", "test data" + i);
			testList.add(hm);
		}
	}
}

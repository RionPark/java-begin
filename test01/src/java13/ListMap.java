package java13;

import java.util.ArrayList;

public class ListMap {
	ArrayList<String> keys;
	ArrayList<String> values;
	
	public ListMap() {
		keys = new ArrayList<String>();
		values = new ArrayList<String>();
	}
	
	public boolean put(String key, String value) {
		int idx = keys.indexOf(key);
		if(idx==-1) {
			keys.add(key);
			values.add(value);
			return true;
		}
		System.out.println(key + "는 이미 등록 되어있습니다.!");
		return false;
	}
	
	public String get(String key) {
		int idx = keys.indexOf(key);
		if(idx==-1) {
			System.out.println(key + "로 등록되어 있는 키가 없습니다.");
			return null;
		}
		return values.get(idx);
	}
	
}

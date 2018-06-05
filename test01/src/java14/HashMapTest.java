package java14;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String>
		hm = new HashMap<Integer,String>();
		hm.put(0, "a");
		hm.put(1, "b");
		hm.put(2, "c");
		hm.put(3, "d");
		hm.put(4, "e");
		HashMap<Integer, String>[] hms = new HashMap[1];
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
			int idx = it.next();
			System.out.println("key:"+idx +", value:" + hm.get(idx));
		}
		
	}
}

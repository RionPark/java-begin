package java13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FileListMap {
	
	public static void main(String[] args) {
		File f = new File("c:/test.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			int idx =0;
			String[] keys = new String[2];
			HashMap<String,String> hm = new HashMap<String,String>();
			ArrayList<HashMap<String,String>> userList = 
					new ArrayList<HashMap<String,String>>(); 
					
			while((str = br.readLine())!=null) {
				if(idx==0) {
					idx = -1;
					keys = str.split(",");
				}else {
					String[] values = str.split(",");
					hm.put(keys[0], values[0]);
					hm.put(keys[1], values[1]);
					userList.add(hm);
				}
			}
			System.out.println(userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package java14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FileUser {
	
	public static void main(String[] args) {
		File f = new File("c:/test.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			int idx =0;
			String[] keys = new String[2];
			ArrayList<User> userList = new ArrayList<User>();
			while((str = br.readLine())!=null) {
				if(idx==0) {
					idx = -1;
					keys = str.split(",");
				}else {
					String[] values = str.split(",");
					int index = Integer.parseInt(values[0]);
					String name = values[1];
					User u = new User(index,name);
					userList.add(u);
				}
			}
			
			for(User u:userList) {
				System.out.println(u.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

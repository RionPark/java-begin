package java14;

import java.util.ArrayList;

public class Excutor {

	public static ArrayList<User> changeList(ArrayList<User> userList) {
		User user = userList.get(0);
		user.setIdx(100);
		return userList;
	}
	public static void main(String[] args) {
		ArrayList<User> userList;
		userList = new ArrayList<User>();
		User u; 
		for(int i=1;i<=10;i++) {
			u = new User(1,"test");
			u.setIdx(i);
			u.setName("이름" + i);
			userList.add(u);
		}
		userList = changeList(userList);
		System.out.println(userList.get(0));
	}
}

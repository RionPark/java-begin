package java18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	ArrayList al;
	public void setList(ArrayList al) {
		this.al = al;
		this.al.add("2");
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		ArrayList al = new ArrayList();
		lt.setList(al);
		String str = "2";
		System.out.println(al.get(0)==str);
	}
}

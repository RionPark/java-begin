package java05;

public class Equals {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.println(a==b);
		
		String str1 = new String("a");
		String str2 = new String("a");
		System.out.println(str1.equals(str2));
		System.out.println(str2);
		
		String s1 = "a";
		String s2 = "a";
		System.out.println(s1=="a");
		System.out.println(s2==str2);
		str2 = new String("a");
	}
}

package java05;

public class MethodExam {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void printString(String str) {
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		String str1 = "abc";
		printString(str1);
		str1 = "123";
		printString(str1);
		str1 = "ㄱㄴㄷ";
		printString(str1);
		str1 = "+-*";
		printString(str1);
		str1.length();		
	}
}

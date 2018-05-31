package java05;


public class StringExam {

	public static void main(String[] args) {
		char[] arrChar = new char[3];
		
		arrChar[0] = 'a';
		arrChar[1] = 'b';
		arrChar[2] = 'c';
		
		for(int i=0;i<arrChar.length;i++) {
			System.out.print(arrChar[i]);
		}
		System.out.println();
		String str = "abc";
		System.out.println(arrChar.length);
		System.out.println(str.length());
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
		
		String name = "박경훈";
		System.out.println(name);
		name += "스";
		System.out.println(name);
		
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			if(c=='훈') {
				System.out.println("훈이라는 글자는 " + i + "번째에 있어요!");
			}
		}
		
		int idx = name.indexOf("훈");
		System.out.println("훈이라는 글자는 " + idx + "번째에 있어요!");
	}
}

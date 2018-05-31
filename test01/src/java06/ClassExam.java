package java06;

public class ClassExam {
	int num = 2;
	String a ="123";
	
	public void test() {
		//String a = "abc";
		System.out.println(this.a);
		System.out.println(a);
	}
	public void test2() {
		num = 3;
	}
	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
		System.out.println(ce.num);
		//ce.test();
		ce.test2();
		System.out.println(ce.num);
	}
}

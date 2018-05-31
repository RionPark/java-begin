package java10;

public class Test {

	public String toString() {
		return "나 테스트 쓰트링이야!!";
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("t = " + t);
		System.out.println("t.toString() = " + t.toString());
	}
}

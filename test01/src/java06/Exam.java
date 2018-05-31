package java06;

public class Exam {
	String name;
	int age;
	String address;
	public Exam() {
		System.out.println("어? Exam생성자 호출했네요?");
		this.name = "박경훈";
		this.age = 33;
		this.address = "서울";
	}
	public static void main(String[] args) {
		Exam e = new Exam();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.address);
		int age=0;
		System.out.println(age);
	}
}

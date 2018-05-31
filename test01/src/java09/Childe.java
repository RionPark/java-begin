package java09;

public class Childe extends Parent{
	public Childe(int a) {
		super(3);
		System.out.println("아들 생성자 호출!");
	}
	
	public static void main(String[] args) {
		Childe c = new Childe(3);
		Parent p = new Parent(10);
	}
}

package java06;

public class Dog {
	//이름, 나이, 종류를 생성자로 받아주시고
	//printInfo()라는 함수에서 위에서 받은 정보를
	//출력하는 코드를 완성해주세요.
	String name;
	int age;
	String kind;
	public Dog(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}	
	public void printInfo() {
		System.out.println("강아지 정보~");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("종류 : " + kind);
	}
}

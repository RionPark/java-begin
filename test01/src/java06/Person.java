package java06;

public class Person {
	String name;
	int age;
	String address;
	String job;
	public Person(String name, int age,String address, String job) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.job = job;
	}
	public void printInfo() {
		System.out.println("==신상 정보==");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("직업 : " + job);
	}
}

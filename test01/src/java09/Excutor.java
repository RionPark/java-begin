package java09;

public class Excutor {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("박경훈");
		p.setAge(30);
		
		System.out.println("이사람의 이름은 " + p.getName());
		System.out.println("이사람의 나이는 " + p.getAge());
	}
}

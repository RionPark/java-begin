package java09;

public class Father {
	String name;
	int age;
	Father(){
		
	}
	public void doWork() {
		System.out.println("아버지가 일을 하십니다.");
	}
	public void doWork(int a) {
		System.out.println("아빠 : 니가 입력한 인트는 " + a);
	}
	public void doWork(String a) {
		System.out.println("아빠 : 니가 입력한 인트는 " + a);
	}
}

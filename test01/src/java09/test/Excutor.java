package java09.test;

public class Excutor {

	public static void printInfo1(Cat c) {
		System.out.println(c);
	}
	public static void printInfo2(Animal a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Dog d = new Dog("카드",12,"잉글코카");
		Cat c = new Cat("동동이",5,"샴");
		printInfo1(c);
		printInfo2(d);
		printInfo2(c);
		
		//개는 동물이라고 부를 수 있습니다.
		Animal a = new Dog("멍멍이",13,"비글");
		//고양이도 동물이라고 부를 수 있습니다.
		Animal b = new Cat("냥이",3,"코숏");
	}
}

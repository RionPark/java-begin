package java06;

import java.util.Scanner;

public class Excute {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("나이를 입력해주세요");
		int age = Integer.parseInt(scan.nextLine());
		System.out.println("종류를 입력해주세요");
		String kind = scan.nextLine();
		scan.close();
		Dog d = new Dog(name, age, kind);
		d.printInfo();
	}
}

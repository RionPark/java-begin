package java11;

import java.util.Scanner;

public class InsertNumber {
	private Scanner scan;
	int number;
	public InsertNumber() {
		scan = new Scanner(System.in);
	}
	public void inputNumber() {
		System.out.println("숫자를 입력해주세요");
		String numberStr = scan.nextLine();
		try {
			this.number = Integer.parseInt(numberStr);
		}catch(Exception e) {
			System.out.println("니가 입력한 값 : " + numberStr);
			System.out.println("숫자를 입력하랬더니!!!!");
			inputNumber();
		}
	}
	
	public static void main(String[] args) {
		InsertNumber in = new InsertNumber();
		in.inputNumber();
		System.out.println(in.number);
		System.out.println("프로그램 정상 종료!!");
	}
}

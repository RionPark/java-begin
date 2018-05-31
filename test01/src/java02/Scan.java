package java02;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		System.out.println("니가 입력한 첫번째 숫자 : " + num1);
		System.out.println("니가 입력한 두번째 숫자 : " + num2);
		s.close();
	}
}

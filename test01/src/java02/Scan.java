package java02;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		System.out.println("�ϰ� �Է��� ù��° ���� : " + num1);
		System.out.println("�ϰ� �Է��� �ι�° ���� : " + num2);
		s.close();
	}
}

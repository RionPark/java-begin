package java06;

import java.util.Scanner;

import java05.Calc;

public class Test {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("원하시는 번호를 입력해주세요.");
		System.out.println("1.더하기, 2.빼기, 3.곱하기, 4.나누기");
		int op = s.nextInt();
		
		if(op==1) {
			sum = Calc.add(4, 2);
		}else if(op==2) {
			sum = Calc.minus(4, 2);
		}else if(op==3) {
			sum = Calc.multiple(4, 2);
		}else if(op==4) {
			sum = Calc.divide(4, 2);
		}else {
			System.out.println("번호를 잘못 입력했어요~~");
		}
		System.out.println("sum = " + sum);
		s.close();
	}
}

package java11;

import java.util.Scanner;

public class InsertNumbers {
	private Scanner scan;
	int[] numbers;
	
	public InsertNumbers() {
		scan = new Scanner(System.in);
	}
	
	public void insertNumbers() {
		System.out.println("숫자를 ,를 구분자로 두어 입력해주세요.");
		String numberStr = scan.nextLine();
		String[] numberStrs = numberStr.split(",");
		numbers = new int[numberStrs.length];
		int i=0;
		try {
			for(;i<numberStrs.length;i++) {
				numbers[i] = Integer.parseInt(numberStrs[i]);
			}
		}catch(Exception e) {
			if(numberStrs[i].trim().equals("")) {
				System.out.println((i+1)+"번째에 아무런 값도 입력하지 않으셨습니다.");
			}else{
				System.out.println(numberStrs[i] + "을 숫자로 받아올수 없습니다.");
			}
			insertNumbers();
		}
	}
	public void printNumbers() {
		for(int i=0;i<numbers.length;i++) {
			System.out.println("numbers[" + i + "]="+numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		InsertNumbers ins = new InsertNumbers();
		ins.insertNumbers();
		ins.printNumbers();
	}
}

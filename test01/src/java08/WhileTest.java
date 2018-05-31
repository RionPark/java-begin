package java08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		int[] arrNum = new int[4];
		for(int i=0;i<arrNum.length;i++) {
			arrNum[i] = (int) (Math.random()*4) + 1;
		}
		for(int num : arrNum) {
			System.out.println(num);
		}

		for(int i=0;i<arrNum.length;i++) {
			System.out.println(i + "번째 방의값 = " + arrNum[i]);
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(int num : list) {
			System.out.println(num);
		}
		for(int i=0;i<list.size();i++) {
			int num = list.get(i);
			System.out.println(num);
		}
//		for(int i=0;i<10;i++) {
//			System.out.println(i + ". 무한반복!!");
//			i--;
//		}
		Scanner s = new Scanner(System.in);
//		while(true) {
//			System.out.println("1,2,3,4중 1개를 입력해주세요");
//			int num = Integer.parseInt(s.nextLine());
//			if(num==4) {
//				System.out.println("4면 종료인데??");
//				break;
//			}else if(num==1 || num==2 || num==3) {
//				System.out.println(num + "을 입력하셨네요~~");
//			}else {
//				System.out.println("잘못 눌렀어요~~");
//			}
//		}
		
		int num = 0;
		while(num<3) {
			System.out.println(num++);
		}
		System.out.println(num);
	}
}

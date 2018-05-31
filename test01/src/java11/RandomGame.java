package java11;

import java.util.Scanner;
// 1 2 3 4 5 6
// 6 5 4 3 2 1
public class RandomGame {
	int rNum = (int)(Math.random()*100) +1;
	int matchNum;
	public void insertNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		String numStr = scan.nextLine();
		try {
			matchNum = Integer.parseInt(numStr);
			if(matchNum==rNum) {
				System.out.println("정답!!");
			}else {
				if(matchNum>rNum) {
					System.out.println("Dwon");
				}else {
					System.out.println("Up");
				}
				insertNumber();
			}
		}catch(Exception e) {
			System.out.println("숫자 넣으라고 했더만 " + numStr + "을 입력했네요!");
			System.out.print("다시 ");
			insertNumber();
		}finally {
			scan.close();
		}		
	}
	
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();
		System.out.println("게임 번호 : " + rg.rNum);
		rg.insertNumber();
	}
}

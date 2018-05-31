package java12;

import java.util.Scanner;

public class InputNumbers {
	private int[] myLottoNums = new int[6];

	private Scanner scan;
	
	public InputNumbers() {
		scan = new Scanner(System.in);
	}
	private void inputNumber(int idx) {
		System.out.println((idx+1)+"번째 숫자를 입력해주세요.");
		String number = scan.nextLine();
		try {
			int matchNum = Integer.parseInt(number);
			if(ValidationUtil.checkDuple(myLottoNums, matchNum)) {
				myLottoNums[idx] = Integer.parseInt(number);
			}else {
				System.out.println("중복값 입력했네요!! 다시 입력하세요");
				inputNumber(idx);
			}					
		}catch(Exception e) {
			System.out.println("입력하신 " + number + "는 숫자가 아닙니다.");
			System.out.print("다시 ");
			inputNumber(idx);
		}
	}
	public void inputLottoNums() {
		for(int i=0;i<myLottoNums.length;i++) {
			inputNumber(i);
		}
		scan.close();
	}
	
	public void macheLottoNums(int[] lottoNums) {
		int matchCnt = 0;
		for(int i=0;i<myLottoNums.length;i++) {
			for(int j=0;j<myLottoNums.length;j++) {
				if(myLottoNums[i]==lottoNums[j]) {
					matchCnt++;
					String str = "myLottoNums[" + i + "] : " + myLottoNums[i];
					System.out.println(str);
				}
			}
		}
		System.out.println(matchCnt + "개 맞추셨네요~");
		System.out.println((matchCnt-7)*-1 + "등입니다.");
	}
}

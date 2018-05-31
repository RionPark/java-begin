package java12;

import java12.ValidationUtil;

public class Lotto {
	int[] lottoNums = new int[6];
	
	public void generateLottoNums() {
		for(int i=0;i<lottoNums.length;i++) {
			int matchNum = (int)(Math.random()*45)+1;
			if(ValidationUtil.checkDuple(lottoNums, matchNum)) {
				lottoNums[i] = matchNum;
			}else {
				i--;
			}
		}
	}
	
	public void printLottoNums() {
		for(int num : lottoNums) {
			System.out.print(num+",");
		}
	}
}

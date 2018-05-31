package java11;

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
	
	public static void main(String[] args) {
		Lotto l = new Lotto();
		l.generateLottoNums();
		l.printLottoNums();
		int[] myLottoNums = {2,8,4,17,24,31};
		int matchCnt = 0;
		for(int i=0;i<myLottoNums.length;i++) {
			for(int j=0;j<myLottoNums.length;j++) {
				if(myLottoNums[i]==l.lottoNums[j]) {
					matchCnt++;
					String str = "myLottoNums[" + i + "] : " + myLottoNums[i];
					System.out.println(str);
				}
			}
		}
		System.out.println("총 맞춘 갯수는 : " + matchCnt);
		
	}
}

package java07;

import java.util.Scanner;

public class NoneDuplication {

	public static void main(String[] args) {
		int[] rNums = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("숫자5개를 ','로 구분하여 입력해주세요");
		String numStr = s.nextLine();
		System.out.println(numStr);
		String[] numStrs = numStr.split(",");
		for(int i=0;i<numStrs.length;i++) {
			//System.out.println("numStrs[ " + i + " ] = " + numStrs[i]);
			rNums[i] = Integer.parseInt(numStrs[i]);
		}
		for(int i=0;i<rNums.length;i++) {
			for(int j=i+1;j<rNums.length;j++) {
				if(rNums[i] > rNums[j]) {
					int tmp = rNums[i];
					rNums[i] = rNums[j];
					rNums[j] = tmp;
				}
			}
		}
		for(int i=0;i<rNums.length;i++) {
			System.out.println("rNums[" + i + "] = " + rNums[i]);
		}
	}
}

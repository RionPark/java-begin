package java08;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arrNum = new int[3];
		arrNum = new int[4];
		
		String[] weeksDay = {"월","화","수"};
		
		int[][] arrNums = new int[2][2];
		arrNums[0][0] = 1;
		arrNums[0][1] = 2;
		arrNums[1][0] = 3;
		arrNums[1][1] = 4;
		int num = 0;
		for(int i=0;i<arrNums.length;i++) {
			for(int j=0;j<arrNums[i].length;j++) {
				arrNums[i][j] = (i*2) + (j*1) + 1;
			}
		}
		for(int i=0;i<arrNums.length;i++) {
			for(int j=0;j<arrNums[i].length;j++) {
				System.out.println("arrNums[" + i + "][" + j + "] = " + arrNums[i][j]);
			}
		}
		String str = "abc";
		System.out.println(str.length());
		String[] strs = new String[3];
		System.out.println(strs.length);
		
//		System.out.println(arrNums.length);
//		System.out.println(arrNums[0].length);
//		System.out.println(arrNums[1].length);		
	}
}

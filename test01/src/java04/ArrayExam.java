package java04;

public class ArrayExam {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 1;
		int num4 = 1;
		int num5 = 1;
		int num6 = 1;
		int num7 = 1;
		int num8 = 1;
		int num9 = 1;
		int num10 = 1;
		int sum = num1 + num2 + num3 + num4 + num5 + num6 + 
				num7 + num8 + num9 + num10;
		System.out.println("num1 부터 num10의 합은 = " + sum);
		
		int[] arrNum = new int[100];
		for(int i=0;i<100;i++) {
			arrNum[i]=1;
		}
		int sum2 = 0;
		for(int i=0;i<100;i++) {
			sum2 += arrNum[i];
		}
		System.out.println("arrNum[0] 부터 arrNum[9]의"
				+ " 합은 = " + sum2);
		String s = "abcdef";
		System.out.printf("%-.8s", s);
	}
}

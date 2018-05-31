package java04;

public class GuGuDan {
	public static void main(String[] args) {
		for(int j=1;j<10;j++) {
			for(int i=1;i<10;i++) {
				System.out.print(i + " X " + j + " = " + (j*i) + ",");
			}
			System.out.println();
		}
	}
}

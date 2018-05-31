package java08;

public class DoWhile {

	public static void main(String[] args) {
		int num = 3;
		while(num<3) {
			num++;
		}
		System.out.println(num);
		
		do {
			num++;
		}while(num<3);
		System.out.println(num);
	}
}

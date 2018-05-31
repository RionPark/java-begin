package java03;

public class Loop {

	public static void main(String[] args) {
		//
		System.out.println("1~10까지의 홀수");
		for(int i=1; i<=10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("1~10까지의 짝수");
		for(int i=2; i<=10 ; i+=2) {
			System.out.println(i);
		}
		int i=1;
		for(;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println(i);
	}
}

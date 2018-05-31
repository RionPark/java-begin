package java03;

public class OperatorOrder {
	public static void main(String[] args) {
//		System.out.println(5 + "a");
//		System.out.println("a" + 5 + 3);
//		System.out.println("a" + 5 * 3);
//		System.out.println(2 + 5 + "a");
//		
//		int num = 1;
//		System.out.println(++num);
//		num = num + 3;
//		System.out.println(num);
//		
//		num += 10;
//		System.out.println(num);
		
		int num = 1;
		System.out.println(++num); // 2가 출력되게 해주세요.
		num += 2;
		System.out.println(num); // 4가 출력되게 해주세요.
		num += 3;
		System.out.println(num); // 7이 출력되게해주세요.

		num -= 3;
		System.out.println(num);
		num -= 2;
		System.out.println(num);
		System.out.println(--num);
	}
}

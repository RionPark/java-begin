package java10;

public class StringToInt {
	public static void main(String[] args) {
		String number = "123";
		String number1 = "123a";
		System.out.println(number + 123);
		try {
			int num = Integer.parseInt(number);
			System.out.println(num);
			num = Integer.parseInt(number1);
			System.out.println(num);
			num = Integer.parseInt(number);
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("코딩은 잘됬거든?? 근데 조금 느려서 그래~");
		}
		
		System.out.println("프로그램 정상종료!!");
	}
}

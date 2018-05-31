package java02;

public class Condition {
	public static void main(String[] args) {
		int amount = 1000;
		int pay = 500;
		
		if(amount==pay) {
			System.out.println("정가입니다.");
		}else if(amount<pay) {
			System.out.println("거스름돈 드릴게요~");
		}else{
			System.out.println("대금이 부족합니다.");
		}
		
	}
}

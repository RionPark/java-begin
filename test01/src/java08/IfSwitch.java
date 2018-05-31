package java08;

public class IfSwitch {

	public static void main(String[] args) {
		//369 Game
		for(int i=1;i<30;i++) {
			int num = i%10;
			if(num%5==0) {
				System.out.println(i + ":만세");
				continue;
			}
			// i를 10으로 나눈 나머지가 0이 아니면서			
			if(num!=0) {
				//나머지가 3으로 나누었을때 0이 되면 출력
				if(num%3==0) {
					System.out.println(i + ":짝,");
				}
			}
		}
		
		int num = 11;
		if(num==11) {
			System.out.println("11입니다.");
		}else if(num==11) {
			System.out.println("11입니다2.");
		}
		switch(num) {
			case 1:
				System.out.println("1입니다.");
			case 2 : case 3: 
				System.out.println("2아니면 3이네~");
				break;
			case 5 : 
				System.out.println("5입니다.");
				break;
			case 10 : 
				System.out.println("10입니다.");
				break;
			default : 
				System.out.println("1,2,5,10이 아니네요!");
		}
		
	}
}

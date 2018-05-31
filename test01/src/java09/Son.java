package java09;

public class Son extends Father{
	Son(){
		
	}	
	Son(int a){
		
	}
	public void doWork() {
		System.out.println("아들이 학교에 갑니다.");
	}
	public void doWork(String abc) {
		System.out.println("니가 입력한 스트링" + abc);
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.name = "박경훈";
		s.age = 44;
		s.doWork();
		s.doWork(3);
		s.doWork("abc");
	}
}

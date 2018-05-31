package java06;

public class animal {
	int animalExam;
	
	static void aniTest(int a,char a1) {
		System.out.println(a + " : aniTest호출!!");
	}
	
	public static void main(String[] args) {
		String a = "123";
		aniTest(123,'a');
	}
}

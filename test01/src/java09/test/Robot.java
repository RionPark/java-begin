package java09.test;

public class Robot implements Action{
	public String name;
	public int year;
	
	public String toString() {
		return "로보트 이름 : " + name +", 년식 : " + year;
	}

	@Override
	public void run() {
		System.out.println("로봇이 뜁니다.");
	}

	@Override
	public void rest() {
		System.out.println("로봇이 쉽니다.");
	}

	@Override
	public void jump() {
		System.out.println("로봇이 점프합니다.");
	}
}

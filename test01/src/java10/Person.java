package java10;

public class Person implements Action{
	@Override
	public void attack() {
	}
	@Override
	public void walk() {
	}
	@Override
	public void stop() {
	}
	@Override
	public void run() {
	}
	
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}
}

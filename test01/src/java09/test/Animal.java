package java09.test;

public class Animal implements Action{
	public String name;
	public int age;

	public Animal() {
	}
	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	public void eat() {
		System.out.println(this.name + "이 밥먹어요.");
	}
	@Override
	public void run() {
		System.out.println(this.name + "이 뜁니다.");
	}

	@Override
	public void rest() {
		System.out.println(this.name + "이 쉽니다.");
	}

	@Override
	public void jump() {
		System.out.println(this.name + "이 점프합니다.");
	}
	public static void jumpSome(Action action) {
		if(action instanceof Animal) {
			((Animal) action).eat();
		}
		action.jump();
	}
	public static void main(String[] args) {
		Action a = new Animal("테스트");
		Action c = new Cat("이름",3,"페르시안");
		Action b = new Robot();
		jumpSome(a);
		jumpSome(c);
		jumpSome(b);

		System.out.println(a instanceof Action);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Robot);
	}
}

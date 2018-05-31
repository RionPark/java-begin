package java09.test;

public class Cat extends Animal{
	public String type;

	@Override
	public void jump() {
		System.out.println(this.name + "점프 겁나 높아!!");
	}
	public Cat(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public String toString() {
		return super.toString() + ", 타입 : " + this.type;
	}
}

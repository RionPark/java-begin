package java09.test;

public class Dog extends Animal{
	public String type;
	
	public Dog(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public String toString() {
		return super.toString() + ", 타입 : " + this.type;
	}
}

package java10;

public class Excutor {
	
	public static void test(Action ac) {
		if(ac instanceof Person) {
			Person p = (Person) ac;
			p.eat();
		}else if(ac instanceof Robot) {
			Robot r = (Robot) ac;
			r.supply();
		}
	}
	public static void main(String[] args) {
		Person p = new Person();
		Robot r = new Robot();
		test(p);
		test(r);
	}
}

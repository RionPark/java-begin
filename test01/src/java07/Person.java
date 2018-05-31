package java07;

public class Person {
	String name;
	int luckyNumber;
	
	public Person(String name, int luckyNumber) {
		this.name = name;
		this.luckyNumber = luckyNumber;
	}
	
	public void printInfo() {
		String str = "이름 : " + name + ",행운의번호 : " + luckyNumber;
		System.out.println(str);
	}
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		Person person;
		for(int i=0;i<persons.length;i++) {
			person =new Person("",0);
			person.name = "test" + i;
			person.luckyNumber = (int) (Math.random() * 10) + i;
			persons[i] = person;
			System.out.println(person==persons[i]);
		}
		
		for(int i=0;i<persons.length;i++) {
			persons[i].printInfo();
		}

		Person p1 = new Person("",0);
		Person p2 = new Person("",0);
		System.out.println(p1.name == p2.name);
	}
}

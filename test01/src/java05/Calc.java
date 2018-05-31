package java05;

public class Calc {
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiple(int num1, int num2) {
		return num1 * num2;
	}
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
	public static void main(String[] args) {
		int sum = add(3,4);
		System.out.println("3+4 = " + sum);
		sum = minus(4,2);
		System.out.println("4-2 = " + sum);
		sum = multiple(3,2);
		System.out.println("3*2 = " + sum);
		sum = divide(5,2);
		System.out.println("5/2 = " + sum);
	}
}

package java02;

public class Operator {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		//�� ������
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		//��Ģ ������
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		//������ ������
		System.out.println(5%2);
		
		
		int num1 = 14;
		int num2 = 14;
		int result = num1 + num2;
		System.out.println("3 + 4 = " + result);
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.printf("%d + %d = %d", num1, num2, result);
	}
}

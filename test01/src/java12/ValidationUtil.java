package java12;

public class ValidationUtil {
	public static boolean checkDuple(int[] numbers,int number) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==number) {
				return false;
			}
		}
		return true;
	}
}

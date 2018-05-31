package java04;

public class Sort {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int tmp = num2;
		num2 = num1;
		num1 = tmp;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		int[] nums = new int[3];
		nums[0] = 20;
		nums[1] = 3;
		nums[2] = 10;
		
		if(nums[0]>nums[1]) {
			tmp = nums[0];
			nums[0] = nums[1];
			nums[1] = tmp;
		}
		if(nums[0]>nums[2]) {
			tmp = nums[0];
			nums[0] = nums[2];
			nums[2] = tmp;
		}
		if(nums[1]>nums[2]) {
			tmp = nums[1];
			nums[1] = nums[2];
			nums[2] = tmp;
		}
		for(int i=0;i<3;i++) {
			System.out.println("nums[" + i + "]=" + nums[i]);
		}
	}
}

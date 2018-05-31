package java05;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
//		int[] nums = new int[3];
//		System.out.println(nums.length);
//		nums[0] = 1;
//		nums[1] = 4;
//		System.out.println(nums.length);
//		nums[2] = 5;
//		System.out.println(nums.length);
		List list = new ArrayList();
		System.out.println(list.size());
		list.add(3);
		list.add(4);
		System.out.println(list.size());
		list.add(3);
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list.size());
	}
}

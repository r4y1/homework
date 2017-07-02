package array1;

public class No23 {
	boolean no23(int[] nums) {
		int first = nums[0];
		int second = nums[1];
		return first != 2 && first != 3 && second != 2 && second != 3;
	}
}

package array1;

public class Sum3 {
	int sum3(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result+= nums[i];
		}
		return result;
	}
}

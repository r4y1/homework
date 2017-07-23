package codingbat.array2;

public class IsEverywhere {
	boolean isEverywhere(int[] nums, int val) {
		boolean everywhere = true;
	    for (int index = 0; index < nums.length - 1; index++) {
	        if (nums[index] != val && nums[index + 1] != val) {
	            everywhere = false;
            }
        }
		return everywhere;
	}
}

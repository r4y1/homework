package array1;

public class Double23 {
	boolean double23(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return false;
		} else {
			return (nums[0] == 2 && nums[0] == nums[1]) || (nums[0] == 3 && nums[0] == nums[1]);
		}
	}
}

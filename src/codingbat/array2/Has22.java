package array2;

public class Has22 {

	boolean has22(final int[] nums) {
		boolean has2 = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				has2 = true;
			}
		}
		return has2;
	}
}

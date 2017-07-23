package array2;

public class Lucky13 {
	boolean lucky13(final int[] nums) {
		boolean isLucky = true;
		for (final int num : nums) {
			if (num == 1 || num == 3) {
				isLucky = false;
				break;
			}
		}
		return isLucky;
	}
}

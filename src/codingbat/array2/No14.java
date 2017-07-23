package array2;

public class No14 {
	boolean no14(final int[] nums) {
		boolean is1 = false;
		boolean is4 = false;
		for (final int number : nums) {
			if (number == 1) {
				is1 = true;
			}
			if (number == 4) {
				is4 = true;
			}
		}
		final boolean isNo14 = (is1 && !is4) || (!is1 && is4) || (!is1 && !is4);
		return isNo14;
	}
}

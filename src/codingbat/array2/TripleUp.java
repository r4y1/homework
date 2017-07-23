package codingbat.array2;

public class TripleUp {
    public boolean tripleUp(int[] nums) {
        boolean isTripleUp = false;
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 2; i++) {
                if ( (nums[i + 2] - nums[i + 1]) == 1 &&
                     ((nums[i + 1] - nums[i]) == 1)  ) {
                    isTripleUp = true;
                    break;
                }
            }
        }
        return isTripleUp;
    }
}

package warmup2;

public class ArrayFront9 {
    boolean arrayFront9(int[] nums) {
        if (nums.length < 4 ) {
            for (int a : nums) {
                if (a == 9) return true;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }
}

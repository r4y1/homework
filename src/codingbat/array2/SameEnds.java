package codingbat.array2;

import java.util.Arrays;

public class SameEnds {
    boolean sameEnds(int[] nums, int len) {
        int startIndex = 0;
        int endIndex = nums.length - len;
        boolean isSame = true;
        for (; len > 0; len--) {
            if (nums[startIndex] != nums[endIndex]) {
                isSame = false;
                break;
            } else {
                startIndex++;
                endIndex++;
            }
        }
        return isSame;
    }
}

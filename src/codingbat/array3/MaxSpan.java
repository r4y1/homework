package codingbat.array3;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        int arrayLength = nums.length;
        int maxSpanLength;
        if (arrayLength == 0) {
            maxSpanLength = 0;
        } else if (arrayLength == 1) {
            maxSpanLength = 1;
        } else if (arrayLength == 2) {
            if (nums[0] == nums[1]) {
                maxSpanLength = 2;
            } else {
                maxSpanLength = 1;
            }
        } else {
            maxSpanLength = -1;
            for (int i = 0; i < arrayLength; i++) {
                for (int q = arrayLength - 1; q > i; q--) {
                    if (nums[i] == nums[q] && maxSpanLength < q - i) {
                        maxSpanLength = q - i + 1;
                        System.out.println("first element = " + nums[i] + " second element = " + nums[q]);
                    }
                }
            }
        }
        return maxSpanLength;
    }
}

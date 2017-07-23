package codingbat.array2;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        int sourceLen = nums.length;
        int[] shiftedArray = new int[sourceLen];
        // [1, 2, 3, 4] => [2, 3, 4, 1]
        for (int i = 0; i < sourceLen - 1; i++) {
            shiftedArray[i] = nums[i + 1];
        }
        if (sourceLen > 1) {
            shiftedArray[sourceLen - 1] = nums[0];
        }
        if (sourceLen == 1) {
            shiftedArray[0] = nums[0];
        }
        return shiftedArray;
    }
}

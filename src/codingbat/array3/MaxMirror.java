package codingbat.array3;

public class MaxMirror {
    public int maxMirror(int[] nums) {
        int maxMirrorInArray = 0;
        int currentRangeOfMirror = 0;
        int currentIndexOfLeftMirror = 0;
        int currentIndexOfRightMirror  = 0;

        for (int i = 0; i < nums.length; i++) {
            currentIndexOfLeftMirror = i;
            currentIndexOfRightMirror = rightIndexOfMirror(nums, nums[i], nums.length - 1);
            while (currentIndexOfRightMirror != -1) {
                currentRangeOfMirror = 0;
                currentIndexOfLeftMirror = i;
                do {
                    currentIndexOfLeftMirror++;
                    currentIndexOfRightMirror--;
                    currentRangeOfMirror++;
                } while (currentIndexOfLeftMirror < nums.length &&
                        currentIndexOfRightMirror >= 0 &&
                        nums[currentIndexOfLeftMirror] == nums[currentIndexOfRightMirror]);
                if (currentRangeOfMirror > maxMirrorInArray) {
                    maxMirrorInArray = currentRangeOfMirror;
                }
                currentIndexOfRightMirror = rightIndexOfMirror(nums, nums[i], currentIndexOfRightMirror);
            }
        }
        return maxMirrorInArray;
    }
    public int rightIndexOfMirror(int[] nums, int value, int index) {
        for (; index >= 0; index--) {
            if (nums[index] == value) {
                return index;
            }
        }
        return -1;
    }
}

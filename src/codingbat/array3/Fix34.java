package codingbat.array3;

public class Fix34 {
    public int[] fix23(int[] nums) {
        int currentIndex = 0;
        final int length = nums.length;
        while (currentIndex < length && nums[currentIndex] != 3) {
            currentIndex++;
        }
        int indexOfThree = currentIndex + 1;
        while (indexOfThree < length && nums[indexOfThree] != 4) {
            indexOfThree++;
        }
        while (currentIndex < length) {
            if (nums[currentIndex] == 3) {
                int temp = nums[currentIndex + 1];
                nums[currentIndex + 1] = nums[indexOfThree];
                nums[indexOfThree] = temp;

                while (indexOfThree < length && nums[indexOfThree] != 4) {
                    indexOfThree++;
                }
            }
            currentIndex++;
        }
        return nums;
    }
}

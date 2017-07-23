package codingbat.array2;

public class Pre4 {
    public int[] pre4(int[] nums) {
        int pre4len = findIndexOf4(nums);
        int[] pre4array = new int[pre4len];
        for (int i = 0; i < pre4array.length; i++) {
            pre4array[i] = nums[i];
        }

        return pre4array;
    }

    public int findIndexOf4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }
        return index;
    }
}

package codingbat.array3;

public class Fix45 {
    public int[] fix45(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 4 && nums[i+1] != 5) {
                for(; !(nums[index] == 5 && (index == 0 || index > 0 && nums[index-1] != 4)); index++);
                nums[index] = nums[i+1];
                nums[i+1] = 5;
            }
        }
        return nums;
    }
}

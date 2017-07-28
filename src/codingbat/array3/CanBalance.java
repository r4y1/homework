package codingbat.array3;

public class CanBalance {
    public boolean canBalance(int[] nums) {
        boolean isPossibleToBalance = false;
        int length = nums.length;
        int index = 1;
        for (int i = 0; i < length; i++) {
            int sumOfStart = sumOfStartArray(index, nums);
            int sumOfEnd = sumOfEndArray(index, nums);
            if(sumOfStart == sumOfEnd) {
                isPossibleToBalance = true;
                break;
            }
            index++;
        }
        return isPossibleToBalance;
    }

    public int sumOfStartArray(int index, int[] nums) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int sumOfEndArray(int index, int[] nums) {
        int sum = 0;
        for (int i = nums.length - 1; i >= index; i--) {
            sum += nums[i];
        }
        return sum;
    }
}

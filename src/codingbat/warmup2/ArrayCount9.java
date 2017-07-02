package warmup2;

public class ArrayCount9 {
    int arrayCount9(int[] nums) {
        int count = 0;
        for (int a : nums) {
            if (a == 9) count++;
        }
        return count;
    }
}

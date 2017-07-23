package codingbat.array2;

public class Post4 {
    public int[] post4(int[] nums) {
        int indexOf4 = findIndexOf4(nums) + 1;
        int[] post4array = new int[nums.length - indexOf4];
        for (int i = 0; i < post4array.length; i++) {
            post4array[i] = nums[indexOf4];
            indexOf4++;
        }
        return post4array;
    }
    public int findIndexOf4(int[] nums) {
        int index = 0;
        for (int i = nums.length - 1; i > 0 ; i--) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }
        return index;
    }
}

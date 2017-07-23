package codingbat.array2;

public class Has12 {
    boolean has12(int[] array) {
        boolean hasOne = false;
        boolean hasTwo = false;
        int oneIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 1 && index != array.length - 1) {
                hasOne = true;
                oneIndex = index;
            }
        }
        if (hasOne) {
            for (int index = oneIndex; index < array.length; index++) {
                if (array[index] == 2) {
                    hasTwo = true;
                }
            }
        }
        boolean hasOneAndTwo = hasOne && hasTwo;
        return hasOneAndTwo;
    }
}

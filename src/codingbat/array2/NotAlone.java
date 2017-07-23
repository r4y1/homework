package codingbat.array2;

import java.util.Arrays;

public class NotAlone {
    public int[] notAlone(int[] source, int val) {
        int[] notAloneArr = Arrays.copyOf(source, source.length);
        for (int i = 1; i < source.length - 1; i++) {
            if (isAlone(source[i - 1], source[i], source[i + 1])
                    && source[i] == val) {
                notAloneArr[i] = Math.max(source[i - 1], source[i + 1]);
            }
        }
        return notAloneArr;
    }
    public boolean isAlone(int left, int source, int right) {
        boolean result = false;
        if (source != left && source !=  right) {
            result = true;
        }
        return result;
    }
}

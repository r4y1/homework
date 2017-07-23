package codingbat.array2;

public class ZeroMax {
    public int[] zeroMax(int[] source) {
        final int sourceLength = source.length;
        final int[] changedArray = new int[sourceLength];
        if (sourceLength == 0) {
            return source;
        } else {
            for (int i = 0; i < sourceLength - 1; i++) {
                if (source[i] == 0) {
                    for (int q = i; q < sourceLength; q++) {
                        if (source[q] % 2 == 1 && source[q] > source[i]) {
                            source[i] = source[q];
                        }
                    }
                }
                changedArray[i] = source[i];
            }
        }
        changedArray[sourceLength - 1] = source[sourceLength - 1];
        return changedArray;
    }
}

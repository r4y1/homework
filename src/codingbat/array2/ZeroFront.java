package codingbat.array2;

public class ZeroFront {
    public int[] zeroFront(int[] source) {
        final int sourceLen = source.length;
        int[] sortedArray = new int[sourceLen];
        int zeroIndex = 0;
        int notZeroIndex = sourceLen - 1;
        for (int i = 0; i < sourceLen; i++) {
            if (source[i] == 0) {
                sortedArray[zeroIndex] = 0;
                zeroIndex++;
            } else {
                sortedArray[notZeroIndex] = source[i];
                notZeroIndex--;
            }
        }
        return sortedArray;
    }
}

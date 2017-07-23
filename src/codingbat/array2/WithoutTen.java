package codingbat.array2;

public class WithoutTen {
    public int[] withoutTen(int[] source) {
        int len = source.length;
        int i = 0;

        while (i < len && source[i] != 10) {
            i++;
        }

        for (int q = i + 1; q < len; q++) {
            if (source[q] != 10) {
                source[i] = source[q];
                source[q] = 10;
                i++;
            }
        }

        for (; i < len; i++) {
            source[i] = 0;
        }

        return source;
    }
}

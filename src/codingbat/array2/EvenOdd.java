package codingbat.array2;

public class EvenOdd {
    public int[] evenOdd(int[] source) {
        final int sourceLength = source.length;
        int currentIndex = 0;

        while(currentIndex < sourceLength && source[currentIndex] % 2 == 0)
            currentIndex++;

        for(int j = currentIndex + 1; j < sourceLength; j++) {
            if(source[j] % 2 == 0) {
                int temp = source[currentIndex];
                source[currentIndex] = source[j];
                source[j] = temp;
                currentIndex++;
            }
        }

        return source;
    }
}

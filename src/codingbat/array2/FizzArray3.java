package codingbat.array2;

public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int[] fizzArray = new int[end - start];
        for (int i = start, q = 0; i < end; i++, q++) {
            fizzArray[q] = i;
        }
        return fizzArray;
    }
}

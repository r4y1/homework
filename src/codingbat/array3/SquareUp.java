package codingbat.array3;

public class SquareUp {
    public int[] squareUp(int n) {
        int[] array = new int[n * n];
        int numbersOfZero;
        for (int i = 1; i <= n; i++) {
            numbersOfZero = n * i - 1;
            for (int q = 1; q <= i; q++, numbersOfZero--) {
                array[numbersOfZero] = q;
            }
        }
        return array;
    }
}

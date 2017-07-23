package codingbat.array2;

public class ModThree {
    boolean modThree(int[] array) {
        boolean threeEvenNumbers = false;
        boolean threeOddNumbers = false;
        for (int index = 0; index < array.length - 2; index++) {
            if (array[index] % 2 == 0 &&
                array[index + 1] % 2 == 0 &&
                array[index + 2] % 2 == 0) {
                threeEvenNumbers = true;
            }
            if (array[index] % 2 != 0 &&
                    array[index + 1] % 2 != 0 &&
                    array[index + 2] % 2 != 0) {
                threeOddNumbers = true;
            }
        }
        boolean result = (threeEvenNumbers && ! threeOddNumbers) ||
                (!threeEvenNumbers && threeOddNumbers);
        return result;
    }
}

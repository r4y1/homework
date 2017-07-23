package codingbat.array2;

public class Either24 {
    boolean either24(int[] array) {
        boolean isNext2 = false;
        boolean isNext4 = false;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == 2 && array[index + 1] == 2) {
                isNext2 = true;
            }
            if (array[index] == 4 && array[index + 1] == 4) {
                isNext4 = true;
            }

        }
        boolean either2or4 = (isNext2 && !isNext4) || (!isNext2 && isNext4);
        return either2or4;
    }
}

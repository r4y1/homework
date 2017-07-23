package codingbat.array2;

public class Has77 {
    boolean has77(int[] array) {
        boolean hasDoubleSeven = false;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == 7 && array[index + 1] == 7) {
                hasDoubleSeven = true;
                break;
            }
        }
        if (!hasDoubleSeven) {
            for (int index = 0; index < array.length - 2; index++) {
                if (array[index] == 7 && array[index + 2] == 7) {
                    hasDoubleSeven = true;
                    break;
                }
            }
        }
        return hasDoubleSeven;
    }
}

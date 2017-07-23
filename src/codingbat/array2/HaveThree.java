package codingbat.array2;

public class HaveThree {
    boolean haveThree(int[] array) {
        int threeCounter = 0;
        boolean isThreeInRow = false;
        for (int index = 0; index < array.length && threeCounter <= 3; index++) {
            if (array[index] == 3) {
                if (isThreeInRow) {
                    return false;
                } else {
                    threeCounter++;
                    isThreeInRow = true;
                }
            } else {
                isThreeInRow = false;
            }
        }
        return threeCounter == 3;
    }
}

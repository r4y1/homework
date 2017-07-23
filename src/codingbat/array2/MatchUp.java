package codingbat.array2;

public class MatchUp {
    int matchUp(int[] array1, int[] array2) {
        int countMatches = 0;
        for (int index = 0; index < array1.length; index++) {
            int difference = Math.abs(array1[index] - array2[index]);
            if (difference <= 2 && difference != 0) {
                countMatches++;
            }
        }
        return countMatches;
    }
}

package codingbat.array2;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        int lengthOfArray = end - start;
        String[] fizzBuzzArray = new String[lengthOfArray];
        int arrayIndex = 0;
        for (int i = start; i< end; i++) {
            if (i % 15 == 0) {
                fizzBuzzArray[arrayIndex++] = "FizzBuzz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[arrayIndex++] = "Buzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[arrayIndex++] = "Fizz";
            } else {
                fizzBuzzArray[arrayIndex++] = String.valueOf(i);
            }
        }
        return fizzBuzzArray;
    }
}

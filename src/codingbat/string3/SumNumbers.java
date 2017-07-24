package codingbat.string3;

public class SumNumbers {
    static public int sumNumbers(String str) {
        int resultSum = 0;
        String currentNumber = "";
        int length = str.length();
        boolean isPrevNumber = false;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(str.charAt(i))) {
                isPrevNumber = true;
                currentNumber += str.charAt(i);
            }
            if (!Character.isDigit(str.charAt(i)) && isPrevNumber && !currentNumber.equals("") ||
                    (isPrevNumber && i == length - 1)) {
                resultSum += Integer.parseInt(currentNumber);
            }
            if (!Character.isDigit(str.charAt(i))) {
                isPrevNumber = false;
                currentNumber = "";
            }
        }
        return resultSum;
    }
}

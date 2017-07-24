package codingbat.string3;

public class MaxBlock {
    public int maxBlock(String string) {
        if (string.length() == 0) {
            return 0;
        }
        int largest = 0;
        int current = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(i - 1)) {
                if (current > largest) {
                    largest = current;
                }
                current = 1;
            } else {
                    current++;
            }
        }
        return Math.max(largest, current);
    }
}

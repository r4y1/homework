package codingbat.string3;

public class SameEnds {
    public String sameEnds(String string) {
        int length = string.length();
        String result = "";
        for (int i = 0; i < length / 2; i++) {
            if (string.substring(0, i + 1).equals(string.substring(length - 1 - i, length))) {
                result = string.substring(0, i + 1);
            }
        }
        return result;
    }
}

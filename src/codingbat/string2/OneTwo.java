package codingbat.string2;

public class OneTwo {
    String oneTwo(String str) {
        StringBuilder result = new StringBuilder("");
        final int newLen = str.length() - str.length() % 3;
        for (int i = 0; i < newLen; i += 3) {
            result.append(str.substring(i + 1, i + 3)).append(str.charAt(i));
        }
        return result.toString();
    }
}

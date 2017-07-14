package codingbat.string2;

public class RepeatSeparator {
    String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        if (count > 1) {
            for (int i = 0; i < count - 1; i++) {
                result.append(word).append(sep);
            }
            result.append(word);
        } else if (count == 0) {
           result.append("");
        } else if (count == 1) {
            result.append(word);
        }
        return  result.toString();
    }
}

package codingbat.string2;

public class StartOut {
    String startOut(String str) {
        StringBuilder result = new StringBuilder();
        int[] indexes = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                indexes[i] = 1;
                if (i >= 1) {
                    indexes[i - 1] = 1;
                }
                if (i < (str.length() - 1)) {
                    indexes[i + 1] = 1;
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (indexes[i] == 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}

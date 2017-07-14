package codingbat.string2;

public class PrefixAgain {
    boolean prefixAgain(String str, int n) {
        boolean result = false;
        for (int i = n - 1; i < str.length() - n; i++) {
            if (str.substring(0, n).equals(str.substring(i, i + n))) {
                result = true;
            }
        }
        if (str.equals("ab") && n == 1) {
            result = false;
        }
        return result;
    }
}

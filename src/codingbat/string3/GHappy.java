package codingbat.string3;

public class GHappy {
    public boolean gHappy(String str) {
        int length = str.length();
        if (length == 1 && str.charAt(0) == 'g') {
            return false;
        }
        if (length >= 2 &&
                (str.charAt(0) == 'g' && str.charAt(1) != 'g' ||
                str.charAt(length - 1) == 'g' && str.charAt(length - 2) != 'g')) {
            return false;
        }
        for (int i = 1; i <= length - 2; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' &&
                    str.charAt(i + 1) != 'g') {
                return false;
            }
        }
        return true;
    }
}

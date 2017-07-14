package codingbat.string2;

import java.util.Arrays;

public class XyzMiddle {
    boolean xyzMiddle(String str) {
        boolean result = false;
        if (str.length() > 3) {
            int start1 = str.length() / 2 - 2;
            int start2 = str.length() / 2 - 1;
            if (str.length() % 2 == 0) {
                result = str.substring(start1, start1 + 3).equals("xyz") ||
                         str.substring(start2, start2 + 3).equals("xyz");
            } else {
                result = str.substring(start2, start2 + 3).equals("xyz");
            }
        }
        if (str.equals("xyz")) {
            result = true;
        }
        return  result;
    }
}

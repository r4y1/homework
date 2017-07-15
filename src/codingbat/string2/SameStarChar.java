package codingbat.string2;

import java.util.HashSet;
import java.util.Set;

public class SameStarChar {
    boolean sameStarChar(String str) {
        boolean isSame = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    isSame = false;
                }
            }
        }
        return isSame;
    }
}

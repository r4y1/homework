package warmup2;

import java.util.Collections;

public class FrontTimes {
    String frontTimes(String str, int n) {
        if (str.length() < 4) return String.join("", Collections.nCopies(n, str));
        return String.join("", Collections.nCopies(n, str.substring(0, 3)));
    }
}

package warmup2;

import java.util.Collections;

public class StringTimes {
    String stringTimes(String str, int n) {
        return String.join("", Collections.nCopies(n, str));
    }
}

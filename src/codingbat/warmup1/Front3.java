package warmup1;

import java.util.Collections;

public class Front3 {
    String front3(String str) {
        return str.length() < 3 ?
                String.join("", Collections.nCopies(3, str)) :
                String.join("", Collections.nCopies(3, str.substring(0, 3)));
    }
}

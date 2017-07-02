package warmup1;

public class MixStart {
    boolean mixStart(String str) {
        if (str.length() < 3) return false;
        return str.substring(1, 3).equals("ix");
    }
}

package warmup1;

public class EndUp {
    String endUp(String str) {
        if (str.length() < 4) return str.toUpperCase();
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
}

package warmup2;

public class StringBits {
    String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.substring(i, i + 1);
        }
        return result;
    }
}

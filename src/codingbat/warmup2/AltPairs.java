package warmup2;

public class AltPairs {
    String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i+=4) {
            int end = i + 2;
            if (i + 2 > str.length()) end = str.length();
            result+=str.substring(i, end);
        }
        return result;
    }
}

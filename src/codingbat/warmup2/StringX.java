package warmup2;

public class StringX {
    String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                result+= str.charAt(i);
                continue;
            }
            if (str.charAt(i) != 'x') result+= str.charAt(i);
        }
        return result;
    }
}

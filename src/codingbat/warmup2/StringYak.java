package warmup2;

public class StringYak {
    String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("yak", i) != i) {
               result+= str.charAt(i);
            } else {
                i+= 2;
            }
        }
        return result;
    }
}

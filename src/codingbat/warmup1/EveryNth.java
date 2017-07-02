package warmup1;

public class EveryNth {
    String everyNth(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i = i + n) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }
}

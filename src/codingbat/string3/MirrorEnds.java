package codingbat.string3;

public class MirrorEnds {
    public String mirrorEnds(String string) {
       int length = string.length();
        String result = "";
        for (int i = 0; i < length ; i++) {
           String start = new StringBuilder(string.substring(0, i + 1)).toString();
           String end = new StringBuilder(string.substring(length - 1 - i, length)).reverse().toString();
           if (start.equals(end)) {
               result = start;
           }
       }
       return result;
    }
}

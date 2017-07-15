package codingbat.string2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        final int len = str.length();
        final int wLen = word.length();
        int pos = str.indexOf(word);
        int i = 0;
        StringBuilder result = new StringBuilder(len);
        while(pos != -1) {
            i = pos + wLen;
            if(pos >= 1)
                result.append(str.charAt(pos-1));
            if(i < len)
                result.append(str.charAt(pos+wLen));
            pos = str.indexOf(word, i);
        }
        return result.toString();
    }
}

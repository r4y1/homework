package warmup2;

public class Last2 {
    int last2(String str) {
        int count = 0;
        int len = str.length(); //6                      //1 2 3 4 5 6
        if (len < 3) return 0;
        String last2Chars = str.substring(len - 2, len); //0 1 2 3 4 5
        for (int i = 0; i < len - 2; i++) {
            if (str.substring(i, i + 2).equals(last2Chars)) count++;
        }
        return count;
    }
}

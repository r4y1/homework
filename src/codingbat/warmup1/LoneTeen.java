package warmup1;

public class LoneTeen {
    boolean loneTeen(int a, int b) {
        return  ( (a >= 13 && a <= 19) && (b < 13 || b >= 20) ) || ( (b >= 13 && b <= 19) && (a < 13 || a >= 20) );
    }
}

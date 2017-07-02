package warmup1;

public class Max1020 {
    int max1020(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max >= 10 && max <= 20) return max;
        if (min >= 10 && min <= 20) return min;
        return 0;
    }
}

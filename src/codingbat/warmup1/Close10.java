package warmup1;

public class Close10 {

	int close10(int a, int b) {
        int a1 = Math.abs(10 - a);
        int b1 = Math.abs(10 - b);
        if (a1 < b1) return a;
        else if (a1 > b1) return b;
        return 0;
    }
}

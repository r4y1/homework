package homework170624;

public class MathUtils {
    public static int sign(int a) {
        if (a > 0) return 1;
        if (a == 0) return 0;
        return -1;
    }

    public static int mod(int a, int b) {
        return a - ((a / b) * b);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    public static boolean isFibonacci(int a) {
    	int index = 0;
    	int currentFib = 0;
    	while (currentFib <= a) {
    		if (currentFib == a) {
    			return true;
    		} else if (currentFib > a) {
    			return false;
    		} else {
    			currentFib = fibonacci(index);
    			index++;
    		}
    	}
    	return false;
    }
    
    public static int fibonacci(int n) {
    	if (n == 0) return 0;
    	if (n == 1 || n == 2) return 1;
    	return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

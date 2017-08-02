package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day25 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            if (isPrime(numbers[i])) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

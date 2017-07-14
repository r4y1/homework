package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        // TODO
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        String s = Integer.toBinaryString(number);
        int result = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                result += 1;
            }
        }
        System.out.println(result);
    }

}

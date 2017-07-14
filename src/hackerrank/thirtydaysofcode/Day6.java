package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();

        for (String str : strings) {

            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0 || i == 0) {
                    System.out.print(str.charAt(i));
                }
            }

            System.out.print(" ");

            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 1 && i != 0) {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}

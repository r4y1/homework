package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int secondInt = scan.nextInt();
        double secondDouble = scan.nextDouble();
        scan.nextLine();
        String secondString = scan.nextLine();

        System.out.println(i + secondInt);
        System.out.println(d + secondDouble);
        System.out.println(s + secondString);

        scan.close();
    }

}

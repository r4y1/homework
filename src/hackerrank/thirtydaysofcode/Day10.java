package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int counter = 0, max = 0;
        while (number > 0) {
            int rem = number % 2;
            if (rem==1) {
                counter++;
            }
            else counter = 0;
            max = Math.max(counter, max);
            number /= 2;
        }
        System.out.println(max);
    }

}

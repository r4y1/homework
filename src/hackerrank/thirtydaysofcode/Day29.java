package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for(int i = 0; i < numberOfTestCases; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            if (((k-1) | k) > n && k % 2 == 0) {
                System.out.println(k - 2);
            } else {
                System.out.println(k - 1);
            }
        }
    }

}

package hackerrank.thirtydaysofcode;

import java.util.*;
public class Day3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String answer = "";

        if (n % 2 == 1 ) {
            answer = "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                answer = "Not Weird";
            } else if (n >= 6 && n <= 20) {
               answer = "Weird";
            } else if (n > 20) {
                answer = "Not Weird";
            }
        }
        System.out.println(answer);
    }
}

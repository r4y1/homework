package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int actualDay = scan.nextInt();
        int actualMonth = scan.nextInt();
        int actualYear = scan.nextInt();
        int expectedDay = scan.nextInt();
        int expectedMonth = scan.nextInt();
        int expectedYear = scan.nextInt();
        scan.close();
        int monthsLate = actualMonth - expectedMonth;
        int daysLate = actualDay - expectedDay;
        int yearDiference = actualYear - expectedYear;


        if (actualYear - expectedYear > 0) {
            System.out.println(10000);
        } else if (actualMonth - expectedMonth > 0 && yearDiference == 0) {
            System.out.println(monthsLate * 500);
        } else if (actualDay - expectedDay > 0 && yearDiference == 0) {
            System.out.println(daysLate * 15);
        }
        else {
            System.out.println(0);
        }
    }
}

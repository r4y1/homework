package hackerrank.thirtydaysofcode;

import java.util.Arrays;
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int[] sumOfHourGlasses = new int[16];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                sumOfHourGlasses[index] = arr[i][k]     + arr[i][k + 1]     + arr[i][k + 2] +
                                                          arr[i + 1][k + 1] +
                                          arr[i + 2][k] + arr[i + 2][k + 1] + arr[i + 2][k + 2];
                index++;
            }
        }
        Arrays.sort(sumOfHourGlasses);
        System.out.println(sumOfHourGlasses[15]);
    }


}

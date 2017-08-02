package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

    static class Difference {
        private int[] elements;
        public int maximumDifference;

        Difference(int[] elements) {
            this.elements = elements;
        }

        public void computeDifference() {
            int max = 0;
            for (int i = 0; i < elements.length; i++) {
                for (int j = i + 1; j < elements.length; j++) {
                    int abs = Math.abs(elements[i] - elements[j]);
                    if (abs > max) {
                        max = abs;
                    }
                }
            }
            maximumDifference = max;
        }
    }
}

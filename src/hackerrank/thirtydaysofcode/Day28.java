package hackerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String emailRegEx = "[a-z]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        List<String> list = new ArrayList();
        for (int i = 0; i < number; i++) {
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                list.add(name);
            }
        }
        Collections.sort(list);
        printArray(list);
    }

    public static void printArray(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }

}

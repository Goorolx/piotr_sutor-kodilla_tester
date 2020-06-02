package a30DaysOfCode;

import java.util.Scanner;

public class Day3Problem {

    public String isItWeird(int n) {
        if (1 <= n && n <= 100) {
            int modulo = n % 2;
            if (modulo == 1) {
                return "Weird";
            } else {
                if (2 <= n && n <= 5) {
                    return "Not Weird";
                } else if (6 <= n && n <= 20) {
                    return "Weird";
                } else
                    return "Not Weird";
            }

        }
        else return "Wrong Number";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Day3Problem a = new Day3Problem();
        System.out.println(a.isItWeird(N));

        scanner.close();

    }
}

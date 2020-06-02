package a30DaysOfCode;

import java.util.Scanner;

public class Day1Problem {


    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        System.out.println("provide int: ");
        int number = scan.nextInt();
        System.out.println("provide double: ");
        double numberD = scan.nextDouble();
        System.out.println("provide String: ");
        String t1 = scan.next();
        String t2 = scan.nextLine();
        //scan.hasNext();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + number);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + numberD);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + " " + t1 + t2);

        scan.close();
    }
}

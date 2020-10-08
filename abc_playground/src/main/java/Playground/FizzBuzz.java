package Playground;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        String f = "Fizz";
        String b = "Buzz";
        String n = "Nope, try again";

        System.out.println(" ");
        System.out.println("***   Hi, Welcome to my FizzBuzz   ***");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type Your number ---> to stop type \"not a number\"");

        while (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number % 3 == 0 && number % 5 == 0)
                System.out.println(f + b);
            else if (number % 3 == 0)
                System.out.println(f);
            else if (number % 5 == 0)
                System.out.println(b);
            else
                System.out.println(n);
        }
        sc.close();
        System.out.println("Bye!");
    }
}


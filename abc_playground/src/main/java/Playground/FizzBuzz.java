package Playground;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        String key = "a";
        String F = "Fizz";
        String B = "Buzz";
        System.out.println("Please type number to close press x");
        Scanner sc = new Scanner(System.in);

        while (!key.equalsIgnoreCase("x")) {
            int number = sc.nextInt();

            if (number % 3 == 0 && number % 5 == 0)
                System.out.println(F + B);
            else if (number % 3 == 0)
                System.out.println(F);
            else if (number % 5 == 0)
                System.out.println(B);
            else
                System.out.println("Nope, try again");

            System.out.println("Press any key to continue, or close by pressing x");
            key = sc.nextLine();
        }
        System.out.println("Bye!");
    }
}

package a30DayExamples.Day17ExceptionsPt2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 80.1;
    public static final double tooCold = 71.1;

    public static void drinkHotChocolate(double cocoaTemp) throws TooColdException, TooHotException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();

        double currentCocoaTemp = d;
        boolean wrongTemp = true;
//        if (currentCocoaTemp <= tooHot && currentCocoaTemp >= tooCold)
//            wrongTemp = true;
//        else wrongTemp = false;

        while (wrongTemp) {
            System.out.println(currentCocoaTemp);
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("Good stuff to drink");
                wrongTemp=false;
            } catch (TooHotException e1) {
                System.out.println("Too Hot!");
                currentCocoaTemp = currentCocoaTemp - 1;
            } catch (TooColdException e2) {
                System.out.println("Too Cold!");
                currentCocoaTemp = currentCocoaTemp + 1;
            }
            TimeUnit.SECONDS.sleep(2);

        }
        System.out.println("it's gone...");
        scanner.close();
    }
}

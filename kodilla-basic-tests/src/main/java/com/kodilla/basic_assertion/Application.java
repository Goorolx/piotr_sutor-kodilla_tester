package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda działa poprawnie dla "+a+" + "+b);
        }
        else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.subtract(a,b);
        boolean subCorrect = ResultChecker.assertEquals(-3,subResult);
        if (subCorrect) {
            System.out.println("Metoda działa poprawnie dla "+a+" - "+b);
        }
        else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int sqResult = calculator.square(b);
        boolean sqCorrect = ResultChecker.assertEquals(64, sqResult);
        if (sqCorrect){
            System.out.println("Metoda działa poprawnie dla "+b+" ^2");
        }
        else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + b + "^2");
        }

    }

}

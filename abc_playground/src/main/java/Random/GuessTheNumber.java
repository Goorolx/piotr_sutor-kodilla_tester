package Random;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int max=100;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        this.theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        while (true){
        int move = scanner.nextInt();
        if (move > theNumber) {
            System.out.println("your number is too big");
        }
        else if (move < theNumber) {
            System.out.println("your number is too small");
        } else {
            System.out.println("You Got IT BRO!");
            break;
        }
    }}

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else
            System.out.println("Our number is out of range");
    }

    public static void main(String[] args) {
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome, type number between 0-100");
        guessGame.play();
    }
}

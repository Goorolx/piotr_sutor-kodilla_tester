package a30DaysOfCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6 {
    private Scanner scanner = new Scanner(System.in);
    List<String> words = new ArrayList<>();
    private int t;


    public void enterWords() {
        System.out.println("Ok i need " + t + " words now, wite the first one: ");
        for (int i = 0; i < t; i++) {
            words.add(scanner.next());
            System.out.println("give me " + (i + 2) + " one: ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        }
    }

    public void mixer() {
        for (int j = 0; j < words.size(); j++) {
    String w = words.get(j);
    String odd = "";
    String even = "";
    for (int n=0;n<w.length();n++)
    if (n%2==0)
        odd+=w.charAt(n);
    else
        even+=w.charAt(n);
            System.out.println(even+" "+odd);
        }
    }

    public int getT() {
        return t;
    }

    public void setT() {
        System.out.println("how many words? put number here: ");
        this.t = scanner.nextInt();
    }

    public static void main(String[] args) {
        Day6 words = new Day6();
        words.setT();
        words.enterWords();
        System.out.println(words);
        words.mixer();
    }


    @Override
    public String toString() {
        return "Day6{" +
                "words=" + words +
                '}';
    }
}

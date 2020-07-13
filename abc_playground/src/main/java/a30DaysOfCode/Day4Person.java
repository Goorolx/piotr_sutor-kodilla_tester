package a30DaysOfCode;

import java.util.*;

public class Day4Person {
    private int age;

    public Day4Person(int initialAge) {
        if (initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else {
            this.age=initialAge;
        }
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }

    public void amIOld() {
        if (getAge()<13){
            System.out.println("You are young.");
        }
        else if (getAge()>=13 && getAge()<18){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }}

    public void yearPasses() {
        setAge(getAge()+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4Person p = new Day4Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
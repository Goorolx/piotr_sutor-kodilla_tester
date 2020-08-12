package a30DayExamples.Day20PointersEnumsAliases;

import static a30DayExamples.Day20PointersEnumsAliases.HairColour.*;

public class Person {
    HairColour hairColor = BLOND;

    public Person(){}

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        peterParker.hairColor=BROWN;
        spiderMan.hairColor=BLOND;

        System.out.println("Peter hair " + peterParker.hairColor);
        System.out.println("Spiderman " +spiderMan.hairColor);
    }
}

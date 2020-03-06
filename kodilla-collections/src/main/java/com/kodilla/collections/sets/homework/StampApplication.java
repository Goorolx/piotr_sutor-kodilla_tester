package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Poczta Polska", "2x3",true));
        stamps.add(new Stamp("Deutche Post","3x3", false));
        stamps.add(new Stamp("US Postal","4x2", false));
        stamps.add(new Stamp("Poczta Polska","4x6",true));
        stamps.add(new Stamp("Poczta Polska","2x3",true));
        stamps.add(new Stamp("Poczta polska", "2x3",true));
        stamps.add(new Stamp("US Postal","4x2", false));
        stamps.add(new Stamp("Deutche Post","3x3", false));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
                         System.out.println(stamp);


    }
}

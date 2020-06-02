package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student,Grades> school = new HashMap<>();

        Student john = new Student("John","Johnson");
        Student bart = new Student("Bart","Simpson");
        Student jessie = new Student("Jessie","Pinkman");

        Grades johnGrades = new Grades(5.0,4.0,3.0,2.0);
        Grades jessieGrades = new Grades(5.0,5.0,5.0,5.0);
        Grades bartGrades = new Grades(3.0,3.5,2.5,3.5);

        school.put(john,johnGrades);
        school.put(jessie,jessieGrades);
        school.put(bart,bartGrades);

        System.out.println(school.get(john));

        for (Map.Entry<Student,Grades> studentEntry : school.entrySet())
            System.out.println(studentEntry.getKey().getFirstname()+" average is " +studentEntry.getValue().getAverage());
    }
}

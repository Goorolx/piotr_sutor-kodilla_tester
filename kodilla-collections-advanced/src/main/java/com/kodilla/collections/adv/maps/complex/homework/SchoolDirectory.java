package com.kodilla.collections.adv.maps.complex.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> school = new HashMap<>();

        Principal john = new Principal("John","Doe");
        Principal jane = new Principal("Jane","Deer");
        Principal joseph = new Principal("Joseph","Conrad");

        School johnSchool = new School(23,19,27,30,21,25,21,19);
        School janeSchool = new School(19,18,17,16,15,14,13,12);
        School josephSchool = new School(21,22,23,24,25,26,27,28);

        school.put(john,johnSchool);
        school.put(jane,janeSchool);
        school.put(joseph,josephSchool);

        for (Map.Entry<Principal,School> schoolEntry : school.entrySet()){
            System.out.println(schoolEntry.getKey().getFirstName()+" "+schoolEntry.getKey().getLastName()
                    +" is the Principal of school with " +schoolEntry.getValue().getStudentsCount()+ " pupils");
        }
    }
}

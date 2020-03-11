package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> schoolClass = new ArrayList<>();

    public School(Integer ... schoolClass) {
        for (int student : schoolClass) {
            this.schoolClass.add(student);
        }
    }

    public int getStudentsCount() {
        int sum = 0;
        for (int a : schoolClass)
        {sum += a; }
        return sum;
    }
}

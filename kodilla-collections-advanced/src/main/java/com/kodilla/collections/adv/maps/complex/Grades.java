package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(Double ... grades) {            //specjalny konstruktor otwarty
        for (Double grade : grades)
            this.grades.add(grade);
    }
    public double getAverage(){
        double sum=0.0;
        for (double grade :grades)
            sum += grade;
            return sum/grades.size();
        }

    }



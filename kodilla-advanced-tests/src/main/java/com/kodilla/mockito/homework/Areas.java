package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Areas {
    private Set<String> areas = new HashSet<>();

    public Areas(String... areas) {            //specjalny konstruktor otwarty
        for (String area : areas)
            this.areas.add(area);
    }

    public void addArea(String area) {
        areas.add(area);
    }

    public void removeArea(String area) {
        this.areas.remove(area);
    }

    public Set<String> getAreas() {
        return areas;
    }
    public boolean containsArea(String area) {
//        boolean cA=false;
//        for (String a : areas)
//            if (a.equals(area))
//                cA= true;
//            else
//                cA = false;
            return areas.contains(area);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Areas areas1 = (Areas) o;
        return Objects.equals(areas, areas1.areas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areas);
    }

    @Override
    public String toString() {
        return "Areas{" +
                "areas=" + areas +
                '}';
    }

    public void removeAll() {
        for (String area : areas
        ) {
            this.areas.remove(area);
        }
    }
}

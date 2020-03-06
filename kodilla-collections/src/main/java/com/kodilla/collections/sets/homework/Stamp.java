package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String dimensions;
    private boolean stamped;


    public Stamp(String stampName,String dimensions,boolean stamped) {
        this.stampName = stampName;
        this.dimensions = dimensions;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stamped == stamp.stamped &&
                stampName.equals(stamp.stampName) &&
                dimensions.equals(stamp.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, dimensions, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}

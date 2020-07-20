package a30DaysOfCode.Day14Scope;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference() {
        int aMax = 0;
        for (int i=0; i<elements.length; i++) {
            int a;
            for (int j=0; j< elements.length; j++) {
                a = Math.abs(elements[i] - elements[j]);
                if (a > aMax)
                    aMax = a;
            }
        }
        return maximumDifference = aMax;
    }

}
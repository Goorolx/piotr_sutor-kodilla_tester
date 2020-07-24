package a30DaysOfCode.Day17ExceptionsPt2;

public class Calculator {

    public Calculator() {
    }


    public int power(int n, int p) throws ShouldBeNonNegativeException {
        if (n < 0 || p < 0)
            throw new ShouldBeNonNegativeException();

        double re = Math.pow(n, p);
        Integer result = (int) re;

        return result;

    }
}

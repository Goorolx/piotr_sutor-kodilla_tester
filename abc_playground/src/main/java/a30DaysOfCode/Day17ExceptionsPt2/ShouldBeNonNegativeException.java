package a30DaysOfCode.Day17ExceptionsPt2;

public class ShouldBeNonNegativeException extends Exception{

    @Override
    public String getMessage() {
        return "n and p should be non-negative";
    }
}

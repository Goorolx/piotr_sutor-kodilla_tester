package a30DayExamples.Day16Exceptions;

public class ExceptionsPractice {
    public static void main(String[] args) {
        try {
            int[] c = new int[6];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } catch (ArithmeticException e1){
            System.out.println("Exception "+e1);
        }
        finally {
            System.out.println("Finally finished try-catch");
        }
    }
}

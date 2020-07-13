package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;
        assertEquals(5, calc.subtract(a, b));
    }
    @Test
    public void testSquare(){
        Calculator calc = new Calculator();
        int a=2;
        int b=4;
        assertEquals(b,calc.square(a));
    }

}

package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void shouldReturnCorrectValueAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(1,2);
        assertEquals(3,value,0.1);
    }
    @Test
    public void shouldReturnCorrectValueSubtract(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(3,2);
        assertEquals(1,value,0.1);
    }

    @Test
    public void shouldReturnCorrectValueMultiply(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(30,20);
        assertEquals(600,value,0.1);
    }
    @Test
    public void shouldReturnCorrectValueDivide(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(40,20);
        assertEquals(2,value,0.1);
    }

}
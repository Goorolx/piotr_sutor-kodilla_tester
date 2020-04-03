package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class InputPerson {

    public static Stream<Arguments> provideGoodPersonDataForBmi(){
        return Stream.of(
                Arguments.of(new Person(1.8,45),"Very severely underweight"),
                Arguments.of(new Person(1.8,55),"Underweight"),
                Arguments.of(new Person(1.8,70),"Normal (healthy weight)"),
                Arguments.of(new Person(1.7,80),"Overweight"),
                Arguments.of(new Person(1.7,150),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.7,250),"Obese Class VI (Hyper Obese)"));
    }



    }


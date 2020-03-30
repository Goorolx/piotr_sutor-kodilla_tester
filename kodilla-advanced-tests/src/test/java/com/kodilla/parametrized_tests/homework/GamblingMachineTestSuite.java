package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbers.csv", numLinesToSkip = 1, delimiter = '.')
    public void ShouldReturnTrueWhen6Numbers(String input) throws InvalidNumbersException {
        //given
        Set<Integer> numbers = new HashSet<>();
        String[] a = input.split(",");
       //when
        for (String n : a) {
            Integer i = Integer.valueOf(n);
            numbers.add(i); }
        //then
        assertTrue(gamblingMachine.howManyWins(numbers)<=6);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbersWrong.csv", numLinesToSkip = 1, delimiter = '.')
    public void ShouldThrowExceptionWhenLessThan6NumbersOrWrong(String input) throws InvalidNumbersException {
        //given
        Set<Integer> numbers = new HashSet<>();
        String[] a = input.split(",");
        //when
        for (String n : a) {
            Integer i = Integer.valueOf(n);
            numbers.add(i); }
        System.out.println(numbers);
        //then
        assertThrows(InvalidNumbersException.class , ()->gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest//(expected = new InvalidNumbersException())
    @NullSource  //Nie umiałem dogadać sie z Integerem dla EmptySource
    public void ShouldThrowExceptionWhenNull(Integer input) throws InvalidNumbersException {
        //given
        Set<Integer> numbers = new HashSet<>();
        numbers.add(input);
        System.out.println(input);
        //then
        assertThrows(InvalidNumbersException.class , ()->gamblingMachine.howManyWins(numbers));
    }


    }


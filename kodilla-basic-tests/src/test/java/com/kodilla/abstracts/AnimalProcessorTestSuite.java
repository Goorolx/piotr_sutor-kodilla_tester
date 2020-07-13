package com.kodilla.abstracts;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalProcessorTestSuite {

    @Test
    public void shouldGiveCorrectVoiceDuck() {
        //given
        AnimalProcessor a = new AnimalProcessor();
        Animal duck = new Duck();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        //when
        a.process(duck);
        //then
        assertTrue(outContent.toString().contains("Kwa"));
        assertTrue(outContent.toString().contains("2 legs"));
        //cleanup
        System.setOut(originalOut);
    }

    @Test
    public void shouldGiveCorrectVoiceDog() {
        //given
        AnimalProcessor a = new AnimalProcessor();
        Animal dog = new Dog();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        //when
        a.process(dog);

        //then
        assertTrue(outContent.toString().contains("Woof"));
        assertTrue(outContent.toString().contains("4 legs"));
        //cleanup
        System.setOut(originalOut);
    }
}
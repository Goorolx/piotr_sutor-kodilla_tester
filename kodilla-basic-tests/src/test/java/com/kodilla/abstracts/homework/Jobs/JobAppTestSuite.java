package com.kodilla.abstracts.homework.Jobs;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JobAppTestSuite {
    @Test
    public void shouldGiveCorrectJobs() {
        //given
        JobProcessor a = new JobProcessor();
        Person j1 = new Person("Hans",32,new Cook());
        Person j2 = new Person("John",33,new Waiter());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        //when
        a.process(j1.getJob());
        //then
        assertTrue(outContent.toString().contains("cooking some food"));

        //when
        a.process(j2.getJob());
        //then
        assertTrue(outContent.toString().contains("waiting tables"));

        //cleanup
        System.setOut(originalOut);
    }

}
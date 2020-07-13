package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InheritOneTestSuite {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    @BeforeEach
    public void setOutContent() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void setOriginalOut() {
        System.setOut(originalOut);
    }

    @Test
    void turnOn() {
        InheritOne io = new InheritOne(2020);
        io.turnOn();

        assertTrue(outContent.toString().contains("2020 - System is ON"));

    }

    @Test
    void turnOff() {
        InheritOne io = new InheritOne(2002);
        io.turnOff();

        assertTrue(outContent.toString().contains("2002 - System is OFF"));
    }

    @Test
    void getReleaseYear() {
        InheritOne io = new InheritOne(1909);

        assertEquals(1909, io.getReleaseYear());
    }

    @Test
    void displaySystemYear() {
        InheritOne io = new InheritOne(2000);
        io.displaySystemYear();

        assertTrue(outContent.toString().contains("in 2000"));
    }


}


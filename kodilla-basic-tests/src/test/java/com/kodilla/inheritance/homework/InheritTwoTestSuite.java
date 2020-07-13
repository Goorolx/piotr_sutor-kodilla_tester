package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InheritTwoTestSuite {

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
        InheritTwo it = new InheritTwo(2020);
        it.turnOn();

        assertTrue(outContent.toString().contains("2020 - System is ON"));

    }

    @Test
    void turnOff() {
        InheritTwo it = new InheritTwo(2002);
        it.turnOff();

        assertTrue(outContent.toString().contains("2002 - System is OFF"));
    }

    @Test
    void getReleaseYear() {
        InheritTwo it = new InheritTwo(1909);

        assertEquals(1909, it.getReleaseYear());
    }

    @Test
    void displaySystemYear() {
        InheritTwo it = new InheritTwo(2000);
        it.displaySystemYear();

        assertTrue(outContent.toString().contains("in 2000"));
    }


}




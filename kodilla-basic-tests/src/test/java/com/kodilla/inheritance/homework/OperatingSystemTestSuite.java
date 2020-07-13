package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OperatingSystemTestSuite {

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
        OperatingSystem os = new OperatingSystem(1999);
        os.turnOn();

        assertTrue(outContent.toString().contains("ON"));

    }

    @Test
    void turnOff() {
        OperatingSystem os = new OperatingSystem(1999);
        os.turnOff();

        assertTrue(outContent.toString().contains("OFF"));
    }

    @Test
    void getReleaseYear() {
        OperatingSystem os = new OperatingSystem(1999);

        assertEquals(1999, os.getReleaseYear());
    }

    @Test
    void displaySystemStatus() {
        OperatingSystem os = new OperatingSystem(2000);
        os.displaySystemStatus();

        assertTrue(outContent.toString().contains("2000"));
    }


}
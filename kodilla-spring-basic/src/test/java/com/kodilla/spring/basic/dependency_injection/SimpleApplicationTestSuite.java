package com.kodilla.spring.basic.dependency_injection;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;


class SimpleApplicationTestSuite {

    @Test
    public void shouldSendMessages() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        //given
        MessageService fms = new FacebookMessageService();
        MessageService ems = new EmailMessageService();
        MessageService sms = new SkypeMessageService();
        MessageService tms = new TextMessageService();

        SimpleApplication saF = new SimpleApplication(fms);

        SimpleApplication saE = new SimpleApplication(ems);
        SimpleApplication saS = new SimpleApplication(sms);
        SimpleApplication saT = new SimpleApplication(tms);
        //when
        saF.processMessage("test Facebook", "John");
        assertTrue(outContent.toString().contains("test Facebook"));

        saE.processMessage("test Email", "Jan");
        assertTrue(outContent.toString().contains("st Email"));


        saS.processMessage("test Skype", "Kim");
        assertTrue(outContent.toString().contains("st Skype"));

        saT.processMessage("Test Text", "Ann");
        assertTrue(outContent.toString().contains("st Text"));
        //then




        System.setOut(originalOut);
    }

}
package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldReturnLocalDateNow() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        firstBean.getTime();
        Assertions.assertNotNull(firstBean);
    }

    @Test
    public void shouldReturn2LocalDatesDifferent() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        LocalDateTime time1 = firstBean.getTime();
        TimeUnit.SECONDS.sleep(3);
        Clock secondBean = context.getBean(Clock.class);
        LocalDateTime time2 = secondBean.getTime();
        System.out.println(time1 +"  <  "+time2);
        assertTrue(time1.isBefore(time2));
    }
}
package com.kodilla.abstracts.homework.Jobs;

public class JobProcessor {
    public void process(Job job) {
        System.out.println("His job is " + job.getResponsibilities());
        job.giveOverview();
    }
    }


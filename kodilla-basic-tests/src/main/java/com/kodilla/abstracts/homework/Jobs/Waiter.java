package com.kodilla.abstracts.homework.Jobs;

public class Waiter extends Job {
    public Waiter() {
        super(40000, "waiting tables");
    }

    @Override
    public void giveOverview() {
        System.out.println(this.getClass().getSimpleName() + " is earning " + getSalary() + " for " + getResponsibilities());
    }
}

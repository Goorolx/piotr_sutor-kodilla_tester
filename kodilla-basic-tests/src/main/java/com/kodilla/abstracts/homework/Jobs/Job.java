package com.kodilla.abstracts.homework.Jobs;

public abstract class Job {
    int salary;
    String responsibilities;

    public Job (int salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
    public int getSalary() {
        return salary;
    }

    public abstract void giveOverview();

}


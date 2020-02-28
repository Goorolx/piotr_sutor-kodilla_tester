package com.kodilla.abstracts.homework.Jobs;

public class Cook extends Job {
    public Cook () {
    super (50000, "cooking some food");}

@Override
    public void giveOverview() {
    System.out.println(this.getClass().getSimpleName()+" is earning "+getSalary()+" for "+getResponsibilities());
}
}

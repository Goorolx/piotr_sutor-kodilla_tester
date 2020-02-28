package com.kodilla.abstracts.homework.Jobs;

public class JobApp {
    public static void main(String[] args) {

        JobProcessor processor = new JobProcessor();

        Job cook = new Cook();
        //processor.process(cook);

        Job waiter = new Waiter();
        //processor.process(waiter);

        Person person1 = new Person("Hans",31,"Waiter");
        String pJob = person1.getJob();
        if (pJob.equals("Cook")){
            processor.process(cook);}
        else if (pJob.equals("Waiter")){
            processor.process(waiter);}
        else {
            System.out.println(person1.getFirstName()+" - Age: " + person1.getAge()+" - I have no idea what this person is doing");
        }
    }
}

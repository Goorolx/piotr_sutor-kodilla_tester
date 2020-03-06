package com.kodilla.abstracts.homework.Jobs;

public class JobApp {
    public static void main(String[] args) {

        JobProcessor processor = new JobProcessor();

        Job cook = new Cook();
        //processor.process(cook);

        Job waiter = new Waiter();
        //processor.process(waiter);

        Person person1 = new Person("Hans",32,cook);
        Job pJob = person1.getJob();
        System.out.println("This person is "+person1.getFirstName());
        if (pJob.equals(cook)){
            processor.process(cook);}
        else if (pJob.equals(waiter)){
            processor.process(waiter);}
        else {
            System.out.println(person1.getFirstName()+" - Age: " + person1.getAge()+" - I have no idea what this person is doing");
        }
    }
}

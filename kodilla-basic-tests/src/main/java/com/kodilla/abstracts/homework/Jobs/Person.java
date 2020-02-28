package com.kodilla.abstracts.homework.Jobs;

public class Person{

    String firstName;
    int age;
    String job;

    public Person (String firstName,int age,String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getJob() {
        return job;
    }



}


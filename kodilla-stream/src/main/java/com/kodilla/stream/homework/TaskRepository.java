package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Cleaning", LocalDate.now(),LocalDate.of(2020,04,01)));
        tasks.add(new Task("brushing",LocalDate.of(2020,02,01),LocalDate.of(2020,04,01)));
        tasks.add(new Task("Fire fighting",LocalDate.of(2018,01,01),LocalDate.of(2019,12,31)));
        tasks.add(new Task("Cooking", LocalDate.now(),LocalDate.of(2020,03,20)));
        return tasks;
    }
}

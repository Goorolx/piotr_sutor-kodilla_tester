package com.kodilla.stream.homework;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> notOverdue = TaskRepository.getTasks()
       // List<LocalDate> deadline = new ArrayList<>()
                .stream()
                .filter(t -> t.getDeadline().isAfter(LocalDate.now()))
                .map(d -> d.getDeadline())
                .collect(Collectors.toList());
        System.out.println(notOverdue);

    }
}

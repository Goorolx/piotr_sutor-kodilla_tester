package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Rambo", new Teacher("John Dude")));
        students.add(new Student("Jack Slater",null));
        students.add(new Student("John Matrix",new Teacher("Boris Johnson")));
        students.add(new Student("Jenny Matrix",null));


        for (Student student : students
             ) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println(optionalTeacher.orElse(new Teacher("<Undefined>")).getName());
        }
    }
}

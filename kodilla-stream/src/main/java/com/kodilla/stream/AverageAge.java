package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
     double avg = UserRepository.getUserList()
                .stream()
                .map(u->u.getAge())
                .mapToInt(n->n)
                .average()
                .getAsDouble();
        System.out.println(avg);


    }
}

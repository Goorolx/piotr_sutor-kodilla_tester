package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostLessThan40 = UserRepository.getUserList()
                .stream()
                .filter(u->u.getAge()<40)
                .map(un->un.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .getAsDouble();
        System.out.println(avgPostLessThan40);

    double avgPostMoreThan40 = UserRepository.getUserList()
            .stream()
            .filter(u->u.getAge()>=40)
            .map(un->un.getNumberOfPosts())
            .mapToInt(n->n)
            .average()
            .getAsDouble();
        System.out.println(avgPostMoreThan40);
}
}

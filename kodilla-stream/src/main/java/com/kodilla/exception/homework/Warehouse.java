package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private String name;

    public Warehouse(String name) {
        this.name = name;
    }

    List<Order> orders = new ArrayList<>();

    public Order addOrder(Order order) {
        orders.add(order);
        return order;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()

                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                .orElseThrow(()-> new OrderDoesntExistException());

        //Order las= or.get(0);
        //return or;

    }
//    @Override
//    public String toString() {
//        return "Warehouse{" +
//                "name='" + name + '\'' +
//                ", orders=" + orders +
//                '}';
//    }
}



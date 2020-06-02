package com.kodilla.collections.sets;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("2019-01","Iron",1));
        orders.add(new Order("2020-01","Fork",3));
        orders.add(new Order("2020-01","knife",5));
        orders.add(new Order("2019-01","Iron",1));

        System.out.println(orders.size());
        for (Order order : orders)
        System.out.println(order);

    }

}

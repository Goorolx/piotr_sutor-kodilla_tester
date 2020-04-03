package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) throws WrongOrderException {
        orders.add(order);
    }

    public int getCount() {
        return orders.size();
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Order o : orders
        ) {
            totalValue += o.getValue();
        }
        return totalValue;
    }

    public Set<Order> last2YearsOrders() {
        return orders.stream()
                .filter(u -> u.getDate().isAfter(LocalDate.now().minusYears(2)))
                .collect(Collectors.toSet());
    }

    public Set<Order> filterOrdersDate(LocalDate dateFrom, LocalDate dateTo) {
        if (dateFrom.isAfter(dateTo)) {
            return orders.stream()
                    .filter(u -> !u.getDate().isAfter(dateFrom))
                    .filter(i -> !i.getDate().isBefore(dateTo))
                    .collect(Collectors.toSet());
        } else
            return orders.stream()
                    .filter(u -> !u.getDate().isAfter(dateTo))
                    .filter(i -> !i.getDate().isBefore(dateFrom))
                    .collect(Collectors.toSet());

    }
}

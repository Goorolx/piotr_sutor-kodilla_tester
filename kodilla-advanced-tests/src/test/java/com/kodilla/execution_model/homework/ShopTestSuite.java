package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order o1 = new Order(9, LocalDate.of(2017, 01, 01), "gumior");
    Order o2 = new Order(10, LocalDate.of(2018, 04, 03), "czesio");
    Order o3 = new Order(3.5, LocalDate.of(2018, 04, 04), "longin");
    Order o4 = new Order(4.5, LocalDate.of(2018, 04, 05), "Humpback");
    Order o5 = new Order(5, LocalDate.of(2020, 02, 02), "koziol");
    Order o6 = new Order(6, LocalDate.of(2020, 02, 03), "tricky");

    @Test
    public void shouldAddSixOrders() {
        assertEquals(6, shop.getCount());
    }

    @Test
    public void shouldReturn7Orders() throws WrongOrderException {
        //when
        shop.addOrder(new Order(12, LocalDate.parse("2020-01-01"), "zbychu"));
        //then
        assertEquals(7, shop.getCount());
    }

    @Test
    public void shouldReturnLonginsOrder() {
        //when
        Optional oLongin = shop.orders.stream().filter(u -> u.equals(o3)).findFirst();
        //then
        assertEquals(o3, oLongin.get());
    }

    @Test
    public void shouldNotReturnException() throws WrongOrderException {
        assertDoesNotThrow(() -> shop.addOrder(new Order(0, LocalDate.parse("2020-01-01"), "")));
    }

    @Test
    public void shouldReturnOrdersFromLast2Years() {
        //when
        Set<Order> orders2Years = shop.last2YearsOrders();
        Set<Order> my2YrList = new HashSet<>();
        my2YrList.add(o6);
        my2YrList.add(o5);
        my2YrList.add(o4);
        my2YrList.add(o3);
        //then
        assertEquals(orders2Years, my2YrList);
    }

    @Test
    public void shouldReturnGoodDateFilteredOrders() {
        //when
        Set<Order> filteredOrders = shop.filterOrdersDate(LocalDate.of(2018, 04, 05),
                LocalDate.of(2020, 02, 02));
        Set<Order> myFilteredSet = new HashSet<>();
        myFilteredSet.add(o4);
        myFilteredSet.add(o5);

        //then
        assertEquals(filteredOrders, myFilteredSet);
    }

    @Test
    public void shouldReturnGoodOrdersFlippedDatesProvided() {
        //when
        Set<Order> filteredOrders = shop.filterOrdersDate(LocalDate.of(2020, 02, 02),
                LocalDate.of(2018, 04, 05));
        Set<Order> myFilteredSet = new HashSet<>();
        myFilteredSet.add(o4);
        myFilteredSet.add(o5);
        //then
        assertEquals(filteredOrders, myFilteredSet);
    }

    @Test
    public void shouldCalculateCorrectTotalValue() {
        assertEquals(38, shop.getTotalValue());
    }

    @BeforeEach
    public void InitializeOrders() throws WrongOrderException {
        shop.addOrder(o1);
        shop.addOrder(o2);
        shop.addOrder(o3);
        shop.addOrder(o4);
        shop.addOrder(o5);
        shop.addOrder(o6);
    }
}
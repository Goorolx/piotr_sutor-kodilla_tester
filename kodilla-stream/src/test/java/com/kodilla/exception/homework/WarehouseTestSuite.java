package com.kodilla.exception.homework;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.junit.Test;
import static org.junit.Assert.*;

public class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse("magazyn");
    Order o1 = warehouse.addOrder(new Order("as1234"));
    Order o2 = warehouse.addOrder(new Order("as3456"));

    @Test
    public void shouldReturnTrueWhenExists() throws OrderDoesntExistException {
        //gives
        Order o = o1;
        //when
        Order a = warehouse.getOrder("as1234");
        //then
        assertEquals(a,o);}

    @Test(expected = OrderDoesntExistException.class)
    public void shouldReturnFalseWhenOrderDontExists() throws OrderDoesntExistException {
        //gives
        Order o = o1;
        //when
        Order a = warehouse.getOrder("as123");
        //then
        assertEquals(a,o);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void shouldReturnFalseWhenOrderEmpty() throws OrderDoesntExistException {
        //gives
        Order o = o1;
        //when
        Order a = warehouse.getOrder("");
        //then
        assertEquals(a,o);
    }

}


package com.kodilla.exception.homework;

import sun.text.resources.cldr.ext.FormatData_ti_ER;

import java.util.Optional;

public class WarehouseApp{
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse("1");
        warehouse.addOrder(new Order("ab001"));
        warehouse.addOrder(new Order("ab002"));
        warehouse.addOrder(new Order("ab003"));
        warehouse.addOrder(new Order("ab004"));

        System.out.println( warehouse.getOrder("ab00"));
        System.out.println( warehouse.getOrder("ab004"));

    }
}

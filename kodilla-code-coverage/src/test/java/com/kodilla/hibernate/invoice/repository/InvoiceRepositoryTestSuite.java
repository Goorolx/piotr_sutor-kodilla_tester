package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave() {
        //given
        Product p1 = new Product("buty");
        Product p2 = new Product("czapka");
        BigDecimal i1Price = new BigDecimal("120");
        BigDecimal i2Price = new BigDecimal("60");
        Item i1 = new Item(p1, i1Price, 2, i1Price.multiply(BigDecimal.valueOf(2)));
        Item i2 = new Item(p2, i2Price, 1, i2Price);
        List<Item> itemList1 = new ArrayList<>();
        List<Item> itemList2 = new ArrayList<>();
        itemList1.add(i1);
        itemList2.add(i2);
        p1.setItems(itemList1);
        p2.setItems(itemList2);
        Invoice invoice = new Invoice("2020-01");
        List<Item> invoiceItems = new ArrayList<>();
        invoiceItems.add(i1);
        invoiceItems.add(i2);
        invoice.setItems(invoiceItems);


        //when
        invoiceRepository.save(invoice);
        int id = invoice.getId();
        System.out.println(id);
        List<Item> iz = invoice.getItems();
        System.out.println(iz.get(1).toString());
        //then
        Assert.assertNotEquals(0, id);

        //cleanup
        invoiceRepository.deleteById(id);
    }

}
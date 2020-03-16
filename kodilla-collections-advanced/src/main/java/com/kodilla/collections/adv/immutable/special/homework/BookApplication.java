package com.kodilla.collections.adv.immutable.special.homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BookApplication {

    public static void main(String[] args) {

        Book book1 = BookManager.createBook("Ksiazka","Kucharska");
        Book book2 = BookManager.createBook("War&Peace", "Tolstoy");
        Book book3 = BookManager.createBook("Witcher","Sapkowski");

        Book book4 = BookManager.createBook("Witcher","Sapkowski");

        BookManager.addBook(book1);
        BookManager.addBook(book2);
        BookManager.addBook(book3);
        BookManager.addBook(book4);

        System.out.println("collection size is "+BookManager.books.size());

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));

        System.out.println(BookManager.books.get(0).hashCode());

        System.out.println(book1.equals(BookManager.books.get(0)));
        System.out.println(book2.equals(BookManager.books.get(1)));
        System.out.println(book3.equals(BookManager.books.get(2)));
    }
}

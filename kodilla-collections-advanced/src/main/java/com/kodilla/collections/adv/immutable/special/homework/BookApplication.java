package com.kodilla.collections.adv.immutable.special.homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BookApplication {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager("library");

        Book book1 = bookManager.createBook("Ksiazka","Kucharska");
        Book book2 = bookManager.createBook("War&Peace", "Tolstoy");
        Book book3 = bookManager.createBook("Witcher","Sapkowski");

        Book book4 = bookManager.createBook("Witcher","Sapkowski");

        bookManager.addBook(book1);
        bookManager.addBook(book2);
        bookManager.addBook(book3);
        bookManager.addBook(book4);

        System.out.println("collection size is "+bookManager.books.size());

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));


        List<Book> bookList = new ArrayList ();
        for (Book book : bookManager.getBooks()
        ) {bookList.add(book); }

        System.out.println(bookList);
        System.out.println(book1.equals(bookList.get(0)));
        System.out.println(book1.equals(bookList.get(1)));
        System.out.println(book1.equals(bookList.get(2)));

        System.out.println(book2.equals(bookList.get(0)));
        System.out.println(book2.equals(bookList.get(1)));
        System.out.println(book2.equals(bookList.get(2)));
    }
}

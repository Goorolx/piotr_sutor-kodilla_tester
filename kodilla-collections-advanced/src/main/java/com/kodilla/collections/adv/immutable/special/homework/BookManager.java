package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static Book createBook(String title, String author){
            return new Book(title, author);
                }

    static List<Book> books = new ArrayList<>();

    public static void addBook(Book book){
        if (books.size()==0 ){
        books.add(book);
        System.out.println(book + " successfully added");}
        else
            checkBookList(book);
        }

    public static void checkBookList(Book book) {
        boolean bookChk = false;
        for (Book b : books) {
            bookChk = b.equals(book) ;}
        if (bookChk)
            System.out.println("Book already exists"+book);
        else{
            books.add(book);
            System.out.println(book + " successfully added");
        }
    }


    @Override
    public String toString() {
        return "BookManager{" +
                "books=" + books +
                '}';
    }
}

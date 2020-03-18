package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookManager {
    private String library;

    public BookManager(String library) {
        this.library = library;
    }

    public Book createBook(String title, String author){
            return new Book(title, author);
                }

   Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        if (books.size() == 0) {
            books.add(book);
        } else {
            boolean duplicate = true;
            for (Book b : books) {
                duplicate = b.equals(book);
                if (duplicate) {
                    System.out.println("Book already exists " + book);
                }
            }
            books.add(book);
        }
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "books=" + books +
                '}';
    }
}

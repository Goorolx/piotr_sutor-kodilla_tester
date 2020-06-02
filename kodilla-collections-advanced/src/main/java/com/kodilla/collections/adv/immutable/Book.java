package com.kodilla.collections.adv.immutable;

public class  Book {
    protected final String author;
    protected final String title;

    public Book (String author, String title){
        this.title = title;
        this.author = author;
    }

    public final String getAuthor() {
        return author;
    }

    public final String getTitle() {
        return title;
    }
}

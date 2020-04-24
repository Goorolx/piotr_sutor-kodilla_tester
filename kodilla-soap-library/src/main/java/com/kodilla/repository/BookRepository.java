package com.kodilla.repository;

import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book lotr = new Book();
        lotr.setSignature("001");
        lotr.setAuthor("J.R.R. Tolkien");
        lotr.setTitle("Lord of the rings");
        lotr.setGenre(Genre.FANTASY);
        lotr.setPublished(1982);

        books.put("001", lotr);

        Book whatever = new Book();
        lotr.setSignature("002");
        lotr.setAuthor("Random Author");
        lotr.setTitle("Random title");
        lotr.setGenre(Genre.SCI_FI);
        lotr.setPublished(1984);

        books.put("002",whatever);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the book's signature");
        return books.get(signature);
    }
}
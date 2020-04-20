package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BookControllerTestSuite {


    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("title1", "author1"));
        bookList.add(new BookDto("title2", "author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when

        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }
    @Test
    public void shouldAddThreeBooks(){
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> books = new ArrayList<>();

        BookDto book1 = new BookDto("title1","Author1");
        BookDto book2 = new BookDto("title2","Author2");
        BookDto book3 = new BookDto("title3","Author2");

        Mockito.when(bookServiceMock.addBook(book1)).then(books.add(book1));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(books);
        //when
        List<BookDto> booksList = new ArrayList<>();
                bookController.addBook(book1);
                bookController.addBook(book2);
                bookController.addBook(book3);
           //then
        assertThat(booksList).hasSize(3);

    }

}
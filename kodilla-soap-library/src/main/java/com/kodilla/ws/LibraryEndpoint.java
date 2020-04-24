package com.kodilla.ws;

import com.kodilla.courses.soap.GetLibraryRequest;
import com.kodilla.courses.soap.GetLibraryResponse;

import com.kodilla.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LibraryEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/courses/soap";

    private BookRepository bookRepository;

    @Autowired
    public LibraryEndpoint(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLibraryRequest")
    @ResponsePayload
    public GetLibraryResponse getBook(@RequestPayload GetLibraryRequest request) {
        GetLibraryResponse response = new GetLibraryResponse();
        response.setBook(bookRepository.findBook(request.getSignature()));

        return response;
    }
}
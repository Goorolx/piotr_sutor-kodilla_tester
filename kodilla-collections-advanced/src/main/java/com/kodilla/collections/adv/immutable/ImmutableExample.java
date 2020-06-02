package com.kodilla.collections.adv.immutable;

import com.sun.imageio.plugins.jpeg.JPEGStreamMetadataFormat;

public interface ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("John Stewart","The Last Chance");

        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("newTitle");
        System.out.println(book.getTitle());
    }

}

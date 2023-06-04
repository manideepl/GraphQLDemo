package com.manideepla.graphqldemo;

import java.util.Arrays;
import java.util.List;

public record Book(String id, String name, int pageCount, String authorId) {

    private static List<Book> books = Arrays.asList(

        new Book("book-1", "Men without women", 312, "author-1"),
        new Book("book-2", "Fantastic beasts and where to find them", 223, "author-2"),   
        new Book("book-3", "The Guide", 156 ,"author-3")
    );

    public static Book bookById(String id) {
        return books.stream().filter(book -> book.id.equals(id)).findFirst().orElse(null);
    }
}

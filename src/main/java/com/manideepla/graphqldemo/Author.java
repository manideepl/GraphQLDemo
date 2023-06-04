package com.manideepla.graphqldemo;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String firstName, String lastName) {

    private static List<Author> authors = Arrays.asList(
        new Author("author-1", "Murakami", ""),
        new Author("author-2", "J.K.", "Rowling"),
        new Author("author-3", "R.K.", "Narayan")
    ); 

    public static Author authorById(String id) {
       return authors.stream().filter(author -> author.id.equals(id)).findFirst().orElse(null);
    }
}

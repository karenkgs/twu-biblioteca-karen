package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookFactory {

    public static List<Book> books() {
        final List<Book> books = new ArrayList<>(Arrays.asList(new Book("TDD By Example")));

        return books;
    }
}
